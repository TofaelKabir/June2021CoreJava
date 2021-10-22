package lec17_java_oop_exam;

/*
 04) Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 30] . 
 * */

/*
 05) Assume 4 private variables -- price (as int), Info (as String, write few words when you bought it), user (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the variables are private how can you use those variable? What kind of concept you can use? use it just after the variables. Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false". [points: 30] . 
 */

/*
 07) Again, from Iphone1, we got 4 private variables we know. Create 2 constructors inside it using that 4 private variables -- default and parameterized after those variables. In IPhone2, declare a char variable userOfIphone2 (M or F). create default and parameterized constructor, a regular method iPhone2Info, a parameterized method with same name iPhone2Info inside Iphone2. Use the super keyword in constructor and methods in Iphone2. Call constructor and methods. Can you call variable by super keyword? create a public variable inside Iphone1 and execute it in Iphone2. Execute all of them in TestPhone. [points: 30]
 */

public class Iphone1 extends AppleWatch implements Phone {
	
	private int price;
	private String Info;
	

}
