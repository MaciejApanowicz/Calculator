package model;

import view.UserView;
import java.util.Scanner;

class Data {
    private double firstNumber;
    private double secondNumber;
    private Scanner scanner = new Scanner(System.in);
    private UserView userView = new UserView();
    int[] arrayNumbers;
    int arrayLength;


    double getFirstNumber() {
        return firstNumber;
    }

    double getSecondNumber() {
        return secondNumber;
    }

    void setFirstNumber() {
        userView.setFirstNumber();
        this.firstNumber = scanner.nextDouble();
    }

    void setSecondNumber() {
        userView.setSecondNumber();
        this.secondNumber = scanner.nextDouble();
    }

    void setNumberToBeBaseForExponentiation() {
        userView.askUserForTheBase();
        this.firstNumber = scanner.nextDouble();
    }

    void setPower() {
        userView.askUserForPower();
        this.secondNumber = scanner.nextDouble();
    }

    void setNumberToBeSquareRooted() {
        userView.askUserForTheNumberToBeSquareRooted();
        this.firstNumber = scanner.nextDouble();
    }

    void setIntegerToBeConvertedToBinary() {
        userView.askUserForIntegerToBeConvertedToBinary();
        this.firstNumber = scanner.nextInt();
    }

    void setBinaryNumberToBeConvertedOnInteger() {
        userView.askUserForBinaryNumberToBeConvertedOnInteger();
        this.firstNumber = scanner.nextDouble();
    }

    void setArrayLength() {
        userView.askForArrayLength();
        this.arrayLength = scanner.nextInt();
    }
    void addNumbers() {
        this.arrayNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (arrayNumbers[i] == 0) {
                System.out.println("Type " + (i + 1) + " number (type an integer and press enter): ");
                arrayNumbers[i] = scanner.nextInt();
            }
        }
    }

    void showArrayNumbers(){
        userView.showArrayNumbers();
        for(int i : arrayNumbers){
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}
