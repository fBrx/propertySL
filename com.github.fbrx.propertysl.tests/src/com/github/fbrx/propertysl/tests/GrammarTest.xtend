package com.github.fbrx.propertysl.tests

import com.github.fbrx.propertysl.PropertySLInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.runner.RunWith
import org.junit.Assert
import org.junit.Test
import com.github.fbrx.propertysl.propertySL.Model

@InjectWith(PropertySLInjectorProvider)
@RunWith(XtextRunner)
class GrammarTest {
	
	@Inject
	ParseHelper<Model> parser
	
	@Test
	def testGrammar(){
		val model = parser.parse("
			package test {
				DEFAULT_LOCALE = de

				package sub{
					key = value
				}

				complex = {
					de: \"hAllo\"
					en: \"hEllo\"
				}
			}
		")

		Assert.assertNotNull(model);		
	}
}