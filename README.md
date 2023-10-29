# Exercising Design Patterns

Studying and creating simple design pattern examples to exercise and better understand their structure, their usage and flow of thought behind their design. 

## Factory

Creational pattern makes it easier to add new types of products into the program without modifying or breaking the client code.
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

 * Creating a common interface for blade constructs. Should have all the common elements of a bladed object.
 * Made two simple concrete builders, one for knives, one for axes. The object setters are declared in here.
 * Created the product classes: knife and axe.
 * Added the blade component classes: blade, handle, guard and sheath.
 * There is also the director class, that defined the order of the building steps. Uses the build inteface, so it does not know which product is being assembled.
 * The main class will then create a new director object to assemble the product in its correct order. This director object will be used to build a concrete, already defined product based in one of the base products (axe or knife).
 * Then, this predefined product will be assigned to a product object. Now we have a concrete, specific product, assigned to its correct class.
