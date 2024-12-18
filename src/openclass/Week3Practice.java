package openclass;

public class Week3Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Different ways to set up an array and print them:");
//		Square Brackets or [] tell Java that we are declaring  an array
//		element:  each item stored in an array is called an element
//		elements within the same Java array must all be the same data type.
//		index:  each element in an array is found or accessed by its numerical index.
//		arrays are zero-based, so the index values start at 0.
//		the first element in any array is located at index:  0
//		the last element of any array is located at index:   arrayName.length - 1
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String [] students = new String[3]; 
		//an array starts at 0 so 3 in an array is 0, 1, 2
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("Enhanced for loop:");
		//enhanced
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println("More Arrays: ");
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int [] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		int [] multiplesOf5 = new int[10];
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}
		
		System.out.println("Methods: ");
		
		 String firstName = "Bob";
		 String lastName = "Ross";
		 String fullName = createFullName(firstName, lastName);
		 
		 System.out.println(fullName);
		
		
		
	}
//method signature - you have to point out what they are and what they do. Not all methods have to return anything. 
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	
	}
	
}
