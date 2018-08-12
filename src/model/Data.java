package model;
import java.util.Scanner;


class Data {
    private double firstNumber;
    private double secondNumber;
    private Scanner scanner = new Scanner(System.in);


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

}
