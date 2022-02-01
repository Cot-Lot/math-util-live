package com.ute.mathutil;

/**
 *
 * @author Tran Minh Hao
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 120; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 7! = 120; actual: " + MathUtil.getFactorial(7));
        System.out.println("expected: 0! = 120; actual: " + MathUtil.getFactorial(0));


    }
    
}
