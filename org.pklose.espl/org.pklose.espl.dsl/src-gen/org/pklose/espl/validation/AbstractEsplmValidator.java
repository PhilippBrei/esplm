/*
 * generated by Xtext
 */
package org.pklose.espl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractEsplmValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.pklose.espl.esplm.EsplmPackage.eINSTANCE);
		return result;
	}
}
