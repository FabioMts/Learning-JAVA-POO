public class Main {




    public static void main(String[] args) {

        double myFirstValue = 20.00;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }


    }

}
