package Codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BubbleSortFileHandling {
    public static void main(String[] args) {
        // Initialize a list to store words
        List<String> wordsList = new ArrayList<>();

        // Read input from the text file
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\WORD.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordsList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Convert the list to an array
        String[] words = wordsList.toArray(new String[0]);

        // Get the length of the array
        int n = words.length;

        // Variable to keep track of whether any swaps were made in the current pass
        boolean swapped;

        // Start a do-while loop that continues until no swaps are made in a pass
        do {
            swapped = false; // Assume no swaps have been made in this pass

            // Iterate through the array from the beginning to the second-to-last element
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent words and swap them if they are in the wrong order
                if (words[i].compareTo(words[i + 1]) > 0) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true; // Set swapped to true because a swap was made
                }
            }

            // Reduce the range of comparison as the largest element is now at the end
            n--;

            // Continue looping until no swaps were made in this pass
        } while (swapped);

        // Print the sorted array
        for (String word : words) {
            System.out.println(word);
        }
    }
}
