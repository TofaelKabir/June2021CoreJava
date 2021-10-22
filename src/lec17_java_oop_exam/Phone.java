package lec17_java_oop_exam;

/*
 02) Create a package 'java_oop_exam' (The code needs to prepare according to the question): Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. 
 When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible.  [points: 30] .
 */

public interface Phone extends Pager, Wakitaki{

}
