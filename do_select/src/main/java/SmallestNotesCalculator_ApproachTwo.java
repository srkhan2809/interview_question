import java.util.Scanner;

public class SmallestNotesCalculator_ApproachTwo {

    /**
     *
     * @param args
     * @throws Exception
     *
     */
    public static void main (String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();

        for (int i = 0; i < inputSize; i++) {

            int amount = sc.nextInt();
            int numberOfNotes = 0;

            numberOfNotes = getNoteValue(numberOfNotes, amount, 100);
            amount = checkNotesValue(amount, 100);

            numberOfNotes = getNoteValue(numberOfNotes, amount, 50);
            amount = checkNotesValue(amount, 50);

            numberOfNotes = getNoteValue(numberOfNotes, amount, 10);
            amount = checkNotesValue(amount, 10);

            numberOfNotes = getNoteValue(numberOfNotes, amount, 5);
            amount = checkNotesValue(amount, 5);

            numberOfNotes = getNoteValue(numberOfNotes, amount, 2);
            amount = checkNotesValue(amount, 2);

            numberOfNotes = getNoteValue(numberOfNotes, amount, 1);

            System.out.println(numberOfNotes);

        }
    }


    public static int getNoteValue(int numberOfNotes, int calculateNotes, int currencyValue) {

        numberOfNotes = numberOfNotes + calculateNotes/currencyValue;
        return numberOfNotes;
    }

    public static int checkNotesValue(int calculateNotes, int currencyValue) {

        calculateNotes = calculateNotes % currencyValue;
        return calculateNotes;
    }
}
