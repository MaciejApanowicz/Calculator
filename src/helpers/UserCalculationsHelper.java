package helpers;

import model.Calculations;
import view.UserView;

import java.util.Scanner;

public class UserCalculationsHelper {

    private final UserView userView;
    private final Scanner scanner;
    private final Calculations calculations;

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
}
