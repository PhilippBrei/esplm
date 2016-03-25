package org.pklose.espl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.pklose.espl.abinitio.service.AbinitionBREService
import org.pklose.espl.esplm.BusinessRule
import com.google.inject.Inject

class ReportBreGeneratorImpl implements IReportGenerator{
	
	@Inject
	private AbinitionBREService breService// = new AbinitionBREServiceFileSystemBasedImpl();
	
	override createBREReport(Resource resource) {
		val bres = resource.allContents.toIterable.filter(typeof(BusinessRule)).toList
		breService.getBusinessRuleMetaInformation("");
		
		return;
	}
	
	
	
	
	
}