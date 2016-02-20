package org.pklose.espl.tests;

import com.google.common.collect.Iterables;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.espl.EsplmInjectorProvider;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.Model;
import org.pklose.espl.generator.Node;
import org.pklose.espl.generator.NodeFactory;

@RunWith(XtextRunner.class)
@InjectWith(EsplmInjectorProvider.class)
@SuppressWarnings("all")
public class NodeFactoryTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Test
  public void testDomain() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Domain Person Description: \"Domain enthält alle Partner Daten\" {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Geschaeftspartner {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Field Name: Text");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Gruppe {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Field Gruppenummer:Int");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Relation 1..N Teilnehmer:Geschaeftspartner\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this.validationTester.assertNoIssues(model);
      TreeIterator<EObject> _eAllContents = model.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      final Iterable<Entity> entities = Iterables.<Entity>filter(_iterable, Entity.class);
      List<Entity> _list = IterableExtensions.<Entity>toList(entities);
      final List<Node> nodes = NodeFactory.createNodes(_list);
      int _size = nodes.size();
      Assert.assertEquals(2, _size);
      Node _last = IterableExtensions.<Node>last(nodes);
      String _asJson = _last.getAsJson();
      boolean _isEmpty = _asJson.isEmpty();
      Assert.assertFalse(_isEmpty);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Enumeration Geschlecht {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Maenlich,Weiblich");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this.validationTester.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
