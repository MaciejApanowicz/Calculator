package controller;

import view.UserView;
import java.util.Scanner;

public class MainController {
    private UserView userView;
    private Scanner scanner;

    public MainController() {
        userView = new UserView();
        scanner = new Scanner(System.in);
    }

    public void start() {
        userView.welcomeMessage();
        createMenu();
    }

    public void createMenu() {
        int choose;

        do {
            // show Menu to the user
            choose = scanner.nextInt();

            switch (choose) {
                case 1: {
                    //operation 1
                    break;
                }
                case 2: {
                    //operation 2
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
                    // display a message to the User to choose correctly
                    break;
                }

            }
        }
        while (choose != 10);
        {
            // create a leaving program
        }

    }
}
