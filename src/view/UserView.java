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
    }
    public void messageAfterChoosingOperation10 () {
        System.out.println("You have exited the program.");
    }
    public void instructUserToChooseCorrectly() {
        System.out.println("Please choose correct number from 1 to 10");
    }
    public void messageDoNotDivideBy0 () {
        System.out.println("It is not allowed to divide by 0 !!!  Set your second number again: ");
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
    public void askUserForTheBase(){
        System.out.println("Set the number to be a base of exponentiation: ");
    }
    public void askUserForPower(){
        System.out.println("Set the power: ");
    }
    public void askUserForTheNumberToBeSquareRooted() {
        System.out.println("Set the number to be square rooted: ");
    }
    public void askUserForIntegerToBeConvertedToBinary(){
        System.out.println("Set the integer to convert: ");
    }
    public void askUserForBinaryNumberToBeConvertedOnInteger(){
        System.out.println("Type binary number to be converted on integer: ");
    }

}
