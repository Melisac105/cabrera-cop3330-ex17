package util;

public class Output {

    static public void printOutput(double bacAmt){
        System.out.format("\nYour BAC is %.3f\n", bacAmt);
        if(bacAmt < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else {
            System.out.print("It is not legal for you to drive.");
        }
    }
}
