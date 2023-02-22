/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author rumina
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtilLive.getFactorial(5);
        System.out.println("expected: 5! = 120; actual:" + result);
        
        System.out.println("expected: 6! = 720; actual:" + MathUtilLive.getFactorial(6));
        System.out.println("expected: 0! = 1; actual:" + MathUtilLive.getFactorial(0));
        System.out.println("expected: 1! = 1; actual:" + MathUtilLive.getFactorial(1));
    
    }
    
}
