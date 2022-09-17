/* 
Programming Exercise 1
Edlen Mari Sanchez
•
Sep 12 (Edited Sep 12)
25 points
Write a program that allows the user to display the following shapes


A. Right Triangle
B. Inverted Right Triangle
C. Rectangle with alternating rows
D. Rectangle with borders
E. Rectangle with alternating rows and columns

Enter the letter of your choice:
A
Enter number of rows:
5
*
**
***
****
*****


Enter the letter of your choice:
B
Enter number of rows:
5
*****
****
***
**
*


Enter the letter of your choice:
C
Enter number of rows:
5
Enter number of columns:
5
-----
+++++
-----
+++++
-----


Enter the letter of your choice:
D
Enter number of rows:
5
Enter number of columns:
5
*****
*---*
*---*
*---*
*****



Enter the letter of your choice:
E
Enter number of rows:
5
Enter number of columns:
5
+-+-+
-+-+-
+-+-+
-+-+-
+-+-+

CompCraftsTemplate.zip
Compressed Archive

CompCraftsTemplate.java
Java
Class comments
Your work
Assigned

CompCraftsTemplate.java
Java
Private comments
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CalimCompCrafts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String repeat = "y";
        
        while(repeat.equalsIgnoreCase("y")){
            shapePrinter();

            System.out.println("Again? [Y/N]: ");
            repeat = sc.nextLine();
        }  
    }
    
    static void shapePrinter(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you want to display? ");
        System.out.println("A. Right Triangle");
        System.out.println("B. Inverted Right Triangle");
        System.out.println("C. Rectangle with alternating rows");
        System.out.println("D. Rectangle with borders");
        System.out.println("E. Rectangle with alternating rows and columns");
        System.out.println("Enter the letter of your choice: ");

        String choice = sc.nextLine();
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        //Right triangle 
        if(choice.equalsIgnoreCase("a")){

            //put answer here
            for(int i=1; i<=rows; i++){
                for (int p=0; p < i; p++){
                    System.out.print("@");
                } 
                System.out.println();
            }
        }

        //inverted right triangle
        else if(choice.equalsIgnoreCase("b")){

            //put answer here
            for(int i=rows; i>0; i-=1){
                for (int p=i; p>0; p-=1){
                    System.out.print("@");
                } 
                System.out.println();
            }
        }


        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("c")){

            //put answer here
            System.out.println("Enter number of column: ");
            int column = sc.nextInt();

            for (int i=rows; i>0; i=i-1){
                for (int p=column; p>0; p=p-1){
                    if ((i%2)==1){
                        System.out.print("@");
                    }else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }


        //rectangle with border
        else if(choice.equalsIgnoreCase("d")){

            //put answer here
            System.out.println("Enter number of column: ");
            int column = sc.nextInt();

            for (int i=rows; i>0; i=i-1){
                for (int p=column; p>0; p=p-1){
                    if ((p==rows)||(p==1)||(i==column)||(i==1)){
                        System.out.print("#");
                    } else {
                        System.out.print("@");
                    }
                }
                System.out.println();
            }      
        }


        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("e")){ 

            //put answer here
            System.out.println("Enter number of column: ");
            int column = sc.nextInt();

            int counter = 0;

            for(int i=rows; i>0; i-=1){
                for (int p=column; p>0; p-=1){
                    counter ++;
                    if ((counter%2)==1){
                        System.out.print("@");
                    } else{
                        System.out.print("#");
                    }
                } 
                System.out.println();
            }   
        }

        else{
            System.out.println("Choose a letter from A-E");
        }
    }
}