package controller;

import model.Calculations;
import view.UserView;
import java.util.Scanner;

public class MainController {
    private UserView userView;
    private Scanner scanner;
    private Calculations calculations;

    public MainController() {
        userView = new UserView();
        scanner = new Scanner(System.in);
        calculations = new Calculations();
    }

    public void start() {
        userView.welcomeMessage();
        createMenu();
    }

    private void createMenu() {
        int choose;
        do {
            userView.showMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    userView.messageAfterChoosingOperation1();
                    calculations.multiplyNumbers();
                    userView.displayResult(calculations.getResult());
                    break;
                }
                case 2: {
                    userView.messageAfterChoosingOperation2();
                    calculations.divideNumbers();
                    userView.displayResult(calculations.getResult());
                    break;
                }
                case 3: {
                    userView.messageAfterChoosingOperation3();
                    calculations.exponentiation();
                    userView.displayResult(calculations.getResult());
                    break;
                }
                case 4: {
                    calculations.squareRootExtraction();
                    userView.displayResult(calculations.getResult());
                    break;
                }
                case 5: {
                    userView.messageAfterChoosingOperation5();
                    calculations.integerToBinary();
                    userView.displayResultAsString(calculations.getResultAsString());
                    break;
                }
                case 6: {
                    userView.messageAfterChoosingOperation6();
                    calculations.binaryToInteger();
                    userView.displayResultAsInt(calculations.getResultAsInt());
                    break;
                }
                case 7: {
                    userView.messageAfterChoosingOperation7();
                    calculations.GCD();
                    userView.displayResultAsInt(calculations.getResultAsInt());
                    break;
                }
                case 8: {
                    calculations.calculateAverage();
                    userView.displayResult(calculations.getResult());
                    break;
                }
                case 9: {
                    calculations.isThereNumberInCollectionGreaterThanTheSumOfTheRest();
                    if (calculations.getResultAsString().equals("yes")) {
                        userView.displayResultOperationNo9WhenPositive();
                    } else userView.displayResultOperationNo9WhenNegative();
                    break;
                }
                case 10: {
                    userView.messageAfterChoosingOperation10();
                    break;
                }
                default: {
                    userView.instructUserToChooseCorrectly();
                    break;
                }
            }
        }
        while (choose != 10);{
            userView.leavingMessage();
        }
    }
}
