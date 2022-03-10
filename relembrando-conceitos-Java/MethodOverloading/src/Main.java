public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);


        double centimeters = calcFeetAndInchesToCentimenters(6,0);
        if(centimeters <0.0) {
            System.out.println("Invalid parameters.");
        }

        calcFeetAndInchesToCentimenters(100);

    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }







    public static double calcFeetAndInchesToCentimenters(double feet, double inches) {

        if((feet < 0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimers = (feet * 12) * 2.54;
        centimers += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = " + centimers + " cm." );
        return centimers;

    }


    public static double calcFeetAndInchesToCentimenters(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimenters(feet, remainingInches);
    }




    }
