/*
 * generated by Xtext
 */
package fr.lip6.move.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.lip6.move.GalRuntimeModule;
import fr.lip6.move.GalStandaloneSetup;
import fr.lip6.move.ide.GalIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class GalWebSetup extends GalStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GalRuntimeModule(), new GalIdeModule(), new GalWebModule()));
	}
	
}