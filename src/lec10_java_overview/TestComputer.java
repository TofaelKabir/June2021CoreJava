package lec10_java_overview;

public class TestComputer {

	public static void main(String[] args) {
		// here computer = object, reference variable
		// when a class create an object that is called instantiation
		Computer computer1 = new Computer(); // default constructor initialized
		computer1.computer();

		Computer computer2 = new Computer("Mac", 800, 'C', false); // parameterized constructor is initialized

		Computer computer3 = new Computer("Windows", 750, 'B', true);

		Computer computer4 = new Computer("linux", 850, 'A', true);

		Computer computer5 = new Computer("hjghjg", 778, 'A');
		computer5.myConfiguration("lenovo", 900, 'B', true); // parameterized method initialize

	}

}
