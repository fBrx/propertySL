package com.github.fbrx.propertysl.tests;

import com.github.fbrx.propertysl.PropertySLInjectorProvider;
import com.github.fbrx.propertysl.propertySL.Model;
import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(PropertySLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class GrammarTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Test
  public void testGrammar() {
    try {
      final Model model = this.parser.parse("\r\n\t\t\tpackage test {\r\n\t\t\t\tDEFAULT_LOCALE = de\r\n\r\n\t\t\t\tpackage sub{\r\n\t\t\t\t\tkey = value\r\n\t\t\t\t}\r\n\r\n\t\t\t\tcomplex = {\r\n\t\t\t\t\tde: \"hAllo\"\r\n\t\t\t\t\ten: \"hEllo\"\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t");
      Assert.assertNotNull(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
