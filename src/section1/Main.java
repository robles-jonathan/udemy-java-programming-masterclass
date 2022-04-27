package second;

public class Main {
    public static void main(String[] args) {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;
        
        byte myMinValueByte = Byte.MIN_VALUE;
        byte myMaxValueByte = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinValueByte);
        System.out.println("Byte Max Value = " + myMaxValueByte);

        short myMinValueShort = Short.MIN_VALUE;
        short myMaxValueShort = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinValueShort);
        System.out.println("Short Max Value = " + myMaxValueShort);

        long myLongValue = 100L;
        long myMinValueLong = Long.MIN_VALUE;
        long myMaxValueLong = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinValueLong);
        System.out.println("Long Max Value = " + myMaxValueLong);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        
        byte myNewByteValue = (byte) (myMinValueByte / 2);

        short myNewShortValue = (short) (myMinValueShort / 2);
        
    }
    
    
}
