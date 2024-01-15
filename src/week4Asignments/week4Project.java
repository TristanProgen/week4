package week4Asignments;

import java.util.Arrays;

public class week4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	a. 	Programmatically subtract the value of the first element in the array 
		from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.

 	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
 		i. Make sure that there are 9 elements of type int in this new array.  

		ii. Repeat the subtraction from Step 1.a. 
			(Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
	
	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
*/
		
		
		System.out.println("\n" + "\n" + "******************************************************************************************************" 
	   + "\n" + "\n");
		System.out.println("QUESTION 1" + "\n" + "\n");
		System.out.println("1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.\n"
				+ "	a. 	Programmatically subtract the value of the first element in the array \n"
				+ "		from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.\n"
				+ "\n"
				+ " 	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).\n"
				+ " 		i. Make sure that there are 9 elements of type int in this new array.  \n"
				+ "\n"
				+ "		ii. Repeat the subtraction from Step 1.a. \n"
				+ "			(Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). \n"
				+ "\n"
				+ "		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).\n"
				+ "	\n"
				+ "	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console." + "\n" + "\n");
		
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		firstAndLast(ages);
		
		
		int[] ages2 = {10, 7, 19, 15, 25, 63, 5, 95, 43 };
		firstAndLast(ages2);
		printAvg(ages2);
		
		
		


/**2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	b. Use a loop to iterate through the array again and 
	   concatenate all the names together, separated by spaces, and print the result to the console.
*/		
		
		System.out.println("\n" + "\n" + "******************************************************************************************************" 
	   + "\n" + "\n");
		System.out.println("QUESTION 2" + "\n" + "\n");
		System.out.println("2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.\n"
				+ "	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.\n"
				+ "	b. Use a loop to iterate through the array again and \n"
				+ "	   concatenate all the names together, separated by spaces, and print the result to the console.");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		avgNumLetters(names);
		concatNames(names);
		
		
		
		
		
//3. How do you access the last element of any array?
		//  you access the elements of an array using using the element index number for example for a the above names array 
		System.out.println("\n" + "\n" + "******************************************************************************************************" 
				   + "\n" + "\n");
		System.out.println("QUESTION 3"  + "\n" + "\n");
		
		System.out.println("\t" + "How do you access the last element of any array?" + "\n");
		System.out.println("\t" + "You use the index number  ..." + '\n' + '\n' +
				'\t' + Arrays.toString(names)+ "\n");
		System.out.println('\t' + "Arrray index numbers start counting at 0 so in the above array" + "\n" + "\t" +
				"Sam = 0, Tommy = 1 Tim = 2 and so on ...");
		System.out.println("\t" + "the length property of an array returns the total number of elements in the array " + "\n" + "\t" +
				"so you can find the last element of the array by subtractign 1 form the length  " + "\n" + "\t" +
				"For the above array called 'names'  names[5] will return the same as names[names.lenght - 1]" + "\n" + "\n");
		System.out.println("\t" + "System.out.println(names[5]);");
		System.out.println("\t" + names[5] + "\n");
		System.out.println("\t" + "System.out.println(names[names.lenght -1]);");
		System.out.println("\t" + names[names.length -1] + "\n");
		
	
		
		System.out.println("******************************************************************************************************" + '\n' + '\n');
		
		
//4. How do you access the first element of any array?
		
		System.out.println("\n" + "\n" + "******************************************************************************************************" 
				   + "\n" + "\n");
		System.out.println("QUESTION 4"  + "\n" + "\n");
		
		
		System.out.println("\t" + "How do you access the first element of any array?" + "\n");
		System.out.println("\t" + "The first element of an array is allways at index 0");
		System.out.println("\t" +  Arrays.toString(names)+ "\n");
		System.out.println("\t" + "System.out.println(names[0]);");
		System.out.println("\t" + names[0] + "\n");
		System.out.println("******************************************************************************************************" + '\n' + '\n');
		
		
//
//5. Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		System.out.println("\n" + "\n" + "******************************************************************************************************" 
				   + "\n" + "\n");
		System.out.println("QUESTION 5"  + "\n" + "\n");
		
		System.out.println("5. Create a new array of int called nameLengths. \n"
				+ "	Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.");
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i ++) {
			nameLengths[i] = names[i].length();	
			
		}
		
		System.out.println("\t" + "The names array is " + Arrays.toString(names));
		System.out.println("\t" + "The nameLengths array is " + Arrays.toString(nameLengths) + "\n");
		
		
//
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
				   + "\n" + "\n");
	System.out.println("QUESTION 6"  + "\n" + "\n");
	System.out.println("6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console." + 
	"\n" + "\n");
	
		int lengthSum = 0;
			for(int length : nameLengths) {
				lengthSum += length;
		
			}

	System.out.println("\t" + "The nameLenght array is " + Arrays.toString(nameLengths));
	System.out.println("\t" + "The sum of all the elements in the array is " + lengthSum + "\n");
		
	
