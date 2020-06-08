package day48_Abstraction;

public class PhoneObjects {
	public static void main(String[] args) {
		IPhone iphone1 = new IPhone("X", 1000, "10 inches");
		IPhone iphone2 = new IPhone("8", 900, "8 inches");
		
		System.out.println(iphone1);
		System.out.println(iphone2);
		
		iphone1.faceTiming(123456);
		iphone1.calling(911);
		iphone1.texting(987456);
		
		// iphone1.freezing();
		
		System.out.println("===============================");
		
		Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");
		
		System.out.println(samsung1);
		
		samsung1.calling(123456);
		// samsung1.faceTiming(123456);
		samsung1.freezing();
		
		samsung1.texting(123456);
		
		
	}
	
}
