package model;

import view.UserView;

public class Calculations {
    private double result;
    private String resultAsString;
    private int resultAsInt;

    public double multiplyNumbers(double firstNumber, double secondNumber){
        return  (firstNumber* secondNumber);
    }

    public double divideNumbers(double firstNumber, double secondNumber) throws ArithmeticException{
        if (secondNumber == 0) {
            throw new ArithmeticException(UserView.messageDoNotDivideBy0());
        }
        return (firstNumber/secondNumber);
    }

    public double exponentiation (double base, double power){
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }

    public double squareRootExtraction (double numberToBeSquareRooted){
        return result = Math.sqrt(numberToBeSquareRooted);
    }

    public String integerToBinary(int integerToBeConvertedToBinary) {
        StringBuilder binaryNumber = new StringBuilder();
        int integerNumber = integerToBeConvertedToBinary;
        if (integerToBeConvertedToBinary == 0){
             return resultAsString = "0";
        }else {
        while (integerNumber != 0) {
            binaryNumber.append(integerNumber % 2);
            integerNumber /= 2;
        }return resultAsString= binaryNumber.reverse().toString();
    }
    }

    public int binaryToInteger(int binaryNumberToBeConvertedOnInteger){
        String binaryNumber = Integer.toString(binaryNumberToBeConvertedOnInteger);
        int integerNumber = 0;
        int power = 0;
        for (int i = binaryNumber.length(); i >= 1; i--) {
            if (binaryNumber.charAt(i - 1) == 49) {
                integerNumber += Math.pow(2,power);
            }
            power++;
        }
        return resultAsInt= integerNumber;
    }

    public int GCD (int firstNumber, int secondNumber){
        while (firstNumber != secondNumber)
        {
            if (firstNumber > secondNumber){
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return resultAsInt = firstNumber;
    }

    public double calculateAverage(int [] arrayNumbers, int arrayLength ){
        int sum = 0;
        for (int number : arrayNumbers) {
            sum += number;
        }
         return result = (double)sum/arrayLength;
    }

    public String isThereNumberInCollectionGreaterThanTheSumOfTheRest(int [] arrayNumbers, int arrayLength){
        int sum1 = 0;
        int max = 0;
        for (int i = 0; i < arrayLength; i++) {
            max = max < arrayNumbers[i] ? arrayNumbers[i] : max;
            sum1 += arrayNumbers[i];
        }
        if (max > sum1-max) {
            return resultAsString = "yes";
        } else {
            return resultAsString = "no";
        }
    }
}
