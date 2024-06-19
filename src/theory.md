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
  * [API (_Application Programming Interface_)](#api-_application-programming-interface_)
    * [JDBC (_Java Database Connectivity_)](#jdbc-_java-database-connectivity_)
    * [String API](#string-api)
    * [Collections API](#collections-api)
      * [`Collection` Interface](#collection-interface)
      * [`List` Interface](#list-interface)
      * [`Set` Interface](#set-interface)
      * [`Queue` Interface](#queue-interface)
      * [`Map` Interface](#map-interface)
    * [Stream API](#stream-api)
  * ["String", "StringBuilder", and "StringBuffer"](#string-stringbuilder-and-stringbuffer)
  * [Immutable Object](#immutable-object)
  * [Wrapper classes](#wrapper-classes)
    * [Autoboxing and Unboxing](#autoboxing-and-unboxing)
  * [Generics](#generics)
  * ["Iterator" Interface](#iterator-interface)
    * [Difference between "Iterator" and "ListIterator"](#difference-between-iterator-and-listiterator)
  * [Optional](#optional)
  * [Design patterns](#design-patterns)
    * [Creational Patterns](#creational-patterns)
      * [Singleton Pattern](#singleton-pattern)
      * [Dependency Injection _(DI)_](#dependency-injection-_di_)
        * [Inversion of Control _(IoC)_](#inversion-of-control-_ioc_)
      * [Factory Method Pattern](#factory-method-pattern)
    * [Structural Patterns](#structural-patterns)
      * [Adapter Pattern](#adapter-pattern)
      * [Bridge Pattern](#bridge-pattern)
      * [Decorator Pattern](#decorator-pattern)
    * [Behavioral Pattern](#behavioral-pattern)
      * [theory.examples.Strategy Pattern](#theoryexamplesstrategy-pattern)
      * [Observer Pattern](#observer-pattern)
      * [Command Pattern](#command-pattern)
* [To do:](#to-do)
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

## API (_Application Programming Interface_)

Definition: 
* connects apps together 
* intermediary between different software components
* provide a set of definitions and protocol that allows applications to communicate
* Examples:
   * Web API: communication over the internet using HTTP and REST
   * Google Maps API
   * for uber one app calculate your payment, another show your current location ...

### JDBC (_Java Database Connectivity_)

Definition:
* API that enables Java applications to interact with databases
  * connecting to a database using a specific server
  * executing SQL statements on the database
* `connection = DriverManager.getConnection(url, user, password);` - connect to db
* to handle exceptions for db use try() - catch() with `SQLException`

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

Definition:
* ordered collection - elements have a specific position
* provides positional access
* allows the storage and manipulation of elements
* can contain duplicate elements
* `List` interface is a part of Java Collections Framework
* lists can grow and shrink dynamically

Common implementations:
* `ArrayList`
  * resizable
  * fast random access of the elements
  * suitable for frequent insertion or deletion
  * `List<String> arrayList = new ArrayList<>();`
  * `arrayList.add("Apple");`, `String fruit = arrayList.get(1);`, `arrayList.remove(2);`
* `LinkedList`
  * an implementation of the `List` and `Deque` interfaces
  * better performance for insertion or deletion
  * slower random access
  * suitable for frequent insertion and deletion
  * `List<String> linkedList = new LinkedList<>();`
  * `linkedList.add("Dog");`, `String animal = linkedList.get(2);`, `linkedList.remove(0);`
* `Vector`
  * synchronized resizable array implementation of the `List` interface
  * similar to `ArrayList` but thread-safe
  * when required thread-safety
  * `List<String> vector = new Vector<>();`
  * `vector.add("Red");`, `String color = vector.get(1);`, `vector.remove(2);`
* `Stack`
  * subclass of `Vector` that implements LIFO
  * suitable for LIFO operations
  * `Stack<String> stack = new Stack<>();`
  * `stack.push("First");`, `String top = stack.pop();`

#### `Set` Interface
* does not allow duplicate elements
* no guaranteed order
* extends the `Collection` interface
* used to manage unique elements
* efficient for checking the presence of elements, adding, removing

Common implementations:
* `HashSet`
  * not guarantee the order will remain constant over time
  * suitable for fast access with no order
  * `Set<String> hashSet = new HashSet<>();`
  * `hashSet.add("Apple");`
* `LinkedHashSet`
  * the order is maintained according to their insertion order
  * suitable for fast access and predictable iteration order
  * `Set<String> linkedHashSet = new LinkedHashSet<>();`
  * `linkedHashSet.add("Apple");`
* `TreeSet`
  * elements are ordered naturally or by a Comparator provided
  * suitable when need sorted set
  * `Set<String> treeSet = new TreeSet<>();`
  * `treeSet.add("Banana");`

#### `Queue` Interface
* hold elements in FIFO order
* extends the `Collection` interface
* not allow null elements
* have methods for inserting, deleting, inspecting etc.

Common implementations:
* `LinkedList`
* `PriorityQueue`
  * elements are ordered naturally or by a comparator
  * suitable for priority-based order
  * `Queue<Integer> priorityQueue = new PriorityQueue<>();`
  * `priorityQueue.add(5);`, `Integer element = priorityQueue.poll();`
* `ArrayDeque`
  * resizable array
  * used as a FIFO queue or LIFO stack
  * high-performance implementations of queues and stacks
  * `Queue<String> arrayDeque = new ArrayDeque<>();`
  * `arrayDeque.add("First");`, `String element = arrayDeque.poll();`

#### `Map` Interface
* an object that maps the keys to values
* not have an order
* keys are unique and map only one value
* if a duplicate key is added, the new value will replace the old value
* have methods for adding, removing and manipulating key-value pairs

Common implementations:
* `HashMap`
  * suitable for `get` and `put` methods
  * `Map<String, Integer> hashMap = new HashMap<>();`
  * `hashMap.put("Apple", 10);`, `int appleCount = hashMap.get("Apple");`
* `TreeMap`
  * stores the key value in a sorted order or comparator
* `LinkedHashMap`
* `HashTable`

### Stream API

Definition:
* a feature/abstraction for processing sequences of elements
* gives a set of functions that we can perform on data structures
* it allows filtering, mapping and reducing
* can be used to process collections of objects
* Creating a stream from a collection:
  * `List<String> list = Arrays.asList("Apple", "Banana", "Cherry");`
  * `Stream<String> streamFromList = list.stream();`
* Creating a stream from an array:
   * `String[] array = {"Apple", "Banana", "Cherry"};`
   * `Stream<String> streamFromArray = Arrays.stream(array);`
* Creating a stream using `Stream.of()`:
  * `Stream<String> streamOf = Stream.of("Apple", "Banana", "Cherry");` 

Intermediate Operations:
* **filter**: Filters elements based on a predicate.
* **map**: Transforms each element using a function.
* **flatMap**: Flattens nested structures.
* **sorted**: Sorts the elements.
* **distinct**: Removes duplicate elements.
* **limit**: Limits the number of elements.
* **skip**: Skips the first n elements.

Terminal Operations:
* **forEach**: Performs an action for each element.
* **collect**: Collects the elements into a collection.
* **reduce**: Reduces the elements to a single value.
* **count**: Counts the number of elements.
* **findFirst**: Finds the first element.
* **findAny**: Finds any element (useful in parallel streams).
* **allMatch**, **anyMatch**, **noneMatch**: Match elements based on a predicate.

What is the difference between 'map' and 'flatMap' in Streams?
* both are used to transform elements in a stream
* `map` applies a function for each element of the stream and returns a single element
* `flatMap` returns a stream for each element, and you want to flatten into a single stream
* used especially for lists of lists

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

## Generics

Definition:
* language feature that allows classes, ... to operate on types specified by programmer at compile-time
* can write flexible and reusable code
* can define classes, interfaces and methods
* reduces the need for type casting and runtime errors
* <span style="color: red;">don't work with primitive types</span>

How to use:
* `public class Printer <T>` (instead of T you can use whatever you want)
* `Printer<Integer> printer = new Printer<>(23);`
* we can make it work only with certain classes and their extensions/interfaces
  * `public class Printer <T extends Animal>`
  * `public class Printer <T extends Animal & Serializable>`
      * supports only one class and one interface
      * first have to be the class
* for methods
  * `private static <T> void shout (T thingToShout){}` 
  * `private static <T, V> void shout (T thingToShout, V otherThing){}`
  * `private static <T> T void shout (T thingToShout){}`- to return a T type
* Wildcard - for list of different objects
  * `private static void printList(List<?> myList) {}`
  * `List<Integer> intList = new ArrayList<>()` - when use it
  * `private static void printList(List<? extends Animal> myList) {}`

## "Iterator" Interface

Definition:
* interface that provides a standard way to traverse the elements of a collection sequentially
* can iterate over the elements and safely removing during iteration
* `public interface Iterator<E> {
  boolean hasNext();
  E next();
  void remove();
  }`
* `boolean hasNext();` - returns true if the iteration have more elements
* `E next();` - returns the next element in the iteration (`NoSuchElementException` if no more el.)
* `void remove()` - remove the last element returned by the iterator

### Difference between "Iterator" and "ListIterator"

* Both are used for traversing collections
* Iterator Interface:
  * allows forward-only traversal of a collection
  * can be used to traverse list, sets, and queues
* listIterator Interface:
  * bidirectional traversal of lists
  * access the current index

## Optional

Definition:
* a container object
* used as a method return type for "no result" to represent 
* and where using `null` is likely to cause errors

Creating instances:
* `Optional<String> nonEmptyOptional = Optional.of("Hello");` - Throws NullPointerException if argument is null
* `Optional<String> nullableOptional = Optional.ofNullable(null);` - Can hold null
* `Optional<String> emptyOptional = Optional.empty();` - Empty Optional

## Design patterns

Definition:
* standard solutions to common problems
* templates for how to solve a problem in various situation

Types:
* Creational Patterns
* Structural Patterns
* Behavioral Patterns

### Creational Patterns

Definition:
* deal with object creation mechanisms
* create abjects in a manner suitable to the situation
* different ways to create objects

**Examples:**
#### Singleton Pattern
Definition:
* a class that ensures to have only one instance
* provides a global point of access to the instance

When to use:
* Database connection pooling
* logging
* configuration settings

Example:
* to manage a printer connection might be implemented as a Singleton. This avoids multiple
programs trying to print simultaneously

Disadvantages:
* can make testing and code maintainability more challenging
* limited flexibility

**Alternatives:**
* Dependency Injection
* Factory Patterns

#### Dependency Injection _(DI)_
Definition:
* a design pattern used to implement Inversion of Control (IoC) between classes and their dependencies
* help creates more maintainable and testable code
* it's not categorized as a Creational Design Pattern, but it's closely related

_Dependencies_: objects that a class needs to function

_Injection_: the process of providing the required dependencies to a class

Types of Dependency Injection:
* **Constructor Injection**: dependencies are provided through a class constructor
* **Setter Injection**: dep. are provided through setter methods
* **Field Injection**: dep. are injected directly into the fields of a class

##### Inversion of Control _(IoC)_
Definition:
* design principle in which the control of object creation and the flow of the program is inverted
* the control is given to a container framework (Spring)
* make the code easier to maintain and to test

#### Factory Method Pattern
* this pattern defines an interface/abstract class for creating an object
* allows the subclasses to alter the type of objects that will be created
* delegates the instantiation to subclasses, which implements the factory method to create objects
* creating product objects without specifying their concrete classes

Benefits:
* clients are decoupled from the specific classes they instantiate
* new types of products can be introduced without modifying existing code

When use it:
* a class cannot predict the type of objects it needs to create
* a class wants its subclasses to specify the objects it creates

### Structural Patterns

Definition:
* deal with object composition or the way objects are structured
* help to ensure if one part of the system is changed, the rest is not affected
* relationships between the objects

**Examples:**
#### Adapter Pattern
* allows objects with incompatible interfaces to work together by converting one interface to another
* a translator for two systems that naturally don't speak the same language

#### Bridge Pattern
* decouples an abstraction from its implementation so that the two can vary independently
* interface/abstract class which acts as a bridge, making the functionality of concrete classes
  independent from interface implementer classes

#### Decorator Pattern
* allows behaviour to be added to individual objects, without affecting the behaviour of other objects
* this pattern creates a decorator class which wraps the original class and provides additional
functionality while keeping the class methods signature intact


### Behavioral Pattern

Definition:
* deal with objects collaboration and the assignment of responsibilities between objects
* interactions or communications between objects

**Examples:**
#### Strategy Pattern
* defines algorithms, encapsulate and make them interchangeable (one can be used instead of another)
* the algorithm vary independently from clients that use it
* change the behaviour of an object at runtime

How to use it:
* A game character that can use different weapons
* defines the interface for the various strategies
* implement the strategy interface for different types of weapons
* use a strategy to perform an action

#### Observer Pattern
* defines a one-to-many dependency between objects
* when one object changes state, all its dependents are notified and updated automatically
* "helps to reflect all changes done an object to all who depends on them"

How to use it:
* weather station that can be observed by different display units
* define methods for attaching and detaching observers
* defines an update method for observers to implement
* implements the subject interface and notifies observers of changes
* implements the observer interface and updates their state based on subject changes

#### Command Pattern
* encapsulates a request as an object letting you parameterize clients with different requests,
queue or log requests, and support undoable operations


# To do:
* design patterns
  * types of patterns (arhitectural....)
  * 3 at least to learn (the most used)
* solid
  * SRP 