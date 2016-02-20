package org.pklose.espl.tests;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.espl.EsplmInjectorProvider;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.Field;
import org.pklose.espl.esplm.Model;
import org.pklose.espl.esplm.Property;
import org.pklose.espl.generator.Node;

@RunWith(XtextRunner.class)
@InjectWith(EsplmInjectorProvider.class)
@SuppressWarnings("all")
public class EasySpecificationLanguageGeneratorTest2 {
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
      Iterator<Entity> _filter = Iterators.<Entity>filter(_eAllContents, Entity.class);
      final Function1<Entity, Boolean> _function = new Function1<Entity, Boolean>() {
        @Override
        public Boolean apply(final Entity it) {
          String _name = it.getName();
          return Boolean.valueOf(_name.equals("Geschaeftspartner"));
        }
      };
      final Entity geschaeftspartner = IteratorExtensions.<Entity>findFirst(_filter, _function);
      EList<Property> _properties = geschaeftspartner.getProperties();
      final Iterable<Field> partnerFields = Iterables.<Field>filter(_properties, Field.class);
      Assert.assertNotNull(geschaeftspartner);
      Assert.assertNotNull(partnerFields);
      boolean _isEmpty = IterableExtensions.isEmpty(partnerFields);
      Assert.assertFalse(_isEmpty);
      String _name = geschaeftspartner.getName();
      final Node node = new Node(_name, partnerFields);
      String _asJson = node.getAsJson();
      String _string = _asJson.toString();
      final String json = _string.trim();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("\t            ");
      _builder_1.append("key: \"Geschaeftspartner\",");
      _builder_1.newLine();
      _builder_1.append("\t            ");
      _builder_1.append("name: \"Geschaeftspartner\",");
      _builder_1.newLine();
      _builder_1.append("\t            ");
      _builder_1.append("properties: [\t            \t");
      _builder_1.newLine();
      _builder_1.append("\t            \t");
      _builder_1.append("{ name: \"Name\", type: \"Text\", visibility: \"public\" }                      ");
      _builder_1.newLine();
      _builder_1.append("\t            \t");
      _builder_1.append("]");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("}");
      String _string_1 = _builder_1.toString();
      String expected = _string_1.trim();
      Assert.assertEquals(expected, json);
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
