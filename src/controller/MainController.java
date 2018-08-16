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
                    calculations.multiplyNumbers();
                    break;
                }
                case 2: {
                    calculations.divideNumbers();
                    break;
                }
                case 3: {
                    calculations.exponentiation();
                    break;
                }
                case 4: {
                    calculations.squareRootExtraction();
                    break;
                }
                case 5: {
                    calculations.integerToBinary();
                    break;
                }
                case 6: {
                    calculations.binaryToInteger();
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
