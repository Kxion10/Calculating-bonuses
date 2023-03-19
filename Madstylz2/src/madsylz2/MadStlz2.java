package madsylz2;

import java.util.Scanner;

public class MadStlz2 {

	public static void main(String[] args) { 
		// n holds a value for later
		int n;
		int[] bonus = {25,50,100,200};
		
		//scanner for input: # of employees
		Scanner scanner=new Scanner(System.in);  
		System.out.print("Enter the number of employees that you have: ");  
		
		//reading the number of elements from the that we want to enter  
		n=scanner.nextInt(); 
		
		// this loop stores int value of input from scanner as a list going from 0-n
		
		int salesPerson[] = new int [n];
        for (int a = 0; a < salesPerson.length; a++){
            salesPerson[a] = a;
        }
		
		//creates an array for sales with the number of employees  
		int[] sales = new int[n];  
		System.out.println("Enter how much each person made in sales: ");  
		
		// remind to prompt which employee is sales amount is whos
		for(int i=0; i<n; i++)  
		{   
			// prompt who made what 
			System.out.print("Enter the amount for Salesperson #" + salesPerson[i]+": $");
		
			// scanner stores the amount of sales each employee made based off index position 
			sales[i]=scanner.nextInt();
		
		}  
		// for-loop that reads the output in the arrays out  
		for (int i=0; i<n; i++)
			
			// if statement reads bonuses based on sales
			if (sales[i]<= 250 && sales[i]>0)
				{  
				System.out.println("Salesperson #" + salesPerson[i] + " Sales Amount: $"+ sales[i] + " Bonus: $"+bonus[0]); 
				}
			else if (sales[i]<= 500 && sales[i]>200)
				{  
				System.out.println("Salesperson #" + salesPerson[i] + " Sales Amount: $"+ sales[i] + " Bonus: $"+bonus[1]); 
				}  
			else if (sales[i]<= 1000 && sales[i]>500)
				{  
				System.out.println("Salesperson #" + salesPerson[i] + " Sales Amount: $"+ sales[i] + " Bonus: $"+bonus[2]); 
				} 
			else if (sales[i]>1000)
				{  
				System.out.println("Salesperson #" + salesPerson[i] + " Sales Amount: $"+ sales[i] + " Bonus: $"+bonus[3]); 
				} 
			
		scanner.close();
		}  
		} 



