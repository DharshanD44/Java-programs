import java.io.*;
class paraconst{
	// constructor with one argument-String datatype
	paraconst(double value)
	{
		System.out.println("Constructor with one "
						+ "argument - Double: " + value);
	}

	// constructor with two arguments
	paraconst(String name, int age)
	{

		System.out.println(
			"Constructor with two arguments -"
			+ " String and Integer : " + name + " " + age);
	}

	// Constructor with one argument but with different datatype
	paraconst(long id)
	{
		System.out.println(
			"Constructor with one argument : "
			+ "Long : " + id);
	}
}

class Execution{
	public static void main(String[] args)
	{
		// Calling the constructor with one arguments of type 'string'
		paraconst pc1 = new paraconst(4.56);

		// Calling the constructor with two arguments
		paraconst pc2 = new paraconst("Deepak", 19);

		// Calling the constructor with one argument of  type 'Long'.
		paraconst pc3 = new paraconst(54578974);
	}
}


