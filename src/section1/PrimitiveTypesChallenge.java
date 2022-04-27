package section1;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short shortNumber = 12111;
        int intNumber = 222222211;
        long longNumber = 50000 + (10L * (byteNumber + shortNumber + intNumber));
        System.out.println(longNumber);
    }
}