//
/**7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	*/
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 7"  + "\n" + "\n");
	System.out.println("7. Write a method that takes a String, word, and an int, n, as arguments "
			+ "\n and returns the word concatenated to itself n number of times. "
			+ "\n (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).\n"
			+ "	");
	String example = "hello";
	
	String concatExample = concatString(example, 4);
	
	System.out.println("\t" + "\n" + "Starting string is  " + example + "\n" + "\n" + "\t" + "int passed to method is 4");
	
	System.out.println("\t" + "\n" + "New string is " +  "\n" + "\n" + "\t" + concatExample);
	
	
	
	
	
//
/**8. 	Write a method that takes two Strings, 
		firstName and lastName, and returns a full name 
		(the full name should be the first and the last name as a String separated by a space).
**/
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 8"  + "\n" + "\n");
	System.out.println("8. 	Write a method that takes two Strings, \n"
			+ "		firstName and lastName, and returns a full name \n"
			+ "		(the full name should be the first and the last name as a String separated by a space)." + "\n" + "\n");
	
	
	String firstName = "Bob";
	String lastName = "Dobolina";
	String fullName = fullName(firstName, lastName);
	
	System.out.println("\t" + "First name is " + firstName  + "\n" +
			           "\t" + "Last name is " + lastName + "\n" +
			           "\t" + "Full name is " + fullName  + "\n");
			
	
	
	
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 9"  + "\n" + "\n");
	System.out.println("9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.");
	
	int[] arrExample = {12,45,16,72,7,9};
	System.out.println("\n" + "\t" + "The arrExample = " + Arrays.toString(arrExample) + "\n" + "\n" );
	
	int arrSum = 0;
	for (int item : arrExample) {
		
		arrSum += item;
		
	}
	
	System.out.println("\t" + " The sum of all the array elements is " + String.valueOf(arrSum) + "\n" + "\n"
			+ "\t" + " Is the sum Greater than 100?" +"\n\n");
	System.out.println("\t" + "System.out.println(over100(arrExample));\n"
			+ "	");
	
	System.out.println("\t" + over100(arrExample));
	
	
	
	
	
	
	
//
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 10"  + "\n" + "\n");
	System.out.println("10. Write a method that takes an array of double and returns the average of all the elements in the array." + " \n");
	
	double[] dbarrExample = {15.5, 100.1, 3.14, 17.8901};
	System.out.println("\n" + "\t" + "The example array dbarrExample is : " + Arrays.toString(dbarrExample) + "\n");
	System.out.println("\n" + "\t" + "Total elements in the array is : " +  String.valueOf(dbarrExample.length) );
	System.out.println("\n" + "\t" + "Average value of all the elements in the array is : " + String.valueOf(avgDouble(dbarrExample))  );
	System.out.println("\n" + "\t" + "System.out.println(String.valueOf(avgDouble(dbarrExample))); " + String.valueOf(avgDouble(dbarrExample)) );
	
	
	
	
//
/**11. Write a method that takes two arrays of double and returns true 
		if the average of the elements in the first array is greater than the average of the elements in the second array. **/
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 11"  + "\n" + "\n");
	System.out.println("11. Write a method that takes two arrays of double and returns true \n"
			+ "if the average of the elements in the first array is greater than the average of the elements in the second array." + "\n" + "\n");
	
	double[] arr1 = {1.7, 43.22, 16.9, 100.45, 7.8};
	double[] arr2 = {9.6, 22.5, 367.45, 16.9 };
	System.out.println("\t" + "Is the First array average larger than the second array average?  : " + String.valueOf(largerAvg(arr1, arr2)));
	;
//
/**12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
	and a double moneyInPocket, and returns true if it is hot outside 
	and if moneyInPocket is greater than 10.50. **/
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 12"  + "\n" + "\n");
	System.out.println("12. Write a method called willBuyDrink that takes a boolean isHotOutside, \n"
			+ "	and a double moneyInPocket, and returns true if it is hot outside \n"
			+ "	and if moneyInPocket is greater than 10.50" + "\n" + "\n");
	
	boolean hotEnough = true; 
	double moneyInPocket = 100.42;
	
	System.out.println("\t" + "boolean hotEnough = true; " +"\n");
	System.out.println("\t" + "double moneyInPocket = 100.42; " +"\n");
	System.out.println("\n" + "\t" + "Will I buy a drink? : " + String.valueOf(willBuyDrink(hotEnough, moneyInPocket)));
	System.out.println("\n" + "\t" + "willBuyDrink(hotEnough, moneyInPocket);");
	
	
	
	
	
	
	
	
	
//
/**13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 * 
 * To be used in loops when printing out numbers to add the correct suffix 
 * 
	
	**/
	
	
	System.out.println("\n" + "\n" + "******************************************************************************************************" 
			   + "\n" + "\n");
	System.out.println("QUESTION 13"  + "\n" + "\n");
	System.out.println("13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.\n"
			+ " * \n"
			+ " * To be used in loops when printing out numbers to add the correct suffix ");
	
	for (int i = 1; i <= 100; i ++) {
		
		System.out.println("\t" + "This is the " + String.valueOf(i) + numSuffix(i) + " number");
		
	}



	}

