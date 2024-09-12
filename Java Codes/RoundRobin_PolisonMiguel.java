/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;
public class RoundRobin_PolisonMiguel {
   // Create a Scanner object for user input
   public static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
       // Main loop to allow multiple runs of the scheduler
       while (true) {
           // Prompt user for the number of processes
           System.out.println("Enter the number of processes:");
           int n = sc.nextInt();
           // Initialize arrays to store process information
           int[] arrivalTime = new int[n];    // Arrival time of each process
           int[] burstTime = new int[n];      // Total CPU time required by each process
           int[] remainingTime = new int[n];  // Remaining CPU time for each process
           int[] completionTime = new int[n]; // Time at which each process completes
           int[] waitingTime = new int[n];    // Time each process spends waiting
           int[] turnaroundTime = new int[n]; // Total time each process spends in the system
           // Input Arrival time and Burst time for each process
           for (int i = 0; i < n; i++) {
               System.out.print("Enter Arrival Time for P" + (i + 1) + ": ");
               arrivalTime[i] = sc.nextInt();
               System.out.print("Enter Burst Time for P" + (i + 1) + ": ");
               burstTime[i] = sc.nextInt();
               remainingTime[i] = burstTime[i]; // Initially, remaining time is the same as burst time
           }
           // Input the time quantum for the Round Robin algorithm
           System.out.print("Enter Time Quantum: ");
           int timeQuantum = sc.nextInt();
           // Initialize the ready queue to manage processes
           Queue<Integer> readyQueue = new LinkedList<>();
           int currentTime = 0; // Current time in the simulation
           int completed = 0;   // Number of completed processes
           // Main scheduling loop
           while (completed < n) {
               // Check for newly arrived processes and add them to the ready queue
               for (int i = 0; i < n; i++) {
                   if (arrivalTime[i] <= currentTime && remainingTime[i] > 0 && !readyQueue.contains(i)) {
                       readyQueue.add(i);
                   }
               }
               // If there are processes in the ready queue
               if (!readyQueue.isEmpty()) {
                   // Get the next process from the queue
                   int currentProcess = readyQueue.poll();
                   // If the process can complete within this time quantum
                   if (remainingTime[currentProcess] <= timeQuantum) {
                       currentTime += remainingTime[currentProcess];
                       completionTime[currentProcess] = currentTime;
                       remainingTime[currentProcess] = 0;
                       completed++;
                   } else {
                       // Process needs more time, so it uses the full time quantum
                       currentTime += timeQuantum;
                       remainingTime[currentProcess] -= timeQuantum;
                       // Check for any new arrivals during this time quantum
                       for (int i = 0; i < n; i++) {
                           if (arrivalTime[i] <= currentTime && remainingTime[i] > 0 && i != currentProcess && !readyQueue.contains(i)) {
                               readyQueue.add(i);
                           }
                       }
                       // Add the current process back to the queue
                       readyQueue.add(currentProcess);
                   }
               } else {
                   // If no process is ready, increment time
                   currentTime++;
               }
           }
           // Calculate waiting time and turnaround time for each process
           int totalWaitingTime = 0;
           int totalTurnaroundTime = 0;
           for (int i = 0; i < n; i++) {
               turnaroundTime[i] = completionTime[i] - arrivalTime[i];
               waitingTime[i] = turnaroundTime[i] - burstTime[i];
               totalWaitingTime += waitingTime[i];
               totalTurnaroundTime += turnaroundTime[i];
           }
           // Calculate average waiting time and turnaround time
           float avgWaitingTime = (float) totalWaitingTime / n;
           float avgTurnaroundTime = (float) totalTurnaroundTime / n;
           // Display results in a tabular format
           System.out.println("\nPROCESS\tARRIVAL TIME\tBURST TIME\tCOMPLETION TIME\tTURN AROUND TIME\tWAIT TIME");
           for (int i = 0; i < n; i++) {
               System.out.println("P" + (i + 1) + "\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" +
                       completionTime[i] + "\t\t" + turnaroundTime[i] + "\t\t" + waitingTime[i]);
           }
           // Display average times
           System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
           System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
           // Prompt user to try again
           System.out.println("Want to try again? (y (yes) or n (No))");
           String tryAgain = sc.next();
           // Exit loop if user doesn't want to continue
           if (tryAgain.equalsIgnoreCase("n") || tryAgain.equalsIgnoreCase("no")) {
               break;
           }
       }
       // Close the scanner to prevent resource leak
       sc.close();
   }
}
