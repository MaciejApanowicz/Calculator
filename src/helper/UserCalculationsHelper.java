package helper;

import model.Calculations;
import view.UserView;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserCalculationsHelper {

    private final UserView userView;
    private final Scanner scanner;
    private final Calculations calculations;
    private int[] arrayNumbers;
    int arrayLength;

    public UserCalculationsHelper(UserView userView, Scanner scanner, Calculations calculations){
        this.userView = userView;
        this.scanner = scanner;
        this.calculations = calculations;
    }

    public double multiplyNumbers(){
        userView.messageAfterChoosingOperation1();
        userView.setFirstNumber();
        double firstNumber = scanner.nextDouble();
        userView.setSecondNumber();
        double secondNumber = scanner.nextDouble();
        return calculations.multiplyNumbers(firstNumber, secondNumber);
    }

    public double divideNumbers() {
        userView.messageAfterChoosingOperation2();
        userView.setFirstNumber();
        double firstNumber = scanner.nextDouble();
        userView.setSecondNumber();
        double secondNumber = scanner.nextDouble();
        return calculations.divideNumbers(firstNumber, secondNumber);
    }

    public double exponentiation (){
        userView.messageAfterChoosingOperation3();
        userView.askUserForTheBase();
        double base = scanner.nextDouble();
        userView.askUserForPower();
        double power = scanner.nextDouble();
        return calculations.exponentiation(base, power);
    }

    public double squareRootExtraction (){
        userView.askUserForTheNumberToBeSquareRooted();
        double numberToBeSquareRooted = scanner.nextDouble();
       return calculations.squareRootExtraction(numberToBeSquareRooted);
    }

    public String integerToBinary() {
        userView.messageAfterChoosingOperation5();
        userView.askUserForIntegerToBeConvertedToBinary();
        int integerToBeConvertedToBinary = scanner.nextInt();
        return calculations.integerToBinary(integerToBeConvertedToBinary);
    }

    public int binaryToInteger() throws IllegalArgumentException {
        userView.messageAfterChoosingOperation6();
        userView.askUserForBinaryNumberToBeConvertedOnInteger();
        int binaryNumberToBeConvertedOnInteger = scanner.nextInt();
        String binaryNumber = Integer.toString(binaryNumberToBeConvertedOnInteger);
       if(!Pattern.matches("[01]*", binaryNumber))
           throw new IllegalArgumentException("You have failed to type a correct binary number.");
        return calculations.binaryToInteger(binaryNumberToBeConvertedOnInteger);
    }

    public int GCD () {
        userView.messageAfterChoosingOperation7();
        userView.setFirstNumber();
        int firstNumber = scanner.nextInt();
        userView.setSecondNumber();
        int secondNumber = scanner.nextInt();
        return calculations.GCD(firstNumber,secondNumber);
    }

    public double calculateAverage(){
        setArrayLength();
        addNumbers();
        showArrayNumbers();
        return calculations.calculateAverage(arrayNumbers, arrayLength);
    }

    private void addNumbers() {
        this.arrayNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (arrayNumbers[i] == 0) {
                System.out.println("Type " + (i + 1) + " number (type an integer and press enter): ");
                arrayNumbers[i] = scanner.nextInt();
            }
        }
    }
    private void showArrayNumbers(){
        userView.showArrayNumbers();
        for(int i : arrayNumbers){
            System.out.print(i + "\t");
        }
        System.out.println();
    }
    private void setArrayLength() {
        userView.askForArrayLength();
        this.arrayLength = scanner.nextInt();
    }

    public String isThereNumberInCollectionGreaterThanTheSumOfTheRest (){
        setArrayLength();
        addNumbers();
        showArrayNumbers();
        return calculations.isThereNumberInCollectionGreaterThanTheSumOfTheRest(arrayNumbers,arrayLength);
    }
}
