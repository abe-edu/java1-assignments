import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
    //Requirement for negative numbers
        if (n < 0) {
        return -1;
        }

    //Base cases 0, 1
        if (n == 0) return 0;
        if (n == 1) return 1;

    //New number = Previous number + Previous previous number
        int a = 0;
        int b = 1; 
        int c = 0;

    //for loop, count up until i reaches n
        for (int i = 2; i <= n; ++i) {
            c = a + b;
            a = b;
            b = c; 
        }

        return b;  
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}