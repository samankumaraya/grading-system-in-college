package codin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your marks to show your grade :");
        Scanner sc= new Scanner(System.in);
      int marks=sc.nextInt();

      if(marks<50){
          System.out.println("fail");
      }
      else if(marks>=50 && marks< 60){
          System.out.println("Your grade is D grade");
      }
      else if(marks>=60 && marks< 70){
          System.out.println("Your grade is C grade");
      }
      else if(marks>=70 && marks< 80){
          System.out.println("Your grade is B grade");
      }
      else if(marks>=80 && marks< 90){
          System.out.println("Your grade is A grade");
      }
      else if(marks>=90 && marks< 100){
          System.out.println(" Your grade is A+ grade");
      }else{
          System.out.println("Invalid");
      }
    }
}
