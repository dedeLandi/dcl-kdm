/*
 * generated by Xtext
 */
package com.br.terra.dcl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.br.terra.dcl.ui.internal.DCLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DCLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DCLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DCLActivator.getInstance().getInjector(DCLActivator.COM_BR_TERRA_DCL_DCL);
	}
	
}
