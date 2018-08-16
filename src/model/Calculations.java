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

    public void exponentiation (){
        userView.messageAfterChoosingOperation3();
        data.setNumberToBeBaseForExponentiation();
        data.setPower();
        int result = 1;
        for (int i = 1; i <= data.getSecondNumber(); i++) {
            result *= data.getFirstNumber();
        }
        userView.displayResult(result);
    }

    public void squareRootExtraction (){
        data.setNumberToBeSquareRooted();
        double result = Math.sqrt(data.getFirstNumber());
        userView.displayResult(result);
    }

    public void integerToBinary() {
        userView.messageAfterChoosingOperation5();
        data.setIntegerToBeConvertedToBinary();
        StringBuilder binaryNumber = new StringBuilder();
        int integerNumber = (int)data.getFirstNumber();
        while (integerNumber != 0) {
            binaryNumber.append(integerNumber % 2);
            integerNumber /= 2;
        }
        String result = binaryNumber.reverse().toString();
        userView.displayResultAsString(result);
    }

    public void binaryToInteger(){
        userView.messageAfterChoosingOperation6();
        data.setBinaryNumberToBeConvertedOnInteger();
        int numberToBeConverted = (int)data.getFirstNumber();
        String binaryNumber = Integer.toString(numberToBeConverted);
        int integerNumber = 0;
        int power = 0;
        for (int i = binaryNumber.length(); i >= 1; i--) {
            if (binaryNumber.charAt(i - 1) == 49) {
                integerNumber += Math.pow(2,power);
            }
            power++;
        }
        int result = integerNumber;
        userView.displayResultAsInt(result);
    }

}
