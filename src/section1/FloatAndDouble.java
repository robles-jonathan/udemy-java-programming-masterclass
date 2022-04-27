package section1;

public class FloatAndDouble {
    public static void main(String[] args) {
        
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloat);
        System.out.println("Float maximum value: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDouble);
        System.out.println("Double maximum value: " + myMaxDouble);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5f/3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


    }
}
