#!/usr/bin/awk -f 
## #############################################################
## Generates Token Ring HDDI n
## #############################################################
## writes files
##  hddi_input_XX.ta
##  hddi_input_XX.q
##  
##  where XX is a two-digit decimal for n
## #############################################################
## 
## Synopsis:
##  Benchmarks for Uppaal
## #############################################################
## @TABLE OF CONTENTS:		       [TOCD: 11:46 19 Sep 2001]
##
##  [1] Disclaimer
## ##########################################################
## @FILE:    genHDDI.awk
## @PLACE:   BRICS AArhus; host:harald
## @FORMAT:  awk
## @AUTHOR:  M. Oliver M'o'ller     <omoeller@brics.dk>
## @BEGUN:   Wed Sep 12 20:44:41 2001
## @VERSION: Wed Sep 19 11:44:16 2001
## #############################################################
## 

## ###################################################################
## [1] Disclaimer
## ###################################################################

function disclaimer(i, OUT){
    #ret=time[1];
    #ret=time["second"];
    #ret = strftime("%a %b %d %H:%M:%S %Z %Y");
    print "// ------------------------------------------------------------ "  > OUT;
    print "// Token Ring HDDI " i > OUT;
    print "// " > OUT;
    print "// automatically generated by script generate.awk "  > OUT;
    print "// M. Oliver Moeller <omoeller@brics.dk> "  > OUT;
    print "// Wed Sep 19 11:44:16 2001 "  > OUT;
    print "// ------------------------------------------------------------ "  > OUT;
}

function channels(i, OUT){
    ORS="" ;
    print "chan " > OUT;
    for(v = 1; v <= i; v++){
	print "tt" v ","  > OUT;
    }
    print "\n     " > OUT;
    for(v = 1; v <= i; v++){
	print "rt" v   > OUT;
	if(v < i){ print ", "  > OUT; }
    }
    print ";\n"  > OUT;
    print "\n"  > OUT;
    ORS="\n";
}

function constants(i, OUT){
    print "const   SA      20; " > OUT; 
    print "const   td      0; " > OUT; 
    print "const   TRTT    " (20+i*50)";  " > OUT; 
    print "" > OUT; 
}

function ring(i, OUT){
    print "process RING { " > OUT;
    print "clock x; " > OUT;
    print "state " > OUT;
    term=",";
    for(v = 1; v <= i; v++){
	if(v == i){ term = ";"; };
	print "  ring_to_" v "{x <= td}, ring_" v term > OUT;
    }
    print "init ring_to_1; " > OUT;
    print "trans " > OUT;
    for(v = 1; v <= i; v++){
	w = v+1;
	term=","
	if(w > i){
	    w = 1;
	    term=";";
	};
	print "ring_to_" v " -> ring_" v " { guard x <= td; sync tt" v "!; }, " > OUT;
	print "ring_" v "  -> ring_to_" w " { sync rt" v "?; assign x:= 0; } " term > OUT;
    }
    print "}" > OUT;
    print "" > OUT;

}

function process(i, OUT){
    print "process ST" i " {" > OUT;
    print "clock x, y, z;" > OUT;
    print "state station_z_idle, station_z_sync{ x<=SA }, station_z_async{ z<=TRTT }, " > OUT;
    print "station_y_idle, station_y_sync{ x<=SA }, station_y_async{ y<=TRTT }; " > OUT;
    print "init station_z_idle; " > OUT;
    print "trans" > OUT;
    print "station_z_idle -> station_z_sync { sync tt" i " ?; assign y := 0, x:= 0; }, " > OUT;
    print "station_z_sync -> station_y_idle { guard x >= SA, z >= TRTT ; sync rt" i " !; }, " > OUT;
    print "station_z_sync -> station_z_async { guard x >= SA, z < TRTT ; }, " > OUT;
    print "station_z_async -> station_y_idle { sync rt" i " !; }, " > OUT;
    print "" > OUT;
    print "station_y_idle -> station_y_sync { sync tt" i " ?; assign z := 0, x:= 0; }, " > OUT;
    print "station_y_sync -> station_z_idle { guard x >= SA, y >= TRTT ; sync rt" i " !; }, " > OUT;
    print "station_y_sync -> station_y_async { guard x >= SA, y < TRTT ; }, " > OUT;
    print "station_y_async -> station_z_idle { sync rt" i " !; }; " > OUT;
    print "} \n" > OUT;
}

function systemdef(i, OUT){
    ORS="" ;
    print "system RING, " > OUT;
    for(v = 1; v <= i; v++){
	print "ST" v  > OUT;
	if(v < i){ print ", "  > OUT; }
    }
    print ";\n"  > OUT;
    print "\n"  > OUT;
    ORS="\n";
}


function mutex(i, OUT){
    print "A[] not ((ST1.station_z_sync or ST1.station_z_async or ST1.station_y_sync or ST1.station_y_async) \\" > OUT;
print "and 	(ST2.station_z_sync or ST2.station_z_async or ST2.station_y_sync or ST2.station_y_async) \\" > OUT;
    print ")" > OUT;
} 

BEGIN {
  if(ARGC!=2) {
    print "wrong number of arguments" | "cat 1>&2";
    exit(1);
  }
 N = ARGV[1] + 0;

 print "** " N    ;
  if(N<=0) {
    print "*** non valid `N' (use option -vN=# )" | "cat 1>&2"
    exit 1
  }
#  printf "%02d\n", N;
## -- set output names ------------------------------------------
  if( N >= 10 ) { 
      OUTPUT_Q =("hddi_input_" N ".q"); 
      OUTPUT_TA=("hddi_input_" N ".ta"); }
  else {
      OUTPUT_Q =("hddi_input_0" N ".q");
      OUTPUT_TA=("hddi_input_0" N ".ta"); }
## -- generate .ta ---------------------------------------------------------
  disclaimer(N, OUTPUT_TA);
  channels(N, OUTPUT_TA);
  constants(N, OUTPUT_TA);
  ring(N, OUTPUT_TA);
  for(v = 1; v <= N; v++){
      process(v, OUTPUT_TA);
  }
  systemdef(N,OUTPUT_TA);
## -- generate .q ----------------------------------------------------------
  mutex(N, OUTPUT_Q);
## -------------------------------------------------------------------------
  close(OUTPUT_TA);
  close(OUTPUT_Q);
}