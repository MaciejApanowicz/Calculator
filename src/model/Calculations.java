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

    public void GCD (){
        userView.messageAfterChoosingOperation7();
        data.setFirstNumber();
        int gcdNumber1 = (int) data.getFirstNumber();
        data.setSecondNumber();
        int gcdNumber2 = (int) data.getSecondNumber();
        while (gcdNumber1 != gcdNumber2)
        {
            if (gcdNumber1 > gcdNumber2){
                gcdNumber1 -= gcdNumber2;
            } else {
                gcdNumber2 -= gcdNumber1;
            }
        }
        int result = gcdNumber1;
        userView.displayResultAsInt(result);
    }

    public void calculateAverage(){
        data.setArrayLength();
        data.addNumbers();
        data.showArrayNumbers();

        int sum = 0;
        for (int number : data.arrayNumbers) {
            sum += number;
        }
        int result = sum/data.arrayLength;
        userView.displayResultAsInt(result);
    }

    public void isThereNumberInCollectionGreaterThanTheSumOfTheRest(){
        data.setArrayLength();
        data.addNumbers();
        data.showArrayNumbers();

        int sum1 = 0;
        int max = 0;
        for (int i = 0; i < data.arrayLength; i++) {
            max = max < data.arrayNumbers[i] ? data.arrayNumbers[i] : max;
            sum1 += data.arrayNumbers[i];
        }
        if (max > sum1-max) {
            System.out.println("Yes, within collection there is a number, that is greater than the sum of the rest" + '\n');
        } else {
            System.out.println("No, within that collection none number is greater than the sum of the rest" + '\n');
        }
    }

}
