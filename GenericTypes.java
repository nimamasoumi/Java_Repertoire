import java.math.BigInteger;

public class GenericTypes {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println("To see if we need a new line.");

		// Learned System.out.print()
		System.out.print("I ate some tahini.");
		System.out.print("Then I had some banana milkshake.\n");

		// Some sketchy examples
		System.out.println(13);
		System.out.println(3+7+9);

		/* Testing the multiline comment
		To see whether it works 
		Then let's make some Java variables: String  int  float  char  boolean*/
		String name = "Amin";
		int age = 31;  // signed 32 bits
		double height = 171.3; // double-precision 64-bit
		char bloodType = 'A'; // 16-bit Unicode character
		boolean ready = true;

		int nums1 = 13, nums2 = 19, nums3 = 7;
		final double pi = 3.14;
		String x, y, z;
		x = y = z = "chocolate";

		// Testing float and its difference with double
		float num4 = 3.9f; // single-precision 32-bit

		// Testing unconventional data types
		byte num5 = -7; // signed 8 bits
		short num6 = -13; // signed 16 bits
		long num7 = 38; // signed 64 bits
		char char2 = '\u0238';
		int hexVal = 0xfff;
		int binVal = 0b111111;
		double sciVal = 1.3e8;
		long speedOfLight = 299_792_458; //representing a large number

		ObjectType gt1 = new ObjectType();
		gt1.CheckObj();
		gt1.o1 = gt1;
		gt1.CheckObj();

		Long num8=37L, num9 = 19L;
		var o2=new Object();
		BigInteger num10 = 23;

		System.out.println("Name: " + name);
		System.out.printf("Age: %s\n", age);
		System.out.printf("Height: %s cm\n", height);
		System.out.println("Blood Type: "+bloodType);
		System.out.printf("Status is ready: %s\n", ready);

		System.out.print("\nTrying out some numbers' formatting: \n");
		System.out.printf("%d %d %d\n", nums1, nums2, nums3);
		System.out.printf("PI = %.3f\n", pi);

		System.out.printf("Making String uppercase: %S\n", x);
		System.out.printf("Set a length for String: %13s\n", y);
		System.out.printf("Left-adjust the String: %-13s%s\n", z, "ice cream");

		System.out.printf("%f %d %d %d\n", num4, num5, num6, num7);		
		System.out.println(char2);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(sciVal);
		System.out.printf("Speed of light is: %,d m/s\n", speedOfLight);

		System.out.println(num8.getClass());
		System.out.println(num8.getClass().getModifiers());
		System.out.println(num9.getClass().getModifiers());
		System.out.println(o2.getClass().getModifiers());
		System.out.println(num8.getClass()==num9.getClass());
		System.out.println(num9.getClass()==o2.getClass());
	}	
}
