package week3CodingProject;

public class Week3CodingProject {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93,};

	// 1. Programmatically subtract the value of the first element in the array from
	// the value in the last element of the array (i.e. do not use ages[7] in your
	// code). Print the result to the console.
				
			System.out.println(ages [ages.length -1] - ages [0]);
		
	
		// a. Add a new age to your array and repeat the step above to ensure it is dynamic
		// (works for arrays of different lengths).
	
			int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
			System.out.println(ages2 [ages2.length -1] - ages2 [0]);
	
		// b. Use a loop to iterate through the array and calculate the average age. Print
		// the result to the console.
	
			int sum = 0;
			for (int age : ages2) {
				sum += age;
				
			} System.out.println("The avergae age is " + sum / ages2.length);
			
	// 2. Create an array of String called names that contains the following values:
	// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
		// a. Use a loop to iterate through the array and calculate the average number of 
		// letters per name. Print the result to the console.
			
			int sumofLetters = 0;	
			for (String name : names){
				sumofLetters += name.length();
			} System.out.println("The average number of letters in the names is: " + sumofLetters / names.length);
			
		// b. Use a loop to iterate through the array again and concatenate all the names
		// together, separated by spaces, and print the result to the console.				
					
			for(int i = 0; i< names.length; i++) {
				  System.out.print(names[i] + " ");
			} 
			
	//3. How do you access the last element of any array?
			
			int firstArray[] = {1, 2, 3};
			System.out.println("The last element of the array is: " + firstArray[firstArray.length -1]);
	
	//4. How do you access the first element of any array?
			
			System.out.println("The first element of the array is: " + firstArray[0]);
			
	// 5. Create a new array of int called nameLengths. Write a loop to iterate over
	// the previously created names array and add the length of each name to the
	// nameLengths array
		
			int[] namesLengths = new int[names.length];
			
			for (int i = 0; i < names.length; i++) {
				namesLengths[i] = names[i].length();
				System.out.println(namesLengths[i]);
			} 
			
	// 6. Write a loop to iterate over the nameLengths array and calculate the sum
	// of all the elements in the array. Print the result to the console	
			
			int sumOfNameLengths = 0;
			for (int nameLength : namesLengths) {
				sumOfNameLengths += nameLength;
			} 
			System.out.println("The sum of all name lengths is: " + sumOfNameLengths);	
			
	// 7. Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I would expect the method to return “HelloHelloHello”).			
	
			
			String word = "Hello";
			int n = 3;
			String repeatedWord = repeatWord(word, n);
			System.out.println(repeatedWord);
			
			
	// 8.Write a method that takes two Strings, firstName and lastName, and returns
	// a full name (the full name should be the first and the last name as a String
	// separated by a space).			
			
			String firstName = "Post";
			String lastName = "Malone";
			String fullName = createFullName(firstName, lastName);
			
			System.out.println(fullName);
	
	
	// 9. Write a method that takes an array of int and returns true if the sum of
	// all the ints in the array is greater than 100.
	
			int[] arrayQ9 = {100, 35, 45};
			int compare = 100;
		
		
			int sumOfArrayQ9 = 0;
			for (int number : arrayQ9) {
				sumOfArrayQ9 += number;
			}
			boolean isArrayMoreThan100 = compareArrayQ9To100(sumOfArrayQ9, compare);
			System.out.println("Is the sum of arrayQ9 more than 100? " + isArrayMoreThan100);
	
	// 10. Write a method that takes an array of double and returns the average of
	// all the elements in the array.
	
			double [] arrayQ10 = {1.23, 3.34, 5.45, 7.67};
			double lengthOfArray = arrayQ10.length;
		  
			double sumOfArrayQ10 = 0;
			for (double number : arrayQ10) {
		  		sumOfArrayQ10 += number;
			}
			double average = returnsAverage(sumOfArrayQ10,lengthOfArray) ;
			System.out.println("The average for Q10 is: " + average);
	
	// 11. Write a method that takes two arrays of double and returns true if the
	// average of the elements in the first array is greater than the average of the
	// elements in the second array.	 
			
			double[] array1 = {1.12, 2.12, 3.12, 4.12, 50.12};
			double[] array2 = {2.34, 4.34, 6.34, 8.34, 100.34};
			
			int sumOf1 = 0;
			for (double number1 : array1) {
				sumOf1 += number1;
			}double average1 = sumOf1 / array1.length;
			
			int sumOf2 = 0;
			for (double number2 : array2) {
				sumOf2 += number2;
			}double average2 = sumOf2 / array2.length;
			{
			boolean average1IsGreaterThanAverage2 = compareAverage1ToAverage2(average1,average2);
			System.out.println("Is average 1 greater than average 2? " + average1IsGreaterThanAverage2);
			}
			
	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	// a double moneyInPocket, and returns true if it is hot outside and if
	// moneyInPocket is greater than 10.50.	
	
			boolean isHotOutside = true;
			double moneyInPocket = 10.51;		
			boolean willBuy = willBuyDrink (isHotOutside, moneyInPocket);
			System.out.println("Will I buy a drink? " + willBuy);
	
	// 13. Create a method of your own that solves a problem. In comments, write
	// what the method does and why you created it.
		
	// this method is meant to determine if I will get enough sleep in a night by
	// determining if I have completed my homework and if it has driven me crazy :-)
			
			boolean hasCompletedCodingAssignment = true;
			boolean hasGoneCrazy = true;
			
			boolean willSleep = willGetEnoughSleep (hasCompletedCodingAssignment, hasGoneCrazy);
			
			System.out.println("Will I get enough sleep tonight?" + willSleep);
	
	}
		// Q7
		public static String repeatWord(String word, int n) {
		String repeat = word.repeat(n);
		return repeat;
 	}	
		// Q8
		public static String createFullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;	
		}
		
		// Q9
		public static boolean compareArrayQ9To100 (int sumOfArrayQ9, int compare) {
			if (sumOfArrayQ9 > compare) {
				return true;
			} else {
				return false;
			}
		}
		
		//Q10
		
		public static double returnsAverage (double sumOfArrayQ10, double lengthOfArray) {
			double average = sumOfArrayQ10 / lengthOfArray;
			return average;
		}
		
		//Q11
		public static boolean compareAverage1ToAverage2(double average1, double average2 ) {
			if (average1 > average2){
			return true;
			} else {
				return false;
			}
		}

		// Q12
		public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside = true && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
		}
		
		//Q13 
		 public static boolean willGetEnoughSleep(boolean hasCompletedCodingAssignment, boolean hasGoneCrazy) {
			 if (hasCompletedCodingAssignment == true && hasGoneCrazy == false) {
				 return true;
			 } else {
				 return false;
			 }
		 }
}
		