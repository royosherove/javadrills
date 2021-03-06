package com.teamagile.javadrills.unittests;


import com.teamagile.javadrills.StringCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest{

    private StringCalculator makeCalc() {
        return new StringCalculator();
    }

    private void assertAdding(String numbers, int expected) {
        StringCalculator sc = makeCalc();

        int result = sc.add(numbers);

        assertEquals(expected, result);
    }


   @Test
    public void add_emptyString_returnsDefault(){
        StringCalculator calc = makeCalc();
        int result = calc.add("");
        assertEquals(0,result);
    }


    @Test
    public void add_negative_throws(){
        StringCalculator calc = makeCalc();
        assertThrows(IllegalArgumentException.class,
                    () ->
                            calc.parse("-1"));
    }



    @ParameterizedTest
    @ValueSource(strings = {"-1", "-2"})
    public void add_negative_throwsIllegal(String input) {
        StringCalculator calc = makeCalc();

        assertThrows(IllegalArgumentException.class,
                () ->
                        calc.parse(input));
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void add_negative_throws1() {
//        makeCalc().add("-1");
//    }


//    @Test
//    public void add_negative_throws0() {
//        StringCalculator stringCalculator = makeCalc();
//        try {
//            stringCalculator.add("-1");
//        } catch (Throwable e) {
//            //all good
//            return;
//        }
//        assertFalse(true);
//
//    }
    @Test
    public void add_multipleNumbers_returnstheSum(){
        assertAdding("1,2", 3);
    }

    @Test
    public void add_singleNumber_returnsThatNumber(){
        assertAdding("1", 1);
    }



    @Test
    public void add_emptyString_returnsZero(){
        assertAdding("",0);
    }
}

