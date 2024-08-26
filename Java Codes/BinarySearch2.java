package Codes;

import java.util.Scanner;

public class BinarySearch2 {
    int index = -1; // Initialize the index for the search result
    int comparisonCount = 0; // Initialize the comparison count
    int low = 0; // Initialize the lower bound of the search range
    int high; // Declare the upper bound of the search range
    int mid; // Declare the midpoint of the search range

    // The binarySearch method performs binary search on the given list array for the specified item
    public int binarySearch(String item, String[] list) {
        high = list.length - 1; // Initialize the upper bound based on the length of the list

        // Continue to search for the search term until we find it or 
        // until our 'low' and 'high' marks cross
        while (high >= low) {
            mid = (high + low) / 2; // Calculate the midpoint of the current array
            comparisonCount++; // Increment the comparison count

            // Compare the search term with the value at the midpoint
            if (item.compareTo(list[mid]) < 0) {
                high = mid - 1; // Adjust the upper bound
            } else if (item.compareTo(list[mid]) > 0) {
                low = mid + 1; // Adjust the lower bound
            } else {
                index = mid; // Set the index to the midpoint
                break; // Exit the loop, as the item has been found
            }
        }
        return index; // Return the index of the item (or -1 if not found)
    }

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
        // List of students' names
        String[] students = {"ACE", "ANA", "BOY", "MARY", "NEO", "OSCAR", "PEDRO", "SAMMY", "TEKLA", "ZIA"};
        
        System.out.println("Choose Student name : ACE, ANA, BOY, MARY, NEO, OSCAR, PEDRO, SAMMY, TEKLA, ZIA");
        
        System.out.println("Enter Student's Name:");
        String searchTerm = scan.nextLine().toUpperCase(); // Convert the input to uppercase
        
        // Check if the input contains only alphabetical characters
        if (!searchTerm.matches("^[A-Z]+$")) {
            System.out.println("Invalid input. Please enter a valid student name.");
            scan.close();
            return;
        }

        BinarySearch searcher = new BinarySearch(); // Create an instance of BinarySearch
        int resultIndex = searcher.binarySearch(searchTerm, students); // Perform binary search

        // Display the search result
        if (resultIndex != -1) {
            System.out.println(searchTerm + " found at index " + resultIndex);
        } else {
            System.out.println(searchTerm + " not found in the list");
        }
        
        System.out.println("Number of low : " + searcher.low); // Print low count
        System.out.println("Number of mid: " + searcher.mid); // Print mid count
        System.out.println("Number of high: " + searcher.high); // Print high count
        System.out.println("Number of comparisons: " + searcher.comparisonCount); // Print comparison count       
        
        scan.close();
    }
}

