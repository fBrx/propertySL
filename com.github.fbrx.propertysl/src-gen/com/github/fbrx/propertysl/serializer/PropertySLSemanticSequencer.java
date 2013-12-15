package com.github.fbrx.propertysl.serializer;

import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue;
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem;
import com.github.fbrx.propertysl.propertySL.DefaultLocale;
import com.github.fbrx.propertysl.propertySL.Model;
import com.github.fbrx.propertysl.propertySL.Property;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue;
import com.github.fbrx.propertysl.services.PropertySLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PropertySLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PropertySLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PropertySLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PropertySLPackage.COMPLEX_PROPERTY_VALUE:
				if(context == grammarAccess.getAbstractPropertyValueRule() ||
				   context == grammarAccess.getComplexPropertyValueRule()) {
					sequence_ComplexPropertyValue(context, (ComplexPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.COMPLEX_PROPERTY_VALUE_ITEM:
				if(context == grammarAccess.getComplexPropertyValueItemRule()) {
					sequence_ComplexPropertyValueItem(context, (ComplexPropertyValueItem) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.DEFAULT_LOCALE:
				if(context == grammarAccess.getDefaultLocaleRule()) {
					sequence_DefaultLocale(context, (DefaultLocale) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (com.github.fbrx.propertysl.propertySL.Package) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case PropertySLPackage.SIMPLE_PROPERTY_VALUE:
				if(context == grammarAccess.getAbstractPropertyValueRule() ||
				   context == grammarAccess.getSimplePropertyValueRule()) {
					sequence_SimplePropertyValue(context, (SimplePropertyValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lang=LOCALE value=SimplePropertyValue)
	 */
	protected void sequence_ComplexPropertyValueItem(EObject context, ComplexPropertyValueItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.COMPLEX_PROPERTY_VALUE_ITEM__LANG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.COMPLEX_PROPERTY_VALUE_ITEM__LANG));
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.COMPLEX_PROPERTY_VALUE_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.COMPLEX_PROPERTY_VALUE_ITEM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0(), semanticObject.getLang());
		feeder.accept(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     items+=ComplexPropertyValueItem+
	 */
	protected void sequence_ComplexPropertyValue(EObject context, ComplexPropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lang=LOCALE
	 */
	protected void sequence_DefaultLocale(EObject context, DefaultLocale semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.DEFAULT_LOCALE__LANG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.DEFAULT_LOCALE__LANG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0(), semanticObject.getLang());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     packages+=Package*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN defaultLocale=DefaultLocale? (packages+=Package | properties+=Property)*)
	 */
	protected void sequence_Package(EObject context, com.github.fbrx.propertysl.propertySL.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=PropertyKey value=AbstractPropertyValue)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.PROPERTY__KEY));
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SimplePropertyValue(EObject context, SimplePropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PropertySLPackage.Literals.SIMPLE_PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PropertySLPackage.Literals.SIMPLE_PROPERTY_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
