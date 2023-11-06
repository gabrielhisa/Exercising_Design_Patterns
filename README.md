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

## Adapter (continued)

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
