/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.timetrackingtool;


import java.util.Scanner;

public class TimeTrackingTool {

    public int calculateTotalTime(int[][] intervals) {
        int total = 0;
        for (int[] interval : intervals) {
            total += interval[1] - interval[0]; // end time - start time
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeTrackingTool timeTracker = new TimeTrackingTool();

        int[][] intervals = new int[7][2]; // Array to store start and end times for 7 days

        int weeklyTotal = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter start time for day " + (i + 1) + ": ");
            intervals[i][0] = scanner.nextInt();
            System.out.print("Enter end time for day " + (i + 1) + ": ");
            intervals[i][1] = scanner.nextInt();

            weeklyTotal += timeTracker.calculateTotalTime(new int[][] { intervals[i] });
        }

        System.out.println("Total time spent in the week: " + weeklyTotal + " hours");
        
        if (weeklyTotal < 40) {
            System.out.println("Warning: You have spent less than 40 hours this week.");
        }
    }
}
