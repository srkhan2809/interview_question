import java.util.Scanner;

public class SmallestNotesCalculator_GreedyApproach {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();

        for (int i = 0; i < inputSize; i++) {

            int amount = sc.nextInt();
            countCurrency(amount);
        }
    }

    /**
     *
     * @param amount
     *
     *this will help us to count the
     * Currency for the given amount
     */
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];

        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {

            if (amount >= notes[i]) {

                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        int overallNotesCounter = 0;
        // Print notes
        for (int i = 0; i < 9; i++) {

            if (noteCounter[i] != 0) {

                overallNotesCounter = overallNotesCounter +  noteCounter[i];

            }
        }
        System.out.println(overallNotesCounter);
    }
}
