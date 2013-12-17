# Overview

This repository contains a domain specific language for editing java property files and multi-language resource bundles. The project started initially as a sample project for exploring domain specific languages and the [Eclipse Xtext](http://www.eclipse.org/Xtext/) technology.

# PropertySL

The defined domain specific language - named _PropertySL_ - let's you define properties and resource bundles in a concise way. It has support for namespaces, nesting and internationalization. The syntax is pretty straight forward to read and lets you define everything you need in one file.

## Syntax

```java
package com.github.fbrx.propertysl.demo{
	
	SUPPORTED_LOCALES = {
		de, default en, es 
	}
	
	package subpackage {
		simpleProp = "Howdy, partner!"
	}
	
	complexProp = {
		de : "Hallo, Welt!"
		en : "Hello, world!"
		es : "Hola, mundo!"
	}
}
```

## Editor support

The PropertySL was defined by means of the [Eclipse Xtext](http://www.eclipse.org/Xtext/) and [Eclipse Xtend](http://www.eclipse.org/Xtend/) technologies. Thus there is also first class (Eclipse based) editor support built-in.
![PropertySL Editor](https://raw.github.com/fBrx/propertySL/master/editor.png)

# Attributions

* Icons for the Eclipse Outline were taken from the [IKONS](http://ikons.piotrkwiatkowski.co.uk/ "IKONS") package by [Piotr Kwiatkowski](http://www.piotrkwiatkowski.co.uk/ )