package com.justinclicks.numbertowords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordConverterTest {

    @Test
    public void _0isConvertedZero() {
        assertEquals("Zero", NumberToWordConverterLakhFormat.convert(0));
    }

    @Test
    public void _1isConvertedOne() {
        assertEquals("One", NumberToWordConverterLakhFormat.convert(1));
    }

    @Test
    public void _9isConvertedNine() {
        assertEquals("Nine", NumberToWordConverterLakhFormat.convert(9));
    }

    @Test
    public void _23isConvertedTwentyThree() {
        assertEquals("Twenty Three", NumberToWordConverterLakhFormat.convert(23));
    }

    @Test
    public void _99isConvertedNintyNine() {
        assertEquals("Ninety Nine", NumberToWordConverterLakhFormat.convert(99));
    }

    @Test
    public void _100isConvertedOneHundred() {
        assertEquals("One Hundred", NumberToWordConverterLakhFormat.convert(100));
    }

    @Test
    public void _109isConvertedOneHundred() {
        assertEquals("One Hundred Nine", NumberToWordConverterLakhFormat.convert(109));
    }

    @Test
    public void _120isConvertedOneHundredTwenty() {
        assertEquals("One Hundred Twenty", NumberToWordConverterLakhFormat.convert(120));
    }

    @Test
    public void _999isConverted() {
        assertEquals("Nine Hundred Ninety Nine", NumberToWordConverterLakhFormat.convert(999));
    }

    @Test
    public void _1009isConverted() {
        assertEquals("One Thousand Nine", NumberToWordConverterLakhFormat.convert(1009));
    }

    @Test
    public void _1030isConverted() {
        assertEquals("One Thousand Thirty", NumberToWordConverterLakhFormat.convert(1030));
    }

    @Test
    public void _5555isConverted() {
        assertEquals("Five Thousand Five Hundred Fifty Five", NumberToWordConverterLakhFormat.convert(5555));
    }

    @Test
    public void _55555isConverted() {
        assertEquals("Fifty Five Thousand Five Hundred Fifty Five", NumberToWordConverterLakhFormat.convert(55555));
    }

    @Test
    public void _7000isConverted() {
        assertEquals("Seven Thousand", NumberToWordConverterLakhFormat.convert(7000));
    }

    @Test
    public void _35000isConverted() {
        assertEquals("Thirty Five Thousand", NumberToWordConverterLakhFormat.convert(35000));
    }

    @Test
    public void _15000isConverted() {
        assertEquals("Fifteen Thousand", NumberToWordConverterLakhFormat.convert(15000));
    }

    @Test
    public void _15050isConverted() {
        assertEquals("Fifteen Thousand Fifty", NumberToWordConverterLakhFormat.convert(15050));
    }

    @Test
    public void _111111isConverted() {
        assertEquals("One Lakh Eleven Thousand One Hundred Eleven", NumberToWordConverterLakhFormat.convert(111111));
    }

    @Test
    public void _136000023isConverted() {
        assertEquals("Thirteen Crore Sixty Lakh Twenty Three", NumberToWordConverterLakhFormat.convert(136000023));
    }
}