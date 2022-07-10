package controlFlowStatements;

public class ifThenStatement {
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is Not Alien");
            System.out.println("I am not Scared of Aliens");

        }

        int topScore = 95;
        int secondTopScore = 85;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Top Score is Greater than Second top Score and less than 100");

        if ((topScore > secondTopScore) || (topScore < 80))
            System.out.println("Either one of condition is true");

        }

    }
}
