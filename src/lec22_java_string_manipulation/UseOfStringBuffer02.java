package lec22_java_string_manipulation;

//Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
//Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
// A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings.

public class UseOfStringBuffer02 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello "); // It creates a String Builder with the specified string.
		System.out.println(sb);
		// The append() method concatenates the given argument with this String
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		// The insert() method inserts the given String with this string at the given
		// position.
		StringBuilder sb2 = new StringBuilder("Wme to Java");
		sb2.insert(1, "elco");// now original string is changed
		System.out.println(sb2);

		// The replace() method replaces the given String from the specified beginIndex
		// and endIndex.
		StringBuilder sb3 = new StringBuilder("Welcomi oo Javascript");
		sb3.replace(6, 10, "e to");
		System.out.println(sb3);

		// The delete() method of the StringBuffer class deletes the String from the
		// specified beginIndex to endIndex.
		sb.delete(0, 6); // sb = Hello Java
		System.out.println(sb); // outcome: Java

		// The reverse() method of the StringBuilder class reverses the current String.
		sb.reverse(); // Java
		System.out.println(sb);// prints avaJ

		// The capacity() method of the StringBuffer class returns the current capacity
		// of the buffer. The default capacity of the buffer is 16.

		StringBuilder sb4 = new StringBuilder();
		System.out.println(sb4.capacity());// default 16
		sb4.append("Hello");
		System.out.println(sb4.capacity());// now 16
		sb4.append("java is my favourite language");
		System.out.println(sb4.capacity()); // formula: (16*2)+2=34 i.e (oldcapacity*2)+2
		sb4.ensureCapacity(10); // now no change
		System.out.println(sb4.capacity());// now 34
		sb4.ensureCapacity(50);
		System.out.println(sb4.capacity()); // now (34*2)+2

	}

}
