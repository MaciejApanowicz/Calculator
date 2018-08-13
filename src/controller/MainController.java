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
                    //operation 3
                    break;
                }
                case 4: {
                    //operation 4
                    break;
                }
                case 5: {
                    //operation 5
                    break;
                }
                case 6: {
                    //operation 6
                    break;
                }
                case 7: {
                    //operation 7
                    break;
                }
                case 8: {
                    //operation 8
                    break;
                }
                case 9: {
                    //operation 9
                    break;
                }
                case 10: {
                    //this will close the program
                    break;
                }
                default: {
                    // display a message to the User to choose correctly (number from 1-10)
                    break;
                }

            }
        }
        while (choose != 10);{
            userView.leavingMessage();
        }

    }
}
