package org.pklose.dsl.espl.AbinitioService;

import java.io.FileNotFoundException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.pklose.espl.abinitio.service.BusinessRule;
import org.pklose.espl.abinitio.service.impl.AbinitionBREServiceFileSystemBasedImpl;



public class AbinitionBREServiceFileSystemBasedImplTest {
	
	
	
	@Test
	public void readRule () {
		AbinitionBREServiceFileSystemBasedImpl service = new AbinitionBREServiceFileSystemBasedImpl();
		URL url = service.getRessourceAsURL("calypso_neuanlage");
		Assert.assertNotNull(url);
	}
	
	@Test 
	public void parseJson () throws FileNotFoundException {
		AbinitionBREServiceFileSystemBasedImpl service = new AbinitionBREServiceFileSystemBasedImpl();
		BusinessRule bre = service.parseRule(service.getRessourceAsURL("calypso_neuanlage").getFile());
		Assert.assertNotNull(bre);
		Assert.assertEquals("calypso_neuanlage",bre.getName());
	}

}
