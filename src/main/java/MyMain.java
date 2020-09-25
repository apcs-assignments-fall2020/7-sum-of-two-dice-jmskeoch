import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) ((Math.random() * 6) + 1);
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] sumList = new int[11];
        int sum;
        
        for(int i = 0; i < n; i++) {
            sum = rollDie() + rollDie();
            sumList[sum-2]++;
        }
        return sumList;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pairs of dice would you like to roll?: ");
        int n = scan.nextInt();
        int[] sums = sumOfTwoDice(n);

        for(int i = 0; i < 11; i++) {
            System.out.println("% of rolls where sum == " + (i + 2) + ": " + ((double) sums[i] / n * 100));
        }
        scan.close();
    }
}