//	method that programmatically subtract the value of the first element in an array 
//	from the value in the last element of the array
//	Question 1
	public static void firstAndLast(int[] arr){
		
		int result = (arr[arr.length - 1] ) - arr[0];
		System.out.println("\n" + "\n");
		System.out.println('\t' + "The array is " + Arrays.toString(arr));
		System.out.println('\t' + "The last number in the array is " + arr[arr.length -1]);
		System.out.println('\t' + "The first number in the array is " + arr[0]);
		System.out.println('\t' + "The last number in the array minus the first number in the array is " + result + '\n'+ '\n');
		System.out.println("\n" + "\n");
		
		
		
	}
	
// Question 1 Uses a loop to iterate through the array and calculate the average age. Print the result to the console.
	
	public static void printAvg(int[] arr) {
		int sum = 0;
		for (int item : arr) {
		sum += item;	
		
		}
		int avg = sum / arr.length;
		System.out.println("\n" + "\n");
		System.out.println('\t' + "The array is " + Arrays.toString(arr));
		System.out.println('\t' + "There are " + arr.length + " elements in the array " );
		System.out.println('\t' + "The average value of all the elements is " + avg + '\n'+ '\n');
		System.out.println("\n" + "\n");
		
	}
	
	// Question 2 prints average number of letters per string in a string array 
	
	public static void avgNumLetters(String[] names) {
		
		double sum = 0;
		for(String name : names ) {
		 
			sum += name.length();
			
			}
		double avg = (sum / names.length);
		
		System.out.println("\n" + "\n");
		System.out.println('\t' + "The Array of names is " + Arrays.toString(names));
		System.out.println('\t' + "Total names in the Array is " + names.length);
		System.out.println('\t' + "Sum of all the letters in each name in the  Array is " + sum);
		System.out.println('\t' + "The Average Nyumber of letter per name is  " + avg+ '\n'+ '\n');
		System.out.println("\n" + "\n");
		
	}
	
	// question 6 Concatenates names in a string array separated by spaces 
	
	public static void  concatNames(String[] names) {
		StringBuilder sb = new StringBuilder();
		
		for( String name : names ) {
			
			sb.append(name);
			sb.append(" ");
			
		}
		System.out.println("\n" + "\n");
		System.out.println('\t' + "The Array of names is " + Arrays.toString(names));
		System.out.println('\t' + "The new Concatenated string is  " + '\n' + '\t' + sb + '\n'+ '\n');
		System.out.println("\n" + "\n");
		

		
		
	}
	
	// question 7 repeat word n amount of times in new string 
	
	public static String concatString(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i ++) {
		
		sb.append(word);
		}
			
		return sb.toString();
		
	} 
	
	// question 8 concat first and last name to full name 
	public static String fullName(String firstName, String lastName) {
		StringBuilder fullNameString = new StringBuilder();
		fullNameString.append(firstName);
		fullNameString.append(" ");
		fullNameString.append(lastName);
		
		return fullNameString.toString();
		
	}
	
	// question 9 boolean sum of int array elements is over 100 
	
	public static boolean over100(int[] arr) {
		int total = 0;
		for(int number : arr) {
			total += number;
			
		}
		return (total > 100);
		
	}
	
	// question 10 array of double and returns average value of all elements 
	
	public static double avgDouble(double[] arr) {
		double arrSumDouble = 0.00;
        for(double item : arr) {
        	arrSumDouble += item;
        	
        }
        
       double  avg = arrSumDouble / arr.length;
       
       return avg;
		
		
	}
	
	/**11. Write a method that takes two arrays of double and returns true 
	if the average of the elements in the first array is greater than the average of the elements in the second array. **/
	
	public static boolean largerAvg(double[] arr1, double[] arr2) {
		System.out.println("\n" + "\t" + "The first array is " + Arrays.toString(arr1) + "  The average of the elements is " + avgDouble(arr1) + "\n" +
				 "\t" + "The second array is " + Arrays.toString(arr2) +  "  The average of the elements is " + avgDouble(arr2)) ;
		
		
		return (avgDouble(arr1) > avgDouble(arr2));
		
	}
	
	/**12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
	and a double moneyInPocket, and returns true if it is hot outside 
	and if moneyInPocket is greater than 10.50. **/
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			
			return false;
		}
		  
		
		
	}
	
	 
	 /* Question 13 - create my own method 
	  * :To be used in loops when printing out numbers to add the correct suffix 
	  ***/
	public static String  numSuffix(int num) {
		  
		
		// ad rd ending if the number ends in 3 but is not 13
	       if (num % 10 == 3 && num  !=13){
	    	  
	    	   return "rd";
	    // add nd ending if the number ends in 2 but is not 12 	   
	       }  else if (num % 10 == 2 && num  != 12) {
	    	   
	    	   return "nd";
	    // add st ending if the number ends in 1 but is not 11    
	       }  else if (num % 10 == 1 && num  != 11) {
	    	   
	    	   return "st";
	    // all other numbers will get the th ending    
	       } else {
	    	   
	    	   return "th"; 
	    	   
	       }
	       
	}
	          

	
	
	
	
	
	

}
