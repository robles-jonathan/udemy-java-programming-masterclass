package codingExercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int num1 = (int) (a * 1000);
        int num2 = (int) (b * 1000);
        if(num1 == num2){
            return true;
        }
        return false;
    }
}
