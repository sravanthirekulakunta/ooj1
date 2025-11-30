package project.SEE;

import project.CIE.internals;
import java.util.Scanner;

public class externals extends internals {

    protected int smarks[];       // SEE marks
    protected int finalMarks[];  // Final CIE+SEE

    public externals() {
        smarks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            smarks[i] = s.nextInt();
        }
    }

     public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = (int) (smarks[i]/2)+ marks[i]; // SEE/2 + CIE
        }
    }

    public void displayFinalMarks() {
        displayStudentDetails();
        System.out.println("\nFinal Marks in 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}