package Codes;

public class InsertionSort {
    public static void main(String[] args) {
        // Initialize an array of words to be sorted
        String[] words = {
            "assumption",
            "technology",
            "superior",
            "childish",
            "random",
            "exquisite",
            "logic",
            "logical",
            "computer",
            "AI"
        };

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
