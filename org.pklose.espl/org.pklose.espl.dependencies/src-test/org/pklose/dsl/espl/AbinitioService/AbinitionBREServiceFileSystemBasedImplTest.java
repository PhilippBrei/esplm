package org.pklose.dsl.espl.AbinitioService;

import java.io.FileNotFoundException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.pklose.espl.abinitio.service.BusinessRule;
import org.pklose.espl.abinitio.service.impl.AbinitionBREServiceFileSystemBasedImpl;
import org.pklose.espl.abinitio.service.model.BusinessRuleMetaInformation;



public class AbinitionBREServiceFileSystemBasedImplTest {
	
	
	
	@Test
	public void readRule () {
		AbinitionBREServiceFileSystemBasedImpl service = new AbinitionBREServiceFileSystemBasedImpl();
		URL url = service.getRessourceAsURL("calypso_neuanlage");
		Assert.assertNotNull(url);
	}
	
	@Test 
	public void readBreRule () {
		AbinitionBREServiceFileSystemBasedImpl service = new AbinitionBREServiceFileSystemBasedImpl();
		BusinessRule bre = service.getBusinessRuleMetaInformation("calypso_neuanlage");
		Assert.assertNotNull(bre);
		Assert.assertEquals("calypso_neuanlage", bre.getName());
		Assert.assertFalse(bre.getInputElements().isEmpty());
		Assert.assertEquals("IST_AUSZAHLUNG", bre.getInputElements().get(2).getFields().get(2).getName());
	}
	
	@Test 
	public void parseJson () throws FileNotFoundException {
		AbinitionBREServiceFileSystemBasedImpl service = new AbinitionBREServiceFileSystemBasedImpl();
		BusinessRuleMetaInformation bre = service.parseRule(service.getRessourceAsURL("calypso_neuanlage").getFile());
		Assert.assertNotNull(bre);
		Assert.assertEquals("calypso_neuanlage",bre.getName());		
	}

}
