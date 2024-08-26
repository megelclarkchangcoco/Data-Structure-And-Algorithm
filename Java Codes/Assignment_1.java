/*
Machine Problem #1

write a java program that will evaluate the following sorting. algorithm: Bubble Sort, Insertion Sort and Selection Sort

The program shall sort ascendingly a list of favorite movies(give test data) read from a text file by the 3 algo separately, 
the determine as to Best Case, Worst Case or Average Case

Use array of String

Use Function/method for each sorting algo:
	Bubble(String[] List, N); //
	Insertion(String[] List, N);
	Selection(String[] list, N);
*/


package CodeAlgo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {
		
		List<String> wordsList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\WORD.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				wordsList.add(line);
			}
		}catch(IOException e){
			e.printStackTrace();
			return;
		}
		// Convert the list to an array
        String[] words = wordsList.toArray(new String[0]);
 
        boolean runAgain = true;

        while (runAgain) {
            System.out.println(" Select Algorithm :");
            System.out.println("1. Bubble Sort : ");
            System.out.println("2. Insertion Sort : ");
            System.out.println("3. Selection Sort :");
            int itemSelect = input.nextInt();

            switch (itemSelect) {
        	case 1:
        		System.out.println("********************");
        		Bubble(words);        		
                // Print the sorted array         
             break;
        	
        	case 2:
        	    System.out.println("********************");
        	    Insertion(words);       	   
        	    break;
        	case 3:
        		System.out.println("********************");
        		Selection(words);  
        	    break;
        	    
        	 default:
        		 System.out.println("********************");
        		 System.out.println("Invalid numbers");
        		 break;
        		 
        		
        }
            System.out.println("********************");
            System.out.println("Select Algorithm Again? (Y/N) : ");
            String again = input.next();
            if (again.equalsIgnoreCase("N")) {
                runAgain = false;
            }
        }

	}	
	
	// Bubble sort Method 
	public static void Bubble(String[] list) {
		  // Get the length of the array
        int n = list.length;
        int swappedCount =0;

        // Variable to keep track of whether any swaps were made in the current pass
        boolean swapped;

        // Start a do-while loop that continues until no swaps are made in a pass
        do {
            swapped = false; // Assume no swaps have been made in this pass

            // Iterate through the array from the beginning to the second-to-last element
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent words and swap them if they are in the wrong order
                if (list[i].compareTo(list[i + 1]) > 0) {
                    String temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true; // Set swapped to true because a swap was made
                    swappedCount++;
                }
            }
            
            // Reduce the range of comparison as the largest element is now at the end
            n--;
            
        }while (swapped);

        printArrayBubbleSort(list); // print new list and total swapped count
        System.out.println("");
        System.out.println("Total number of swaps: " + swappedCount);
	}
	
	
	// Insertion Sort Method 
	public static void Insertion(String[] list) {
	    // Get the length of the array
	    int n = list.length;

	    // Iterate through the array starting from the second element
	    for (int i = 1; i < n; i++) {
	        String key = list[i];
	        int j = i - 1;

	        // Move elements of words[0..i-1] that are greater than key
	        // to one position ahead of their current position
	        while (j >= 0 && list[j].compareTo(key) > 0) {
	            list[j + 1] = list[j];
	            j = j - 1;
	        }
	        
	        // Place the key (current element) in its correct position
	        list[j + 1] = key;

	        // Print the array after each iteration
	        System.out.println("            ");
	        System.out.print("After iteration " + i + ": ");
	        printArrayInsertionSort(list);
	    }
	}

	// Selection Sort Method
	public static void Selection(String[] list) {
		// Get the length of the array
        int n = list.length;

        // Initialize variables for swap count and iteration count
        int swapCount = 0;
        int iterationCount = 0;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
                iterationCount++;
            }

            // Swap the found minimum element with the first element in the unsorted part
            String temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
            swapCount++;
        }
        printArraySelectionSort(list);
        System.out.println("                    ");
        System.out.println("Total number of swaps: " + swapCount);
        System.out.println("Total number of iterations: " + iterationCount); 
        System.out.println("                    ");
        
	}
	// print new words list of Bubble Sort
	public static void printArrayBubbleSort(String[] list) {
		// Print the sorted array
        for (String word : list) {
            System.out.println(word);
        }
        
 
        
	}
	
	// print new word list of Insertion Sorts
	public static void printArrayInsertionSort(String[] list) {
		// Print the sorted array
        for (String word : list) {
            System.out.println(word);
        }
	}
	
	// print new word list of Selection Sort
	public static void printArraySelectionSort(String[] list) {
		 // Print the sorted array
        for (String word : list) {
            System.out.println(word);
            
        }
	}

}
