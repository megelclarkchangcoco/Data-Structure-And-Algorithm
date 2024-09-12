package SJFAlgorithm;

import java.util.*;

class Process {
    int id, arrivalTime, burstTime, exitTime, turnAroundTime, waitingTime;

    public Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
  }
public class PolisonMiguel2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        do {
	            System.out.print("Enter no of process (3-5): ");
	            int n = scanner.nextInt();
	            
	            if (n < 3 || n > 5) {
	                System.out.println("Please enter a number between 3 and 5.");
	                continue;
	            }

	            List<Process> processes = new ArrayList<>();
	            for (int i = 0; i < n; i++) {
	                System.out.print("Enter Arrival Time for P" + (i+1) + ": ");
	                int arrivalTime = scanner.nextInt();
	                System.out.print("Enter Burst Time for P" + (i+1) + ": ");
	                int burstTime = scanner.nextInt();
	                processes.add(new Process(i+1, arrivalTime, burstTime));
	            }

	            sjfPreemptive(processes);
	            printResults(processes);

	            System.out.print("Try Again? (y/n): ");
	        } while (scanner.next().equalsIgnoreCase("y"));
	        
	        scanner.close();
	    }

	    public static void sjfPreemptive(List<Process> processes) {
	        int currentTime = 0;
	        int completed = 0;
	        int[] remainingTime = new int[processes.size()];
	        for (int i = 0; i < processes.size(); i++) {
	            remainingTime[i] = processes.get(i).burstTime;
	        }

	        while (completed != processes.size()) {
	            int shortestJob = -1;
	            int shortestTime = Integer.MAX_VALUE;

	            for (int i = 0; i < processes.size(); i++) {
	                if (processes.get(i).arrivalTime <= currentTime && remainingTime[i] < shortestTime && remainingTime[i] > 0) {
	                    shortestJob = i;
	                    shortestTime = remainingTime[i];
	                }
	            }

	            if (shortestJob == -1) {
	                currentTime++;
	            } else {
	                remainingTime[shortestJob]--;
	                currentTime++;

	                if (remainingTime[shortestJob] == 0) {
	                    completed++;
	                    processes.get(shortestJob).exitTime = currentTime;
	                    processes.get(shortestJob).turnAroundTime = processes.get(shortestJob).exitTime - processes.get(shortestJob).arrivalTime;
	                    processes.get(shortestJob).waitingTime = processes.get(shortestJob).turnAroundTime - processes.get(shortestJob).burstTime;
	                }
	            }
	        }
	    }

	    public static void printResults(List<Process> processes) {
	        System.out.println("\nTITLE: SJF ALGORITHM");
	        System.out.println("PROCESS ID\tArrival Time\tBurst Time\tExit Time\tTurn Around Time\tWaiting Time");
	        
	        double totalTurnAroundTime = 0;
	        double totalWaitingTime = 0;
	        
	        for (Process p : processes) {
	            System.out.printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\n", 
	                p.id, p.arrivalTime, p.burstTime, p.exitTime, p.turnAroundTime, p.waitingTime);
	            totalTurnAroundTime += p.turnAroundTime;
	            totalWaitingTime += p.waitingTime;
	        }
	        
	        double avgTurnAroundTime = totalTurnAroundTime / processes.size();
	        double avgWaitingTime = totalWaitingTime / processes.size();
	        
	        System.out.printf("\nAverage Turn Around Time: %.2f unit\n", avgTurnAroundTime);
	        System.out.printf("Average Waiting Time: %.2f unit\n", avgWaitingTime);
	    }
	}