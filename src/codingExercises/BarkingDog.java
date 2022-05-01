package codingExercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isBarking = barking;
        if(isBarking == true){
            if(hourOfDay < 0 || hourOfDay > 23){
            isBarking = false;
            } else if(hourOfDay < 8 || hourOfDay > 22){
                isBarking = true;
            } else {
                isBarking = false;
            }
        }
        return isBarking;
    }
}
