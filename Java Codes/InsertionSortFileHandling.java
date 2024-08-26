package Codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsertionSortFileHandling {
    public static void main(String[] args) {
    	
    	List<String> wordsList = new ArrayList<>();
    	
    	try(BufferedReader br = new BufferedReader(new FileReader("C:\\WORD.txt"))){
    		String line;
    		while((line = br.readLine()) != null) {
    			wordsList.add(line);
    		}
    		
    	}catch(IOException e ) {
    		e.printStackTrace();
    		return;
    	}
    	
    	
        
        String[] words = wordsList.toArray(new String[0]);

        // Get the length of the array
        int n = words.length;

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            String key = words[i];
            int j = i - 1;

            // Move elements of words[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && words[j].compareTo(key) > 0) {
                words[j + 1] = words[j];
                j = j - 1;
            }
            
            // Place the key (current element) in its correct position
            words[j + 1] = key;
        }

        // Print the sorted array
        for (String word : words) {
            System.out.println(word);
        }
    }
}

