package day25_05_10_2022;

public class Abstraction {

    /*

What is Abstraction ?


	- Abstraction:
				   Focus on essentials , not worry about details
				   Focus on name of actions , not worry about implementation
				   Hiding implementation

	- Abstraction can be done in 2 ways: Abstract Classes, Interface

	- Abstraction helps with "organazing the code", "reusing the code", "less duplicate code"

	- Abstraction cannot exist without inheritance


1- ABSTRACT CLASSES

How can we create abstract class ?

	- Abstract keyword is used to create abstract classes
	- An abstract class can not be instantiated (we cant create OBJECT from this CLASS)
	- Goal is to provide reusable variables and methods to sub classes
	- Abstract Class can have non-abstract and abstract methods
	- Abstract Class can not be  final
	- Can have everything the regular class can have + abstract methods
	- So abstract class only shows WHAT it can do, but not HOW by using abstract methods.


- Methods

	- abstract keyword is used to create abstract method
	- Abstract method does not have body, only have signature
	- Abstract methods may not be declared private or final,static
	- Abstract methods may only be defined in abstract classes OR interfaces
	- Implementing an abstract method in a subclass follows the same rules for overriding a method


		Ex :public abstract void update();


- Concrete Class

	- A subClass of abstract Class
	- FIRST CONCRETE class MUST implement all inherited abstract methods




     */
}
