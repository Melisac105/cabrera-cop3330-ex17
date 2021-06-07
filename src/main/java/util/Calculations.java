package util;

public class Calculations {

    static public double getBAC(int ounces, int weight, int hours, int gender) {
        if(gender == 1) {
            return ((ounces * 5.14) / (weight * 0.73)) - (.015 * hours);
        }
        else if (gender == 2) {
            return ((ounces * 5.14) / (weight *  0.66))- (.015 * hours);
        }
        return -1;
    }
}
