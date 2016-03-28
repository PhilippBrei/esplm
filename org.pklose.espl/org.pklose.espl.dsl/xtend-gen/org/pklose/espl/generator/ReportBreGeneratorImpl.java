package org.pklose.espl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.pklose.espl.abinitio.service.AbinitionBREService;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.generator.IReportGenerator;

@SuppressWarnings("all")
public class ReportBreGeneratorImpl implements IReportGenerator {
  @Inject
  private AbinitionBREService breService;
  
  @Override
  public void createBREReport(final Resource resource) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<BusinessRule> _filter = Iterables.<BusinessRule>filter(_iterable, BusinessRule.class);
    final List<BusinessRule> bres = IterableExtensions.<BusinessRule>toList(_filter);
    for (final BusinessRule bre : bres) {
    }
    this.breService.getBusinessRuleMetaInformation("");
    return;
  }
}
