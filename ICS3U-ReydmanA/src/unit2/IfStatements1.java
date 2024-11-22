package unit2;

/**
* Description: 
* Date: 2024-11-05
* @author Alex Reydman
*/

public class IfStatements1 {
  public static void main(String[] args) {
    int firstNum = 10;
    int secondNum = 30;

    System.out.println("Part 1: If");
    System.out.println("----------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }    
    // What prints out? Why?
    // Nothing is printed because the condition `firstNum > secondNum` is false (10 > 30 is false).

    System.out.println("\nPart 2: If, Else");
    System.out.println("----------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else {
      System.out.println("XQCL");
    }
    // What prints out? Why?
    // "XQCL" is printed because `firstNum > secondNum` is false, so the else block is executed.

    System.out.println("\nPart 3: If, Else if, Else");
    System.out.println("-------------------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }
    // What prints out? Why?
    // "sykSHY" is printed because the condition `firstNum % 2 == 0 && secondNum % 3 == 0` is true.
    // 10 is divisible by 2 and 30 is divisible by 3, so the `else if` block is executed.

    System.out.println("\nPart 4: What's the difference?");
    System.out.println("------------------------------");
    System.out.println(1);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }
    // What prints out? Why?
    // `firstNum < secondNum` is true (10 < 30), so "KEKW" and "OMEGALUL" are printed.
    // The `else if` and `else` blocks are skipped.

    System.out.println(2);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }

    if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    }

    if (!(firstNum < secondNum)) {
      System.out.println("XQCL");
    }
    // What prints out? Why?
    // "KEKW" and "OMEGALUL" are printed because `firstNum < secondNum` is true.
    // "sykSHY" is printed because `firstNum % 2 == 0 && secondNum % 3 == 0` is true.
    // "XQCL" is **not** printed because `!(firstNum < secondNum)` is false (`!(true)` is false).

    // What is the difference between the first and second part?
    // The first part uses a single `if-else if-else` chain, where only one block of code is executed.
    // The second part uses **separate** `if` statements, where all true conditions are evaluated and executed independently.
  }
}
