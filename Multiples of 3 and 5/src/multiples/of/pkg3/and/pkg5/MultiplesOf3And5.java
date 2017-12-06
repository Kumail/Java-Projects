package multiples.of.pkg3.and.pkg5;

/**
 *
 * @author Kumail
 */
public class MultiplesOf3And5 {

    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if ((i % 3) == 0) {
                sum = sum + i;
            }
            else if ((i % 5) == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of multiples of 3 and 5 below " + n + " is: " + sum);
    }
}
