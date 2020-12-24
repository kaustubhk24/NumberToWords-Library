package com.justinclicks.numbertowords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordConverterTest {

    @Test
    public void _0isConvertedZero() {
        assertEquals("Zero", NumberToWordConverter.convert(0));
    }

    @Test
    public void _1isConvertedOne() {
        assertEquals("One", NumberToWordConverter.convert(1));
    }

    @Test
    public void _9isConvertedNine() {
        assertEquals("Nine", NumberToWordConverter.convert(9));
    }

    @Test
    public void _23isConvertedTwentyThree() {
        assertEquals("Twenty Three", NumberToWordConverter.convert(23));
    }

    @Test
    public void _99isConvertedNintyNine() {
        assertEquals("Ninety Nine", NumberToWordConverter.convert(99));
    }

    @Test
    public void _100isConvertedOneHundred() {
        assertEquals("One Hundred", NumberToWordConverter.convert(100));
    }

    @Test
    public void _109isConvertedOneHundred() {
        assertEquals("One Hundred Nine", NumberToWordConverter.convert(109));
    }

    @Test
    public void _120isConvertedOneHundredTwenty() {
        assertEquals("One Hundred Twenty", NumberToWordConverter.convert(120));
    }

    @Test
    public void _999isConverted() {
        assertEquals("Nine Hundred Ninety Nine", NumberToWordConverter.convert(999));
    }

    @Test
    public void _1009isConverted() {
        assertEquals("One Thousand Nine", NumberToWordConverter.convert(1009));
    }

    @Test
    public void _1030isConverted() {
        assertEquals("One Thousand Thirty", NumberToWordConverter.convert(1030));
    }

    @Test
    public void _5555isConverted() {
        assertEquals("Five Thousand Five Hundred Fifty Five", NumberToWordConverter.convert(5555));
    }

    @Test
    public void _55555isConverted() {
        assertEquals("Fifty Five Thousand Five Hundred Fifty Five", NumberToWordConverter.convert(55555));
    }

    @Test
    public void _7000isConverted() {
        assertEquals("Seven Thousand", NumberToWordConverter.convert(7000));
    }

    @Test
    public void _35000isConverted() {
        assertEquals("Thirty Five Thousand", NumberToWordConverter.convert(35000));
    }

    @Test
    public void _15000isConverted() {
        assertEquals("Fifteen Thousand", NumberToWordConverter.convert(15000));
    }

    @Test
    public void _15050isConverted() {
        assertEquals("Fifteen Thousand Fifty", NumberToWordConverter.convert(15050));
    }

    @Test
    public void _111111isConverted() {
        assertEquals("One Lakh Eleven Thousand One Hundred Eleven", NumberToWordConverter.convert(111111));
    }

    @Test
    public void _136000023isConverted() {
        assertEquals("Thirteen Crore Sixty Lakh Twenty Three", NumberToWordConverter.convert(136000023));
    }
}