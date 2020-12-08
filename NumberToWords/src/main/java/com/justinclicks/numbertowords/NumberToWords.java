package com.justinclicks.numbertowords;


import java.util.ArrayList;

public class NumberToWords {
    String[] singles={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    String[] tens={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty","Hundered"};
    String[] powers={"Hundred","Thousand","Lakh","Crore"};
    public  ArrayList<String> output = new ArrayList<String>(200);
    int temp=0,length=0;

    public void startPrint(int number)
    {
        number=removeLeadingZero(number);
        int length = (int) (Math.log10(number) + 1);

        switch(length)
        {


            case 1: output.add(singles[number]);

                break;

            case 2:
                if (number<21)
                {
                    output.add(singles[number]);
                }
                else
                {
                    if(number%10==0)
                    {
                        output.add(tens[number/10]);

                    }
                    else{
                        output.add(tens[number/10]);
                        output.add(singles[number%10]);
                    }


                }
                break;

            case 3: if(number%100==0)
            {
                output.add(singles[number/100]);
                output.add(powers[0]);
            }
            else{
                temp=number/100;
                output.add(singles[temp]);
                output.add(powers[0]);
                startPrint(number-temp*100);

            }

                break;

            case 4: if(number%1000==0)
            {
                output.add(singles[number/1000]);
                output.add(powers[1]);
            }
            else{
                temp=number/1000;
                output.add(singles[temp]);
                output.add(powers[1]);
                startPrint(number-temp*1000);
            }
                break;




            case 5: if(number%10000==0)
            {
                output.add(tens[number/10000]);
                output.add(powers[1]);
            }
            else{
                temp=number/10000;
                output.add(tens[temp]);
                startPrint(number-temp*10000);
            }
                break;



            case 6: if(number%100000==0)
            {
                output.add(singles[number/100000]);
                output.add(powers[2]);
            }
            else{
                temp=number/100000;
                output.add(singles[temp]);
                output.add(powers[2]);
                startPrint(number-temp*100000);
            }
                break;


            case 7: if(number%1000000==0)
            {
                output.add(tens[number/1000000]);
                output.add(powers[2]);
            }
            else{
                temp=number/1000000;
                output.add(tens[temp]);
                startPrint(number-temp*1000000);
            }
                break;


            case 8: if(number%10000000==0)
            {
                output.add(singles[number/10000000]);
                output.add(powers[3]);
            }
            else{
                temp=number/10000000;
                output.add(singles[temp]);
                output.add(powers[3]);
                startPrint(number-temp*10000000);
            }
                break;



            case 9: if(number%100000000==0)
            {
                output.add(tens[number/100000000]);
                output.add(powers[2]);
            }
            else{
                temp=number/100000000;
                output.add(tens[temp]);
                startPrint(number-temp*100000000);
            }
                break;

            default: //System.out.println("This number is not supported yet :");
                break;



        }



    }
    public int removeLeadingZero(int no)
    {
        String str=String.valueOf(no);
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        return Integer.parseInt(sb.toString());
    }



}
