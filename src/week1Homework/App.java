package week1Homework;

public class App {

	public static void main(String[] args) {
		
	//Number 3 in homework
		int iPhonePrice = 500;
		int moneyInWallet = 1000;
		double numberOfFriends = 100;
		int age = 32;
		String firstName = "Christina";
		String lastName = "Lytle";
		char middleInitial = 'M';
		
	//Number 4 in homework
		int afterBuyingiPhone = moneyInWallet - iPhonePrice;
		double friendsEachYear = numberOfFriends / age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
	//Number 5 in homework
		System.out.println("Money in my wallet after I buy an iPhone is" + " " + "$" + afterBuyingiPhone);
		System.out.println("Number of friends I make each year is" + " " + friendsEachYear);
		System.out.println("My full name is" + " " + fullName);
		

	}

}
