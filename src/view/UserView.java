package view;

public class UserView {

    public void showMenu (){
        System.out.println("Choose operation: ");
        System.out.println("1 - Multiplication");
        System.out.println("2 - Division");
        System.out.println("3 - Exponentiation");
        System.out.println("4 - Square Root Extraction");
        System.out.println("5 - Convert an integer to a binary number");
        System.out.println("6 - Convert a binary number to an integer");
        System.out.println("7 - GCD (greatest common divisor)");
        System.out.println("8 - Calculating the average");
        System.out.println("9 - Investigation if there is a number in the collection greater that the sum of the rest");
        System.out.println("10 - EXIT");
        System.out.println("Type the number of chosen operation: ");
    }

    public void welcomeMessage () {
        System.out.println("Welcome. This is the Calculator. Enjoy! ");
    }
    public void leavingMessage (){
        System.out.println("Thanks for testing !!!");
    }
    public void messageAfterChoosingOperation1 (){
        System.out.println("You have chosen to multiply!");
    }
    public void messageAfterChoosingOperation2 () {
        System.out.println("You have chosen to divide!");
    }
    public void messageAfterChoosingOperation3 () {
        System.out.println("You have chosen exponentiation!");
    }
    public void messageAfterChoosingOperation5 () {
        System.out.println("You have chosen converting the integer to a binary number!");
    }
    public void messageAfterChoosingOperation6 () {
        System.out.println("You have chosen converting the binary number to an integer");
    }
    public void messageAfterChoosingOperation7 () {
        System.out.println("You have chosen calculating Greatest Common Divisor (GCD)");
        System.out.println("Now, you can find the GCD of the two integers");
    }
    public void messageAfterChoosingOperation10 () {
        System.out.println("You have exited the program.");
    }
    public void instructUserToChooseCorrectly() {
        System.out.println("Please choose correct number from 1 to 10");
    }
    public static String messageDoNotDivideBy0 () {
        return ("It is not allowed to divide by 0! Run the app again and make sure to not divide by zero again.");
    }
    public void displayResult (double result){
        System.out.println("Result is: " + result + '\n');
    }
    public void displayResultAsInt (int result){
        System.out.println("Result is: " + result + '\n');
    }
    public void displayResultAsString (String result){
        System.out.println("Result is: " + result + '\n');
    }
    public void displayResultOperationNo9WhenPositive(){
        System.out.println("Yes, within collection there is a number, that is greater than the sum of the rest" + '\n');
    }
    public void displayResultOperationNo9WhenNegative(){
        System.out.println("No, within that collection none number is greater than the sum of the rest" + '\n');
    }
    public void askUserForTheBase(){
        System.out.println("Set the number to be a base of exponentiation: ");
    }
    public void askUserForPower(){
        System.out.println("Set the power: (set an integer) ");
    }
    public void askUserForTheNumberToBeSquareRooted() {
        System.out.println("Set the number to be square rooted: ");
    }
    public void askUserForIntegerToBeConvertedToBinary(){
        System.out.println("Set the integer to convert: ");
    }
    public void askUserForBinaryNumberToBeConvertedOnInteger(){
        System.out.println("Type a positive binary number to be converted on integer: ");
    }
    public void setFirstNumber() {
        System.out.println("Set your first number: ");
    }
    public void setSecondNumber() {
        System.out.println("Set your second number: ");
    }
    public void askForArrayLength() {
        System.out.println("How many numbers do you want to have?: ");
    }
    public void showArrayNumbers() {
        System.out.println("Here is your collection: ");
    }
}
