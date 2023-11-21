# Exercising Design Patterns

Studying and creating simple design pattern examples to practice and better understand their structure, usage, and the thought process behind their design. Most of the content was learned, and examples were derived from the following websites:

* [Refactoring Guru](https://refactoring.guru)
* [CodeGym](https://codegym.cc/groups/posts/284-factory-design-pattern)

# Creational Design Patterns

Patterns that provide object creation mechanisms for increased flexibility and code reusability.

## Factory

A creational pattern that makes it easier to add new types of products into the program without modifying or breaking the client code. By creating a common interface for products, it becomes easier to create new types of products when needed by calling a specific factory method, instead of always creating a new object (the factory method is now responsible for it). This simple pizzeria example illustrates how it can be done:

* There is a common product interface, which is a pizza, with common methods for all types of pizzas.
* There are some concrete products, the pizza flavors, such as Mozzarella.
* The factory class will instantiate the pizza concrete products. A new factory class, or even a common factory interface, can be created should more products be needed.
* The client code will call the factory class to instantiate the pizza.
* Should more products be needed, they can be added without modifying the client code or most parts of the code.

## Abstract Factory

Applying the creation pattern of the abstract factory, which defines a method to create a group of products. In this case, medieval military units. This is similar to the factory design pattern, but it creates a group of products, all with the same common interface. This ensures that each group of products is the same, and no group will have unexpected products. This allows the program not to depend on concrete products and grants greater flexibility should more new groups of products be needed.

* We have a common 'product' interface for each military unit: infantry, mounted infantry, and archers, and concrete products for each, Italian and French units, each with its own bravado.
* There is a factory interface with common creator methods for each unit. A concrete factory will then be responsible for creating each unit for its country's army.
* The Application is the client code, which does not care which factory they're using as they use the abstract interfaces. It'll use the factory type set on it.
* It is possible to configure which factory will be used in the Application.
* The main class only calls the application. All the work is behind the scenes.

## Builder

This creational pattern makes the creation of different representations of the same product possible. By isolating the complex construction of the product from the client code, the code is much more flexible and easier to read. Each component can be changed at will, and each new product can be set as needed, without changing or creating too much code. This example shows how to build a simple project using this pattern:

* Creating a common interface for blade constructs. It should have all the common elements of a bladed object.
* Made two simple concrete builders, one for knives, one for axes. The object setters are declared in here.
* Created the product classes: knife and axe.
* Added the blade component classes: blade, handle, guard, and sheath.
* There is also the director class, which defines the order of the building steps. It uses the build interface, so it does not know which product is being assembled.
* The main class will then create a new director object to assemble the product in its correct order. This director object will be used to build a concrete, already defined product based on one of the base products (axe or knife).
* Then, this predefined product will be assigned to a product object. Now we have a concrete, specific product, assigned to its correct class.

## Prototype

The prototype pattern is used when there is a need for the code not to depend on the concrete classes. This can be used when objects are passed from an outer source, and the cloning methods can be used to make the client code independent from the concrete classes cloned. Created a single example here:

* Created an abstract class as the base for a tree. It has the base attributes a tree should have, the constructors, the override to equals, and a clone method.
* Created two concrete trees, a plastic tree and an oak tree.
* The OakTree equals method will check if the object is an instance of an OakTree. If it is, it'll check if the age and area values are alike.
* The PlasticTree equals method does the same but only compares the size of the plastic tree.
* We then create a simple method in the main class to create some objects, then some copies of them with the clone method and then compare them to check if they're really clones.
* We create an instance of the plastic tree, then a clone, and add both to the list, one after the other. Then, we create and add an oak tree as well.
* The comparing method will then populate a list of copies with clones from the previous list. They should all be equal.
* A simple test shows that all objects are of the same type and have the same attribute values. The clone method works.

## Singleton

This pattern ensures that a class only has one instance while providing global access to that instance. This can be used for logging, caching, accessing databases, etc. We do that by creating a private constructor to restrict its creation by other classes. We also create a static variable that will be the only instance of the class and a static public method, which will be the global access point of the instance. You have the option to create a lazy initialization class, which will be created once needed (checking if the class already has an instance in the constructor), or create it at program start, which would not be the best, though each of them has its ups and downs.

The code example has three types of Singletons:
* The simple one shows a very simplistic way of creating a singleton by just hiding its constructor and implementing a static creation method.
* The second one shows what happens with the Singleton in a multithreaded environment: multiple instances of the class can be created when each thread calls them simultaneously.
* This is then corrected in the thread-safe class by synchronizing the threads during the class's first instantiation.
* The thread-safe class makes use of the volatile keyword, which makes changes to the instance visible to all threads, and the synchronized option makes it possible for only one thread to access the class at a time, while the others wait.

# Structural Design Patterns

## Adapter

This is done with the adapter class getting an interface from one of the objects. By using this interface, the adapter can call the necessary methods. Then, the adapter passes the information to the other object in a way it can understand the information.

I tried using a very simple example using chargers:

 * I have a class for a triple-plugged charger, and another for a triple-holed socket.
 * The charger cannot be used with a double-holed socket because the charger does not fit.
 * By creating an adapter class, which extends the triple socket, we can change the method to make the charger accept the double-holed socket.
 * I know this example is rather too simple, but I liked the reference to a real-world adapter.

This could be used to translate JSON to XML, for instance, or MP3 to WAV files as well.

## Bridge

This pattern helps split a large class or set of them into two separate hierarchies and then relate them with each other without the need to create a class for each combination of abstraction and implementation. For instance, let us consider a class that has shapes and another class that has colors. If you chose to create a new class for each combination of the two, you'll end up with a lot of classes, not even considering if a new shape or color is created. The bridge class helps combine both classes using a single class, removing the need for creating a class for each combination.

Using the simple example above to illustrate how the bridge pattern could be used:

 * We have two separate classes, shapes and colors. Without the bridge class, we'd have to create a new class for each combination of both.
 * With the bridge class, we can implement the shape interface to use its methods and create a new instance of a color inside the bridge class.
 * This way, we can use both classes and create new combinations of shapes and colors inside it, then return them as we wish.
 
## Composite

Allows the composition of objects in a tree structure, to work with them as if they were individual objects.
For instance, what if I have a pallet, with boxes of vegan milk, and I wanted to know the total price of the pallet?
Instead of unwrapping the classes and summing the cost, we can attribute a common interface to all of them and use methods to calculate their price. There'd be no need to know the object of each class, as the method would be called and passed down the tree.

Using boxes of products as an example:
 * All of them have the same common interface: a product component with a method to print their values and to get their price
 * We create the product itself as a leaf in the tree, which is a carton of vegan milk
 * This carton can be added into boxes
 * Which can be added into a pallet. Boxes have a set ammount of cartons, and the same applies to pallets
 * If I want to know the price of an entire box, all I have to do is to set the getPrice method to sum all of the carton inside the box. The same would then be applied to the pallet, summing all the boxes in the pallet
 
Most of the work is done by the leaf component.
This is a simple way to understand how many components inside other components can bring information upwards in the structure.

## Decorator (really like in decorating something)

This pattern wraps an object with decorators, which add or alter the behaviour of the original object. Like creating a new class, but instead, you 'reuse' the original class and add to its behaviour, without modifying its structure.

This is a very, very simple example of a real life usage of the decorator pattern:
 * Let's say I have a program that makes reports. The basic report is just a simple document
 * The decorator could be used to decorate this document with color accessibility, or maybe special text for those with dyslexia.
 * This could be done by creating a common interface for all documents. A basic document would implement this interface.
 * We then create an abstract decorator, which implements the same interface and creates a protected instance of the document object.
 * Concrete decoratos would then add to the method of creating creating the document
 
## Facade

Provides a simplified interface to a library, a framework, or any other complex set of classes. Provides a unified interface to a set of interfaces, which would be good to separate the interface from the complexity of many sub systems.

 * In this example, we create some interfaces (not the class type) that a home theater uses
 * All of them can be called in a 'master' class, the facade, that calls them
 * This would be the main interface between the user and the entire system
 
This pattern can end up creating a 'god object', which would be a an anti pattern, so care must be taken to avoid this.

## Flyweight

This is a tough one. This pattern is used to minimize memory usage by sharing as much resources possible with related objects, like when a large number of similar objects need to be created and used, and the shared state among them can be extracted and managed externally (from the objects).

The idea is to separate intrinsic and extrinsic states of an object.
 * Intrinsic state is part of the object that can be shared among multiple instances
 * Extrinsic state is the part that varies and must be stored separately for each instance
 
The main components of the pattern are:
 * Interface/Abstract class - Defines the interface through which concrete flyweights are able to receive and act on extrinsic (stored separately for each instance) state. Has methods that allows the client to pass the extrinsic state to the flyweight.
 * Concrete Flyweight - The actual flyweight implementation. Contains the intrinsic state, which can be shared, and it relies on extrinsic state provided by the client to perform its operation.
 * Flywight Factory - Manages and creates the flywight objects. Should have a data structure to store and call the flyweights when needed.
 * Client, responsible for managing the extrinsic states and passing it into the flyweights
 
This simple example uses a text editor that optimizes the memory usage of characters. This program should use the same object to show each character used in a phrase in the client code. The intrinsic state is shared among instances of the object. So, for instance, if I print an 'a' character, it will use the same object stored in the 'cache' we created.
