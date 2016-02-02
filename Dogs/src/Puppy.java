
/** Dawn Norton
 * This is a simple adoption program where every week the pet adoption agency has dogs for adoption.  
 * There is a limit of two dogs per household.
 * You can choose between male or female and up to three different breeds per week.
 *  credit: Jessica Hooper, Elisa, and u-tube
 */


import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Puppy {

	private static Object randomNumbers;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	PuppyClass pup = new PuppyClass();	// declare puppy class
	
	//double counter = 1; //declare counter	
	double total;
	String breed;
	String breed2 = null;
	String yes;
	double sum = 50;
	double puppy = 50;
	String female;
	String male;
	
	
		
	double[] array1 = {50.00, 50.00, 50.00};  //creating an array
	String[][]array2 = {{"Lab -- ", "Beagle -- ", "Boxer -- "},{" male or female ", " male or female, male/female "}};
	
			
		System.out.println(array2[0][0] + array2[1][0] + " " + array1[0]);
		System.out.println(array2[0][2] + array2[1][0] + " " + array1[1]);
		System.out.println(array2[0][1] + array2[1][0] + " " + array1[2]);
		
		
		System.out.println("Please select which dog or dogs you want to adopt there is a limit of two adoptions per family.");
		 breed= userInput.next();
		
		
		System.out.println("Would you like to adopt another dog?");
		yes = userInput.next();

		if(yes.equals("yes"))  //checking to see if you want to adopt another dog
		{
			
			System.out.println("Please enter another breed");
			breed2 = userInput.next();  //next line
			total = puppy + sum;        // holding two names to print out later
						
			System.out.println("The dogs you have selected are " + breed + " and " + breed2 + " your total is $" + total + " and your unique ID number is " + pup.getId());
								
			System.out.println(" Would you like a male or female for your first selection?");  //
			 female = userInput.next();
			 
			 if(female.equals("female"))   //checking if user input is female
			{
			System.out.println("Your female "+ breed + " will be ready for pick up in 20 minutes. ");  //
			}
			else  //checking if condition is not a female
			{
			System.out.println("Your male "+ breed +  " will be ready for pick up in 20 minutes. ");
			}
		}
			
		else
			{	
			total = puppy;
			System.out.println("The dog you selected is a " + breed + " your total is $" + total + " and your unique ID is " + pup.getId());
			}
			String dog = userInput.nextLine();
			
			
			 System.out.println(" Would you like a male or female for your second selection?");
			 female = userInput.next();
			// breed2 = userInput.next();
			
			 
			 if(female.equals("female"))
			{
			System.out.println("Your female "+ breed2 +" will be ready for pick up in 20 minutes. Thank you for your purchase and don't forget to spay and neuter your pets :) ");
			breed2 = userInput.next(); 
			}
			 else
			{
			System.out.println("Your male "+ breed2 +" will be ready for pick up in 20 minutes.  Thank you for your purchase and don't forget to spay and neuter your pets :) ");
			breed2 = userInput.next(); 
			}
						
		}
		
	}		   
	
      
	
	 
	
			


