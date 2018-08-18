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
        this.firstNumber = Double.parseDouble(scanner.nextLine());
    }

    void setSecondNumber() {
        userView.setSecondNumber();
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

    void setArraylength() {
        userView.setArrayLength();
        this.arrayLength = Integer.parseInt(scanner.nextLine());
    }
    void addNumbers() {
        this.arrayNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (arrayNumbers[i] == 0) {
                System.out.println("Type " + (i + 1) + " number : ");
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
