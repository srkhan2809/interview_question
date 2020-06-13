import java.util.Scanner;

public class Masked {

    public static void main (String args[]) {

        int countValue = 0;
        Scanner scanner = new Scanner(System.in);
        int sizeOfBits = scanner.nextInt();
        StringBuilder valueBuilderZeros = new StringBuilder();
        for (int i=0; i<sizeOfBits; i++) {
            valueBuilderZeros.append(0);
        }

        StringBuilder valueBuilderOnes = new StringBuilder();
        for (int i=0; i<sizeOfBits; i++) {
            valueBuilderZeros.append(1);
        }

        String value = valueBuilderZeros.toString();
        String xorOperation = valueBuilderZeros.toString();
        int iteration = scanner.nextInt();

        while (iteration > 0) {

            // first set input
            scanner.next();

            /*
             * Step 1 Completed
             * converting the input using XOR Operation.
             */
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            value = calculateXOR(l, r, value, xorOperation);
            iteration-- ;

            // second set operation query
            scanner.nextInt();

            /*
             * Step 2 : count operation based on input
             */
            l = scanner.nextInt();
            r = scanner.nextInt();
            countValue = countValue + countOperations(l, r, value);
            iteration-- ;

        }

        System.out.println(countValue);

    }

    static String calculateXOR(int l, int r, String value, String xorOperation) {

        StringBuffer sb = new StringBuffer();

        for (int j = 0; j < value.length(); j++) {

            if ((j == l || j <= l) && (j >= r || j == l)) {

                for (int i = l; i <= r; i++) {

                    sb.append(value.charAt(i)^xorOperation.charAt(i));
                    j = i;
                }
            }
            else {
                sb.append(value.charAt(j));
            }
        }
        return sb.toString();
    }

    static int countOperations(int l, int r, String value) {

        int count = 0;

        for (int i=l; i<=r; i++) {
            count = count + Character.getNumericValue(value.charAt(i));
        }

        return count;

    }

}
