# Java

To do:
how maven creates a jar
what do manifest file does

<!-- TOC -->
* [Java](#java)
  * [JVM (_Java Virtual Machine_)](#jvm-_java-virtual-machine_)
  * [JRE (_Java Runtime Environment_)](#jre-_java-runtime-environment_)
  * [JDK (_Java Development Kit_)](#jdk-_java-development-kit_)
    * [Components:](#components)
  * [Variables](#variables)
    * [Data types](#data-types)
      * [<span style="color: green;">Primitive</span>](#span-stylecolor-greenprimitivespan)
      * [<span style="color: green;">Non-Primitive (Reference Types)</span>](#span-stylecolor-greennon-primitive-reference-typesspan)
<!-- TOC -->

## JVM (_Java Virtual Machine_)

Definition:
* program that enable a computer to run Java programs
* core component of JRE

Alternatives:
* OpenJDK Distributions
* IBM OpenJ9

Why/When use it:
* to run Java Applications
* write once and run anywhere

## JRE (_Java Runtime Environment_)

Definition:
* a set of software components that allows your computer to run java applications. 
* provides the JVM core libraries for interpreting and executing Java bytecode.
* it contains libraries + files.

Alternatives:
* same as for JVM

Why/When use it:
* to run a Java application on your computer
* easy to install
* lightweight and efficient compared to full JDK

## JDK (_Java Development Kit_)

Definition:
* a software designed for creating Java applications

### Components:
* JRE
* Java Compiler (javac) - translates you Java code into bytecode
* Java Archiver (jar) - archive your code
* Other tools

Alternatives: 
* GraalVM
* same as for JVM

Why/When use it:
* write, compile, debug and package Java applications

## Variables

Definition:
* containers that store data values

### Data types

#### <span style="color: green;">Primitive</span>

Fundamental building blocks for storing basic values.

Immutable: The value of a primitive variable cannot be changed after it's assigned. 
If you modify a primitive variable, Java creates a new memory location for the new value.

Store the actual data value directly in memory.

* byte
* short
* int
* long
* float 
* double
* char
* boolean

#### <span style="color: green;">Non-Primitive (Reference Types)</span>

Store memory addresses (references) pointing to objects in memory.

* String
* Arrays
     * collection of elements of the same data type
     * can't add or remove elements after creation
     * declaring arrays: _int[] numbers = new int[5]_;
     * hold only primitive data types
* Classes
     * fundamental building blocks for object-oriented programming
     * templates that define the properties (variables) and behaviours (methods)
     * you create objects (instances) from a class definition
* Interfaces
     * define what a class must do without specifying how to do it

## JIT (_Just-in-time compilation_)

Definition:
* compiling the bytecode in runtime

Why/When use it:
* speed up program execution
* compile the parts of the code that is actually used


## ClassLoader

Definition: 
* crucial component of the JRE
* loading classes at runtime into the JVM

## Typecasting

Definition:
* converting a value from one data type to another

Types:
* Widening Casting (Implicit): automatic type conversion from a smaller to a larger type
* Narrowing Casting (Explicit): needs explicit conversion to convert a larger type to a smaller type

## Literals

Definition:
* fixed values that the program can use without any calculations
     * whole numbers `10`
     * numbers with decimal points `-12.25`
     * characters `'`
     * strings `"`
     * boolean `true`

## Constructor

Definition:
* initialization routine for your objects
* put the initial parameters

