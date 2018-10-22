/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymatrix;

import java.util.Scanner;

/**
 *
 * @author 1794421
 */
public class Arraymatrix {

  
    public static void main(String[] args) {
       int studentCount;
       int subjectCount;
       int i;
       int j;
       
       
       Scanner s = new Scanner(System.in);
       // ask the user the no, of students and subject
       
       
        System.out.print("enter number of students :  ");
        studentCount = s.nextInt();
        System.out.print("enter number of subject : ");
        subjectCount = s.nextInt();
        int[][] marks = new int[studentCount][subjectCount];
        
        
        for ( i = 0; i < studentCount; i++) {
            System.out.println("student " + (i+1));
            
            for ( j = 0; j < subjectCount; j++) {
                System.out.print("Mark " + (j+1) + ":");
                marks[i][j] = s.nextInt();
            }
        }
        
//        for (int k = 0; k < studentCount; k++) {
//            System.out.println("Student " + (k+1));
//            for (int l = 0; l < subjectCount; l++) {
//                System.out.println("Marks " + (l+1)+ " : " +marks[k][l]);
//            }
//        }
        
        
        // printing the table
        
        for ( i = 0; i < studentCount; i++) {
            
            
            //for printing line
            for ( j = 0; j < subjectCount; j++) {
                System.out.print("|-----");
            }
            System.out.println("|");
            
            
            //printing marks
            for ( j = 0; j < subjectCount; j++) {
//                System.out.print("| ");
                System.out.print(String.format("| %3d ", marks[i][j]));
//                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int k = 0; k < subjectCount; k++) {
            System.out.print("|-----");
        }
        System.out.println("|");
    }
    
}
