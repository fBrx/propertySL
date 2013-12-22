
[<img align="right" src="https://travis-ci.org/fBrx/propertySL.png">](https://travis-ci.org/fBrx/propertySL)
# Overview

This repository contains a domain specific language for editing java property files and multi-language resource bundles. The project started initially as a sample project for exploring domain specific languages and the [Eclipse Xtext](http://www.eclipse.org/Xtext/) technology.

# PropertySL

The defined domain specific language - named _PropertySL_ - let's you define properties and resource bundles in a concise way. It has support for namespaces, nesting and internationalization. The syntax is pretty straight forward to read and lets you define everything you need in one file.

## Example

- [ ] TODO: insert sample

## Syntax

### Packages
- [ ] TODO: describe Packages

### Supported Locales
PropertySL has the ability to maintain properties for multiple languages (locales) in one place. This is to support the standard Java Resource Bundle layout for property files.

To use the NLS-support, the locales, which are supported by the package have to be provided as the first statement within the package:

```java
	package com.github.fbrx.propertysl.demo {
		SUPPORTED_LOCALES = {
			de, default en, en_US
		}
		//...
	}
```

Locales can be defined by either language code only (i.e. `en`) or language and country code to be more specific (i.e. `en_US`). Multiple values are separated with a comma.

One of the defined locales can be defined as the default locale. This results in a default ressource bundle file being generated. This file contains all the values which are defined for the respective locale. It always advised to set the default locale.

The definition above would result in the following files being generated:

```
	/src-gen
		|- com.github.fbrx.propertysl.demo.properties		# the default locale (same contents as *_en.properties)
		|- com.github.fbrx.propertysl.demo_de.properties	# only properties which have a value for 'de' set
		|- com.github.fbrx.propertysl.demo_en_US.properties	# only properties which have a value for 'en' set
		|- com.github.fbrx.propertysl.demo_en_GB.properties	# only properties which have a value for 'en_US' set
```

### Properties

#### Simple Properties
- [ ] TODO describe Simple Properties

#### Complex Properties (Multi-Language Properties)
- [ ] TODO: describe Complex Properties

### Comments
To give a summary of packages contents as well as detailed explanations for single properties PropertySL supports a comprehensive comment facility.

To associate a comment with a package or property just place it in front of the according element:

```java
	/**
	 * Comments can describe package contents and give an overview 
	 * of the purpose of the contained proeprties.
	 *
	 * Comments can span as many lines as needed.
	 */
	package com.github.fbrx.propertysl.demo {
	
		/** Properties can have comments too!  */
		greeting = "Howdy, partner!"
	}
```

The above comments will be rendered to the resulting property files (_com.github.fbrx.propertysl.demo.properties_ in the example) in the following way:

```properties
	####
	#	Comments can describe package contents and give an overview
	#	of the purpose of the contained proeprties.
	#	
	#	Comments can span as many lines as needed.
	####
	
	#	Properties can have comments too!
	com.github.fbrx.propertysl.demo.greeting = Howdy, partner!
```
 
Comments can also be placed at any other place in the _*.psl_ file where they will be silently ignored.

## Editor support

The PropertySL was defined by means of the [Eclipse Xtext](http://www.eclipse.org/Xtext/) and [Eclipse Xtend](http://www.eclipse.org/Xtend/) technologies. Thus there is also first class (Eclipse based) editor support built-in.
![PropertySL Editor](https://raw.github.com/fBrx/propertySL/master/editor.png)

# Attributions

* Icons for the Eclipse Outline were taken from the [IKONS](http://ikons.piotrkwiatkowski.co.uk/ "IKONS") package by [Piotr Kwiatkowski](http://www.piotrkwiatkowski.co.uk/ )