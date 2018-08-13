package model;

import view.UserView;

public class Calculations {
    private Data data = new Data();
    private UserView userView = new UserView();


    public void multiplyNumbers(){
        userView.messageAfterChoosingOperation1();
        data.setFirstNumber();
        data.setSecondNumber();
        double result = (data.getFirstNumber()* data.getSecondNumber());
        userView.displayResult(result);
    }

    public void divideNumbers(){
        userView.messageAfterChoosingOperation2();
        data.setFirstNumber();
        data.setSecondNumber();
        do {
            if (data.getSecondNumber() == 0) {
                userView.messageDoNotDivideBy0();
                data.setSecondNumber();
            }
        } while (data.getSecondNumber() == 0);
        double result = (data.getFirstNumber() / data.getSecondNumber());
        userView.displayResult(result);
    }
}
