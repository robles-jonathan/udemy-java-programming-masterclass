package codingExercises;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        else if (year % 4 == 0) { // Step 1
            if (year % 100 == 0) { // Step 2
                return year % 400 == 0; // Step 3
            }
            else { // Step 4
                return true;
            }
        }
        else { // Step 5
            return false;
        }
    }
}
