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
  * [JIT (_Just-in-time compilation_)](#jit-_just-in-time-compilation_)
  * [ClassLoader](#classloader)
  * [Typecasting](#typecasting)
  * [Literals](#literals)
  * [Constructor](#constructor)
  * [Overloading](#overloading)
  * [Package](#package)
  * [<span style="color: green;">Object-Oriented Programming (OOP)</span>](#span-stylecolor-greenobject-oriented-programming-oopspan)
  * [Access control](#access-control)
  * [Interface](#interface-)
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
* **Widening Casting** (Implicit): automatic type conversion from a smaller to a larger type
* **Narrowing Casting** (Explicit): needs explicit conversion to convert a larger type to a smaller type

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

## Overloading

Definition:
* define multiple methods within the same class that have the same name 
* have different parameters

Why/When use it:
* different functionalities for the same operation
* code clarity

## Package

Definition:
* organizing files (classes, interfaces, subpackages)

Why/When use it:
* code readability
* prevent naming conflicts with the classes with the same name

Types:
* Built-in Packages (Java API) - pre-written classes, interfaces...
* User-defined Packages - your own packages

## <span style="color: green;">Object-Oriented Programming (OOP)</span>

Definition:
* paradigm focused on creating "objects"

Key concepts:
* Objects
     * represents an entity in the real world (car, bank account)
* Classes
     * an object is an instance of a class
* Inheritance
     * allows to create new classes that inherit properties and methods from existing classes
     * code re-usability 
     * a class can inherit only from one superclass
     * `extends` keyword is used to establish an inheritance relationship
     * `@Override` provide an implementation of a method that is already defined
     * `super` keyword used to call a superclass constructor or access methods and fields
     * access control: `private`, `protected`, `public`
* Encapsulation
     * all the variables and methods are inside a class
     * use getters and setters
     * hide implementation details of objects from the outside world
     * use access control `private` or `public`
* Polymorphism 
     * object from different classes respond differently to the same method
     * multiple methods have the same name but different parameters
     * `add()` method can have 2, 3, ... parameters 
     * `drow()` method can be implemented differently for a `Circle` object and a `Square`
     * specific implementation of a method that is already defined in its superclass
     * _doing the same thing in different ways_

* Abstraction
     * hiding complex implementation and showing only the necessary features of an object
     * abstract classes are declared with `abstract`
     * interfaces are declared using the `interface` keyword

## Access control

* <span style="color: violet;">private</span>: not accessible from outside the class
* <span style="color: violet;">protected</span>: accessible within the same package and by subclasses even if in different packages
* <span style="color: violet;">public</span>: accessible from any other class/package
* <span style="color: violet;">default</span>: not accessible from the outside packages

## Interface 

* reference type similar to a class 
* specify abstract methods that a class must implement
* is a way to achieve abstraction and inheritance
* a class can implement multiple interfaces separated by a comma `,`
* cannot have constructors

### Abstract Methods

* methods without a body 

### Reference Type

* type that refer to objects or arrays
* hold the address to where the object in stored in memory
* Types: 
* 
      * classes
      * interfaces 
      * arrays
      * enumerations

### Abstract classes

* can contain abstract and concrete methods
* can't create an instance (can't create an object) from it
* can give variables without give the value
* can have constructors.

### Difference between an abstract class and Interface

 * can implement many interfaces but can extend only one class
 * you can declare any fields for interface but have to be instantiated `public static final`
 * can declare any fields without instantiate in abstract class

## Method Overriding

* allows a subclass to provide a specific implementation for a method in a superclass 
* should have the same name, return type and parameters
* `@Override` annotation used to indicate an override method
* Benefits:
*
      * Runtime Polymorphism
      * code reusasbility by allowing subclasses to use the behaviour of methods form superclass

## `super` keyword

* refer to the immediate parent class
* can access superclass methods, constructors, and variables
* differentiate between a superclass method and a subclass method
