package org.pklose.espl.abinitio.service;

import org.pklose.espl.abinitio.service.impl.AbinitionBREServiceFileSystemBasedImpl;

import com.google.inject.AbstractModule;

public class AbinitionServicesModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(AbinitionBREService.class).to(AbinitionBREServiceFileSystemBasedImpl.class);
		
	}
	
	

}
