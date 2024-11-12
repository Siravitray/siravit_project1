/* Copyright (C) 2024 Siravit Trisirinan - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the MIT license.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import static jdk.internal.foreign.abi.aarch64.AArch64Architecture.Regs.r2;
//import static jdk.internal.foreign.abi.ppc64.PPC64Architecture.Regs.r1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RationalTest {

    @Test
    public void testRational() {
        Rational r = new Rational();
        assertNotNull(r);
    }

    @Test
    public void testRationalWithValues() {
        try {
            Rational r = new Rational(2, 4);
            assertEquals(1, r.numerator);
            assertEquals(2, r.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    /***
    * add your test cases here
    ***/
    @Before
    public void createRationals() {
        //System.out.println("Initializing the two Rational numbers.");
        Rational r1 = new Rational();
        Rational r2 = new Rational();
    }


    @Test
    public void testSubtract(){
        try {
            Rational r1 = new Rational(3, 4);
            Rational r2 = new Rational(1, 4);
            r1.subtract(r2);
            assertEquals(1, r1.numerator);
            assertEquals(2, r1.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    @Test
    public void testMultiply(){
        try {
            Rational r1 = new Rational(3, 2);
            Rational r2 = new Rational(2, 6);
            r1.multiply(r2);
            assertEquals(1, r1.numerator);
            assertEquals(2, r1.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    @Test
    public void testDivide(){
        try{
            Rational r1 = new Rational(8,2);
            Rational r2 = new Rational(2,4);
            r1.divide(r2);
            assertEquals(8,r1.numerator);
            assertEquals(1,r1.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }



}
