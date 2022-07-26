public class Main {

    public static void main(String[] args) {
        // Initializing three variables of data type "int".
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        // Using variables inside an expression rather than integer literals.
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Prints out the total sum.
        System.out.println(myTotal);

        // Updating "myThirdNumber".
        myThirdNumber = myFirstNumber * 2;

        // Updating "myTotal".
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Prints out the total sum.
        System.out.println(myTotal);
    }
}
