package org.pklose.dsl.espl.AbinitioService;

import org.junit.Assert;
import org.junit.Test;
import org.pklose.espl.abinitio.service.AbinitionBREService;
import org.pklose.espl.abinitio.service.AbinitionServicesModule;
import org.pklose.espl.abinitio.service.BusinessRule;

import com.google.inject.Guice;
import com.google.inject.Injector;




public class GuiceServiceTest {
	
	private Injector injector = Guice.createInjector(new AbinitionServicesModule());
	
	private final AbinitionBREService service = injector.getInstance(AbinitionBREService.class);
	
	@Test
	public void testInjection () {
		BusinessRule businessRuleMetaInformation = service.getBusinessRuleMetaInformation("calypso_neuanlage");
		Assert.assertNotNull(businessRuleMetaInformation);
	}

}
