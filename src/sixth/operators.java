package sixth;

public class operators {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println(result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; // 2 - 1 = 1
        System.out.println(result);

        result += 2; // 1 + 2 = 3
        System.out.println(result);

        result *= 10; // 3 * 10 = 30
        System.out.println(result);

        result /= 3; // 30 / 3 = 10
        System.out.println(result);

        result -= 2; // 10 - 2 = 8
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        
        int secondScore = 60;
        if((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50; // = Assignment operator
        if(newValue == 50){ // == Boolean operator
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
        if(wasCar){
            System.out.println("wasCar is true");
        }
        

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if(isEighteenOrOver){System.out.println("Old");}
    }
}
