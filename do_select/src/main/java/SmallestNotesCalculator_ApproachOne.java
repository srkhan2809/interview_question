import java.util.Scanner;

public class SmallestNotesCalculator_ApproachOne {

    /**
     *
     * @param args
     */
    public static void main (String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();

        for (int i = 0; i < inputSize; i++) {

            int amount = sc.nextInt();
            int noteCounter = 0;

            if(amount >= 100) {
                noteCounter = noteCounter + amount/100;
                amount = amount % 100;
            }

            if(amount >= 50) {
                noteCounter = noteCounter + amount/50;
                amount = amount % 50;
            }

            if(amount >= 10) {
                noteCounter = noteCounter + amount/10;
                amount = amount % 10;
            }

            if(amount >= 5) {
                noteCounter = noteCounter + amount/5;
                amount = amount % 5;
            }

            if(amount>=2) {
                noteCounter = noteCounter + amount/2;
                amount = amount % 2;
            }

            if(amount == 1)
                noteCounter = noteCounter + amount;

            System.out.println(noteCounter);
        }
    }
}
