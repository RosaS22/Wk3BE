package openclass;

import java.util.Scanner;

public class OpenClassWeek03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Open Class Week 3");
int day = 6;

int month = 6;

boolean isSummer = month >= 6 && month <= 8;
boolean isWeekday = day <= 6;

if (isSummer || !isWeekday) {

  System.out.println("Definitely going to sleep in!");

} else {

  System.out.println("Probably need to wake up at a decent time.");

	}


for (int index = 0; index <= 9; index++) {
	  System.out.println(index);
}

String name = "Tommy";
int age = 52;

if (name == "Tommy" ) {
	System.out.println("Hi, Tommy!");
} else if (age == 52) {
	System.out.println("52 years old.");
}
System.out.println("Out of conditional.");




double moneyInWallet = 4.50;
double costOfMilk = 1.99;

if (moneyInWallet >= costOfMilk * 2) {
	System.out.println("Let's buy two gallons.");
} else if (moneyInWallet >= costOfMilk) {
	System.out.println("Let's buy one gallon.");
} else {
	System.out.println("Way too expensive!");
}

//boolean loggedIn = false;
//Scanner sc = new Scanner(System.in);
//for (int i = 1; i < 4; i++) {
//		System.out.println("Enter Username: ");
//		String username = sc.nextLine();
//		System.out.println("Enter password: ");
//		String password = sc.nextLine();
//		if (username.equals("samy123") && password.equals("12345")) {
//			System.out.println("Welcome back " + username);
//			loggedIn = true;
//			break;
//		} else {
//			System.out.println("Inaccurate");
//		}
//	}
//	if (!loggedIn) {
//		System.out.println("You are locked out!");
//}
	//Post test loop construct 
//	int n = 10;
//	
//	do {
//		Scanner prompt = new Scanner(System.in);
//		System.out.println("Enter a number below: ");
//		n = prompt.nextInt();
//		
//	} while (n < 10);
	
//Pre test loop construct
//	while (n < 10) {
//		Scanner prompt = new Scanner(System.in);
//		System.out.println("Enter a number below: ");
//		n = prompt.nextInt();
//	} 
	















	}
}


