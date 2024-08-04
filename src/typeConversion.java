public class typeConversion {
    public static void main(String[] args) {
        //implecite the type conversion means that to converte the small number to large number
        //Firts we print the all numbers in indivalus data type  then we have to converte them
        byte Bytenum=10;
        short ShortNum=12;
        int integerNum=109;
        long longNum=10000000000L;
        float floatNum=12.778f;
        double doubleNum=12.8674;
        char CharAlp='Q';

        System.out.println("Byte Number : "+Bytenum);
        System.out.println("short Number : "+ShortNum);
        System.out.println("int Number : "+integerNum);
        System.out.println("Long Number : "+longNum);
        System.out.println("Float Number : "+floatNum);
        System.out.println("Double Number : "+doubleNum);
        System.out.println("Char Number : "+CharAlp);
        //Now we convert the small number to large number
        Bytenum=(byte)(ShortNum);
        ShortNum=(short)(integerNum);
        integerNum=(int)(longNum);
        longNum=(long)(doubleNum);
        floatNum=(float)(doubleNum);
        doubleNum=(double)(floatNum);
        Bytenum=(byte)(floatNum);
        Bytenum=(byte)(integerNum);
        Bytenum=(byte)(longNum);
        Bytenum=(byte)(doubleNum);
        ShortNum=(short)(integerNum);
        ShortNum=(short)(longNum);
        ShortNum=(short)(floatNum);
        integerNum=(int)(longNum);
        integerNum=(int) floatNum;
        longNum=(long)(doubleNum);
        longNum=(long)(floatNum);
        doubleNum=(double)(floatNum);
        floatNum=(float)(doubleNum);


        System.out.println("\nAfter Conversion");
        System.out.println("short converted in Byte Number : "+Bytenum);
        System.out.println("Integer converted in Byte Number : "+Bytenum);
        System.out.println("Long converted in Byte Number : "+Bytenum);
        System.out.println("Double converted in Byte Number : "+Bytenum);
        System.out.println("Double converted in Short Number : "+ShortNum);
        System.out.println("Float converted in Double Number : "+doubleNum);
        System.out.println("Float converted in Integer Number : "+integerNum);
        System.out.println("Long converted in Integer Number : "+integerNum);
        System.out.println("Float converted in Byte Number : "+Bytenum);
        System.out.println("Integer converted inShort Number : "+ShortNum);
        System.out.println("Long converted in int Number : "+integerNum);
        System.out.println("double converted in Long Number : "+longNum);
        System.out.println("double converted in Float Number : "+floatNum);
        System.out.println("float converted in Double Number : "+doubleNum);







    }
}
