package controller;

import helper.UserCalculationsHelper;
import model.Calculations;
import view.UserView;
import java.util.Scanner;

public class MainController {
    private UserView userView;
    private Scanner scanner;
    private Calculations calculations;
    private UserCalculationsHelper helper;

    public MainController() {
        userView = new UserView();
        scanner = new Scanner(System.in);
        calculations = new Calculations();
        helper = new UserCalculationsHelper(userView,scanner,calculations);
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
                    userView.displayResult(helper.multiplyNumbers());
                    break;
                }
                case 2: {
                    userView.displayResult(helper.divideNumbers());
                    break;
                }
                case 3: {
                    userView.displayResult(helper.exponentiation());
                    break;
                }
                case 4: {
                    userView.displayResult(helper.squareRootExtraction());
                    break;
                }
                case 5: {
                    userView.displayResultAsString(helper.integerToBinary());
                    break;
                }
                case 6: {
                    userView.displayResultAsInt(helper.binaryToInteger());
                    break;
                }
                case 7: {
                    userView.displayResultAsInt(helper.GCD());
                    break;
                }
                case 8: {
                    userView.displayResult(helper.calculateAverage());
                    break;
                }
                case 9: {
                    if (helper.isThereNumberInCollectionGreaterThanTheSumOfTheRest().equals("yes")) {
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
