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
 
