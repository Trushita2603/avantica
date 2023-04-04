// Author: Trushita
// Source: HackerRank
// Task: In this challenge, if number is odd then print wried,if number is even as per condition then print not wried.

import java.io.*;
import java.util.*;

public class HEvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        if(( n%2 != 0) || (n%2 == 0 && n > 6  && n <= 20)){
                System.out.print("Weird");
            }else if ((n%2 == 0 ) || (n%2 == 0 && n > 2 && n < 5)){
                System.out.print("Not Weird");
            } else if ((n%2 == 0 && n > 20) ){
                System.out.print("Not Weird");
         
        }
    }
}
    
                