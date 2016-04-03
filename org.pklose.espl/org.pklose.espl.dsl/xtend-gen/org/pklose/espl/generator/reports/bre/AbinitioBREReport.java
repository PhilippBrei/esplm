package org.pklose.espl.generator.reports.bre;

import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.pklose.espl.esplm.BreEntityInput;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.ModelElement;
import org.pklose.espl.esplm.Property;

@SuppressWarnings("all")
public class AbinitioBREReport {
  private final Map<String, BusinessRule> specifiedBREs;
  
  private final Map<String, BusinessRule> implementedBREs;
  
  private final Workbook workBook = new XSSFWorkbook();
  
  public AbinitioBREReport(final Collection<BusinessRule> specifiedBres, final Collection<BusinessRule> implementedBres) {
    final Function1<BusinessRule, String> _function = (BusinessRule it) -> {
      return it.getName();
    };
    Map<String, BusinessRule> _map = IterableExtensions.<String, BusinessRule>toMap(specifiedBres, _function);
    this.specifiedBREs = _map;
    final Function1<BusinessRule, String> _function_1 = (BusinessRule it) -> {
      return it.getName();
    };
    Map<String, BusinessRule> _map_1 = IterableExtensions.<String, BusinessRule>toMap(implementedBres, _function_1);
    this.implementedBREs = _map_1;
  }
  
  public Workbook createReport() {
    Sheet implementedSheet = this.initWorkBook("Implemented BREs");
    this.createHeadLine(implementedSheet);
    this.fill(implementedSheet, this.implementedBREs);
    Sheet specifiedSheet = this.initWorkBook("Specified BREs");
    this.createHeadLine(specifiedSheet);
    this.fill(specifiedSheet, this.specifiedBREs);
    return this.workBook;
  }
  
  public Workbook createReport(final File file) {
    try {
      Workbook wb = this.createReport();
      FileOutputStream out = new FileOutputStream(file);
      wb.write(out);
      return wb;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Sheet initWorkBook(final String name) {
    Sheet sheet = this.workBook.createSheet(name);
    sheet.setPrintGridlines(true);
    sheet.setDisplayGridlines(true);
    return sheet;
  }
  
  public void createHeadLine(final Sheet sheet) {
    Row headLine = sheet.createRow(0);
    Cell expectedBreName = headLine.createCell(0);
    expectedBreName.setCellValue("Expected BRE Name");
    Cell expectedFieldBre = headLine.createCell(1);
    expectedFieldBre.setCellValue("Expected BRE Field");
    Cell expectedType = headLine.createCell(2);
    expectedType.setCellValue("Expected Field Type");
    Cell actualBreName = headLine.createCell(3);
    actualBreName.setCellValue("Actual BRE Name");
    Cell actualFieldBre = headLine.createCell(4);
    actualFieldBre.setCellValue("Actual BRE Field");
    Cell actualType = headLine.createCell(5);
    actualType.setCellValue("Actual BRE Type");
  }
  
  public void fill(final Sheet sheet, final Map<String, BusinessRule> bres) {
    int rowCounter = 1;
    Set<String> _keySet = bres.keySet();
    for (final String breName : _keySet) {
      {
        BusinessRule currentBre = bres.get(breName);
        EList<BreEntityInput> _inputs = currentBre.getInputs();
        for (final BreEntityInput entity : _inputs) {
          if ((entity instanceof BreEntityInput)) {
            BreEntityInput breEntity = ((BreEntityInput) entity);
            ModelElement _inputElement = breEntity.getInputElement();
            Entity inputElement = ((Entity) _inputElement);
            EList<Property> _properties = inputElement.getProperties();
            Iterable<Property> _filter = Iterables.<Property>filter(_properties, Property.class);
            List<Property> _list = IterableExtensions.<Property>toList(_filter);
            for (final Property field : _list) {
              {
                Row row = sheet.createRow(rowCounter);
                String _name = field.getName();
                this.fillBreRule(row, rowCounter, breName, _name, "input");
                rowCounter++;
              }
            }
          }
        }
      }
    }
  }
  
  public void fillBreRule(final Row row, final int start, final String BRENameValue, final String BREFieldValue, final String BRETypeValue) {
    Cell expectedBreName = row.createCell(start);
    expectedBreName.setCellValue(BRENameValue);
    Cell expectedFieldBre = row.createCell((start + 1));
    expectedFieldBre.setCellValue(BREFieldValue);
    Cell expectedType = row.createCell((start + 2));
    expectedType.setCellValue(BRETypeValue);
  }
}
