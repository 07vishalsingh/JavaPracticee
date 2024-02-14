/* 
* DAY 2: * OPERATORS *
 * Operators: ==> Operator is a symbol , it will perform a particular operation over the provided operands.
 * a+b => a & b are operand and + is operator.
 * 
 * 1. Arithmetic Operators : It performs arithmetic operations like addition, subtraction, multiplication, division, module(%).
 */

// import java.util.Scanner;

// public class Operators {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//         System.out.println(a%b);
//         System.out.println(a+b+"= a+b"); //* NOTE: IF IT PERFORM ANY OPERATION BEFORE STRING THEN IT WILL WORK AS OPERATOR.
//         System.out.println(a+b-a*b/a%b); //* NOTE:PRECEDENCE OF OPERATORS IN JAVA IS FROM LEFT TO RIGHT AND FROM TOP TO BOTTOM IN JAVA.
//         sc.close();

//     }
// }

//  public class Operators {

//      public static void main(String[] args) {
//          // Declare variables
//          int numBatches = 2;
//          int bakingTimePerBatch = 20; // in minutes
//          int preheatingTime = 10; // in minutes

//          // Calculate total baking time
//          int totalBakingTime = (numBatches * bakingTimePerBatch) + preheatingTime;

//         // Print the result
//         System.out.println("Total baking time: " + totalBakingTime + " minutes");

//      }
//  }


public class Operators {

    public static void main(String[] args) {
       // Declare variables
                final int age = 18;
                final String location = "California";

                boolean eligible = age >= 18 && location.equals("California");

                if (eligible) {
                    System.out.println("Congratulations, you're eligible to enter the contest!");
                } else {
                    System.out.println("Unfortunately, you don't meet the eligibility requirements.");
                }
            }
        }

    