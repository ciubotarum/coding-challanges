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
    * [Abstract Methods](#abstract-methods)
    * [Reference Type](#reference-type)
    * [Abstract classes](#abstract-classes)
    * [Difference between an abstract class and Interface](#difference-between-an-abstract-class-and-interface)
  * [Method Overriding](#method-overriding)
  * [`super` keyword](#super-keyword)
  * [`static`](#static)
  * [Exception Handling](#exception-handling)
    * [Exceptions](#exceptions)
      * [IOException](#ioexception)
      * [SQLException](#sqlexception-)
  * [JDBC (_Java Database Connectivity_)](#jdbc-_java-database-connectivity_)
  * [API (_Application Programming Interface_)](#api-_application-programming-interface_)
    * [String API](#string-api)
  * ["String", "StringBuilder", and "StringBuffer"](#string-stringbuilder-and-stringbuffer)
  * [Immutable Object](#immutable-object)
  * [Wrapper classes](#wrapper-classes)
    * [Autoboxing and Unboxing](#autoboxing-and-unboxing)
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

## `static`

* a particular member (variable, method, nested class) belongs to class itself
* can call static methods without creating an instance of a class `MyClass.staticVar`

## Exception Handling

Definition:

* mechanism to handle runtime errors 
* keywords for handling exceptions
     * `try` - block contains the code that might throw an exception
     * `catch` - block handles the exception, follows after a `try`, can have as many as we want
     * `finally` - executed regardless of whether an exception was thrown or caught 
     * `throw` - throw an exception from a method or block of code
     * `trows` - throw an exception from the method declaration 
        * <span style="color: red;">can't use on a class</span>

### Exceptions

* events that disrupt the normal flow of a program
* an object that represents an error during the execution of the program
     * dividing by zero
     * accessing an array index out of bonds
     * opening a file that doesn't exist
* Types:
*
      * checked exceptions: exceptions checked at compile-time 
           * subclasses of `Exception` 
           * must be declared in the method signature
           * caught or declared with keyword `throws`
           * `IOException`, `SQLException`
      * unchecked exceptions: occur at runtime
           * subclasses of `RuntimeException`
           * do not need to be declared in the method signature
           * `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`
      * errors: serious problems that should not try to catch
           * `OutOfMemoryError`, `stackOverflowError`
* <span style="color: violet;">method signature</span>
*     * includes method's name and the parameter list

#### IOException

Definition:
* checked exception
* I/O (input/output) operation has failed or interrupted
* class of exceptions
* network issues
* Subclasses
   * `FileNotFoundException`: failed to open a file
   * `EOFException`: unexpectedly reached the end of a file or stream 
   * etc

#### SQLException 

Definition:
* checked exception
* signals a database access error

## JDBC (_Java Database Connectivity_)

Definition:
* API that enables Java applications to interact with databases
   * connecting to a database using a specific server
   * executing SQL statements on the database

## API (_Application Programming Interface_)

Definition: 
* connects apps together 
* intermediary between different software components
* provide a set of definitions and protocol that allows applications to communicate
* Examples:
   * Web API: communication over the internet using HTTP and REST
   * Google Maps API
   * for uber one app calculate your payment, another show your current location ...

### String API

Definition:
* set of classes and methods that provide functionality to work with strings
* comparing, extracting, searching, modifying ...

### Collections API

Definition:
* set of classes and interfaces that provide algorithms for working with collections of obj.
* includes a variety of data structures like:
   * lists
   * sets
   * maps

Main Collections Interface
#### `Collection` Interface
* we can sort, search and manipulate data within this collections
   * `add()`
   * `remove()`
   * `size()`
   * `contains()`

#### `List` Interface
* ordered collection
* allows duplicate elements 
* provides positional access
* Types:
   * `ArrayList`
   * `LinkedList`
   * `Vector`

#### `Set` Interface
* does not allow duplicate elements
* Types:
   * `HashSet`
   * `LinkedHashSet`
   * `TreeSet`

#### `Queue` Interface
* hold elements in FIFO order
* Types:
   * `LinkedList`
   * `PriorityQueue`
   * `ArrayDeque`

#### `Map` Interface
* objects that maps keys to values
* no duplicate allowed
* Types:
   * `HashMap`
   * `TreeMap`
   * `LinkedHashMap`
   * `HashTable`

## "String", "StringBuilder", and "StringBuffer"

Definition:
* used to deal with strings
* _String_: 
   * immutable object (once created it can't be modified)
   * any attempt to change will create a new object
   * thread-safe (correct behaviour) can be accessed my multiple threads without changing the behaviour
   * **used in cases where data shouldn't be accidentally modified**
* _StringBuilder_
   * mutable class
   * is not thread-safe
   * allows to modify and manipulate string objects
   * **when need to perform multiple appends, inserts, ... operations**
* _StringBuffer_
   * mutable, similar to string builder
   * is thread-safe
   * **have multiple threads to modify the same string**
* <span style="color: violet;">thread-safe</span>: an object have correct behaviour even after was accessed multiple times

## Immutable Object

Definition:

* an object whose state cannot be modified after it is created
* thread-safe
* have no methods to be modified
* fields/classes a declared with `final` to ensure that the values cannot be changed
* Examples:
   * `String`
   * `Integer`
   * `Boolean`
   * `Double`

## Wrapper classes

Definition:

* encapsulate primitive data types into an object
* use primitives data types (`char`, `int`, `boolean`) as objects
* Examples:
   * `byte` -> `Byte`
   * `short` -> `Short`
   * `int` -> `Integer`
   * `char` -> `Character` ect.

Why use it:

* allow collections (`ArrayList`, `HashMap`) to word with data types
* wrapper classes can be `null` useful to represent the absence of the value

### Autoboxing and Unboxing

Definition:

* mechanisms that allow automatic conversion between primitive types and their wrapper classes

<span style="color: violet;">Autoboxing</span>:
* convert primitive types to wrapper classes
* `int` to `Integer`

<span style="color: violet;">Unboxing</span>:
* convert wrapper classes to primitive types
* `Integer` to `int`