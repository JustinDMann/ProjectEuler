/**
 * Problem 2 - Project Euler
 */
import java.util.Scanner;
import java.util.ArrayList;

class Problem2 {
    public static void main(String[] args) {
    	System.out.println("Find the sum of all even values of Fibonacci's sequence less than X"); // Display the problem prompt
    	System.out.print("What is X? "); // Ask for X to define problem

//Ask the user to input upper bound of problem, and store
		Scanner user_input = new Scanner( System.in); // Create a scanner object called user_input. Can reuse for each input
    	int total;									  // Create a int variable to store input
    	total = user_input.nextInt();				  // Stores next input

//Pick all numbers in Fib sequence less than total
    	ArrayList<Integer> selective = new ArrayList<Integer>();
   		int n = 1;
        selective.add(n);
        for (int i=1;i<total;++i){
            selective.add(n);
            n = selective.get(i)+selective.get(i-1);
            if(n>total){
                break;
            }
        }

//Pick all even numbers in Fib sequence
        ArrayList<Integer> even = new ArrayList<Integer>();

    	for (int j=0;j<selective.size();++j){    		
    		if(selective.get(j) % 2 == 0){
    			even.add(selective.get(j));
    			}
    	}

//Sum all the numbers in your picked out list
    	int sum = 0;
    	for(int k = 0;k<even.size();++k){
    		sum = sum + even.get(k); 
    	}


    	System.out.println(sum);

   // 	}
       
    }
}