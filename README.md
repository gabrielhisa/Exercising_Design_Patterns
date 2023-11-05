# Exercising Design Patterns

Studying and creating simple design pattern examples to exercise and better understand their structure, their usage and flow of thought behind their design. 
Most of the content was learned and examples derived from the following websites:

 * https://refactoring.guru
 * https://codegym.cc/groups/posts/284-factory-design-pattern

## Factory

Creational pattern thta makes it easier to add new types of products into the program without modifying or breaking the client code.
By creating a common interface of products, it'll be easier to create new types of products when needed by calling a specific factory method, instead of always creating a new object (the factory method is now responsible for it).
This simple example of a pizzeria shows how that can be done:

 * There is a common product interface, which is a pizza, with common methods for all types of pizzas
 * There are some concrete produts, the pizza flavours, such as Mozzarela
 * The factory class will instantiate the pizza concrete products. A new factory class, or even a common factory interface, can be created should more products be needed
 * The client code will call the factory class to instantiate the pizza
 * Should more products be needed, they can be added without modifying the client code, or most parts of the code
 
## Abstract Factory

Applying the creation pattern of abstract factory, which sets a method to create a group of products. In this case, medieval military units.
This is similar to the factory design pattern, but it creates a group of products, all with the same common interface. This ensures each group of products is also the same, and no group will have unpredicted products.
This allows the program to not depend on concrete products and grants greater flexibility should more new groups of products be needed.

 * We have a common 'product' interface for each military unit: infantry, mounted infantry and archers, and concrete products for each, Italian and French units, each with it's own bravado.
 * There is a factory interface with common creator methods for each unit. A concrete factory will then be responsible for creating each unit for its country's army.
 * The Application is the client code, which does not care which factory they're using as they use the abstract interfaces. It'll use the factory type set on it.
 * It is possible to configure which factory will be used in the Application
 * The main class only calls the application. All the work is behind the scenes.
 
## Builder

This creational patter makes the creation of different representations of the same product possible.
By isolating the complex construction of the product from the client code, the code is much more flexible and easier to read.
Each component can be changed at will, and each new product can be set as needed, without changing or creating too much code.
This example shows how to build a simple project using this pattern:

 * Creating a common interface for blade constructs. Should have all the common elements of a bladed object.
 * Made two simple concrete builders, one for knives, one for axes. The object setters are declared in here.
 * Created the product classes: knife and axe.
 * Added the blade component classes: blade, handle, guard and sheath.
 * There is also the director class, that defined the order of the building steps. Uses the build inteface, so it does not know which product is being assembled.
 * The main class will then create a new director object to assemble the product in its correct order. This director object will be used to build a concrete, already defined product based in one of the base products (axe or knife).
 * Then, this predefined product will be assigned to a product object. Now we have a concrete, specific product, assigned to its correct class.
 
## Prototype

The prototype pattern is used when there is need for the code to not depend on the concrete classes.
This can be used when objects are passed from an outer source, and the cloning methods can be used to make the client code independent from the concrete classes cloned.
Created a single example here:

 * Created an abstract class as base for a tree. It has the base atributes a tree should have, the constructors, the override to equals and a clone method.
 * Created two concrete trees, a plastic tree and an oak tree.
 * The OakTree equals method will check if the object is as instance of an OakTree. If it is, it'll check tif the age and area values are alike.
 * The PlasticTree equals method does the same, but only comparing the size of the plastic tree.
 * We then create a simple method in the main method to create some objects, then some copies of them with the clone method, and then compara them to check if they're really clones.
 * We create an instance of the plastic tree, then a clone, and add both to the list, one after the other. Then, we create and add an oak tree as well.
 * The comparing method will then populate a list of copies with clones from the previous list. They should be all equal.
 * A simples testing shows that all objects are of the same type, and have the same atribute values. The clone method works.
 
## Singleton

This pattern ensures that a class only has one instance, while providing global access to said instance.
This can be used for loggings, caching, accessing databases, etc.
We do that by creating a private constructor, to restrict its creation by other classes.
We also create a static variable that will be the only instance of the class, and a static public method which will be the global access point of the instance.
You have the option to create a lazy initialization class, which will be created once needed (checkin if the class already have an instance in the constructor), or create it at program start, which would not be the best, though each of the have their ups and dows.

The code example has 3 type of Singletons:
 * The simple one, showing a very simplistic way of creating a singleton by just hiding its constructor and implementing a static creation method
 * The second one shows what happens with the Singleton on a multithread environment: multiple instances of the class can be created when each thread calls them simultaneously
 * This is then corrected in thread safe class, by synchronizing the threads during the class' first instantiation
 * Thread safe class makes use of the volatile keyword, which will make changes to the instance visible to all threads, and the synchronized option makes possible for only one thread to access the class at a time, while the others wait
