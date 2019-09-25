
import com.Me;
import com.Dog;
import com.Basengi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Homework {
    public static void main (String args[]) {
        /*
            Testing Odd / ex 1
        */
        testOddFunction();
        /*
            + and += / ex 2
        */
        plusEgalThing();
        /*
            Letters and numbers / ex 3
        */
        WhatDoesThisPrint();
        /*
            Class name / ex 4
        */
        Me.tell();
        /*
            Auto-increment / ex 5
        */
        AutoIncrement();
        /*
            Barking
        */
        Dog woofer = new Dog();
        Dog nipper = new Basengi();
        woofer.bark();
        nipper.bark();
        
    }
    
    public static void testOddFunction() {
        int try1 = 1;
        int try2 = 2;
        int try3 = 3;
        int try4 = 4;
        
        System.out.println(isOdd(try1));
        System.out.println(isOdd(try2));
        System.out.println(isOdd(try3));
        System.out.println(isOdd(try4));
        // To conclude,is odd is a correct function. Because the i % 2 == 1 will return true or false (and an odd number % 1 == 1)
    }
    
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
    
    public static void plusEgalThing() {
        //If x and y are of different types, the behavior of the two statements differs due to the rules of the language. For example, let's have x == 0 (int) and y == 1.1 (double):

        int x = 0;
        x += 1.1;    // just fine; hidden cast, x == 1 after assignment
//        x = x + 1.1; // won't compile! 'cannot convert from double to int'

        //+= performs an implicit cast, whereas for + you need to explicitly cast the second operand, otherwise you'd get a compiler error.
        
    }
    
    public static void WhatDoesThisPrint() {
        String letters = "ABC";
        char[] numbers = {'1', '2', '3'};
        System.out.println(letters + " As easy as " + numbers);
        // The problem here is that it performs a byte to byte print out. Need to cast it to string:
        System.out.println(letters + " As easy as " + new String(numbers));
        // Doing without casting it is like call the method to string (of a char array)
        System.out.println(letters + " As easy as " + numbers.toString());
    }
    
    public static void AutoIncrement() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
            // System.out.println(j); At this iteration we can see that the value never change.
            // Why? Because x++ increments x and return it old value, x= also assign the old value back to itself. The problem is the timing when the the value is pushed onto the stack. It occur after the assigning. ( see Byte code to understand it better)
        }
        System.out.println(j);
    }
    
}