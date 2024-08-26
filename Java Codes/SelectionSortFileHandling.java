package Codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelectionSortFileHandling {

	public static void main(String[] args) {
	        // Initialize an array of words to be sorted
		
		List<String> wordsList = new ArrayList<>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\WORD.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				wordsList.add(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			return;
			
		}
		
	 String[] words = wordsList.toArray(new String[0]);

	        // Get the length of the array
	        int n = words.length;

	        // Iterate through the array
	        for (int i = 0; i < n - 1; i++) {
	            // Find the index of the minimum element in the unsorted part of the array
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (words[j].compareTo(words[minIndex]) < 0) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element in the unsorted part
	            String temp = words[i];
	            words[i] = words[minIndex];
	            words[minIndex] = temp;
	        }

	        // Print the sorted array
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
	}


