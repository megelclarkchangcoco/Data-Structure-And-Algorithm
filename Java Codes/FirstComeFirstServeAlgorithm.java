package FCFSAlgorithm;

import java.util.Scanner;

public class fcfsAlgorithm {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            // Number of processes
            System.out.print("Enter the number of processes: ");
            int n = sc.nextInt();

            int[] arrivalTime = new int[n];
            int[] burstTime = new int[n];
            int[] waitTime = new int[n];
            int[] turnaroundTime = new int[n];

            // Input Arrival Time and Burst Time
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Arrival Time for P" + (i + 1) + ": ");
                arrivalTime[i] = sc.nextInt();

                System.out.print("Enter Burst Time for P" + (i + 1) + ": ");
                burstTime[i] = sc.nextInt();
            }

            // Calculate Wait Time and Turnaround Time
            int totalWaitTime = 0;
            int totalTurnaroundTime = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    waitTime[i] = 0;
                } else {
                    waitTime[i] = waitTime[i - 1] + burstTime[i - 1];
                }

                turnaroundTime[i] = waitTime[i] + burstTime[i];

                totalWaitTime += waitTime[i];
                totalTurnaroundTime += turnaroundTime[i];
            }

            // Calculate Average Waiting Time and Turnaround Time
            float averageWaitTime = (float) totalWaitTime / n;
            float averageTurnaroundTime = (float) totalTurnaroundTime / n;

            // Display results
            System.out.println("\nPROCESS\tARRIVAL TIME\tBURST TIME\tWAIT TIME\tTURNAROUND TIME");
            for (int i = 0; i < n; i++) {
                System.out.println("P" + (i + 1) + "\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" + waitTime[i] + "\t\t" + turnaroundTime[i]);
            }

            System.out.println("\nTotal Wait Time: " + totalWaitTime);
            System.out.println("Average Wait Time: " + averageWaitTime);
            System.out.println("Total Turnaround Time: " + totalTurnaroundTime);
            System.out.println("Average Turnaround Time: " + averageTurnaroundTime);

            // Prompt user to try again
            System.out.println("Want to try again? (y (yes) or n (No))");
            String tryAgain = sc.next(); // Use next() instead of nextLine()

            // Check user response and handle accordingly
            if (tryAgain.equalsIgnoreCase("n") || tryAgain.equalsIgnoreCase("no")) {
                break; // Exit loop if the user chooses not to continue
            }
        }

        sc.close(); // Close scanner after loop ends
    }
}
