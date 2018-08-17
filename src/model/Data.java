package model;

import view.UserView;
import java.util.Scanner;

class Data {
    private double firstNumber;
    private double secondNumber;
    private Scanner scanner = new Scanner(System.in);
    private UserView userView = new UserView();

    double getFirstNumber() {
        return firstNumber;
    }

    double getSecondNumber() {
        return secondNumber;
    }

    void setFirstNumber() {
        System.out.println("Set your first number: ");
        this.firstNumber = Double.parseDouble(scanner.nextLine());
    }

    void setSecondNumber() {
        System.out.println("Set your second number: ");
        this.secondNumber = Double.parseDouble(scanner.nextLine());
    }

    void setNumberToBeBaseForExponentiation() {
        userView.askUserForTheBase();
        this.firstNumber = Double.parseDouble(scanner.nextLine());
    }

    void setPower() {
        userView.askUserForPower();
        this.secondNumber = Double.parseDouble(scanner.nextLine());
    }

    void setNumberToBeSquareRooted() {
        userView.askUserForTheNumberToBeSquareRooted();
        this.firstNumber = Double.parseDouble(scanner.nextLine());
    }

    void setIntegerToBeConvertedToBinary() {
        userView.askUserForIntegerToBeConvertedToBinary();
        this.firstNumber = Integer.parseInt(scanner.nextLine());
    }

    void setBinaryNumberToBeConvertedOnInteger() {
        userView.askUserForBinaryNumberToBeConvertedOnInteger();
        this.firstNumber = Double.parseDouble(scanner.nextLine());
    }
}
