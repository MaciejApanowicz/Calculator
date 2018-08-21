package model;

public class Calculations {
    private Data data = new Data();
    private double result;
    private String resultAsString;
    private int resultAsInt;


    public void multiplyNumbers(){
        data.setFirstNumber();
        data.setSecondNumber();
        this.result = (data.getFirstNumber()* data.getSecondNumber());
    }

    public void divideNumbers(){
        data.setFirstNumber();
        data.setSecondNumber();
        do {
            if (data.getSecondNumber() == 0) {
                //UserView.messageDoNotDivideBy0();
                data.setSecondNumber();
            }
        } while (data.getSecondNumber() == 0);
        this.result = (data.getFirstNumber() / data.getSecondNumber());
    }

    public void exponentiation (){
        data.setNumberToBeBaseForExponentiation();
        data.setPower();
        int result = 1;
        for (int i = 1; i <= data.getSecondNumber(); i++) {
            result *= data.getFirstNumber();
        }
        this.result=result;
    }

    public void squareRootExtraction (){
        data.setNumberToBeSquareRooted();
        this.result = Math.sqrt(data.getFirstNumber());
    }

    public void integerToBinary() {
        data.setIntegerToBeConvertedToBinary();
        StringBuilder binaryNumber = new StringBuilder();
        int integerNumber = (int)data.getFirstNumber();
        while (integerNumber != 0) {
            binaryNumber.append(integerNumber % 2);
            integerNumber /= 2;
        }
        this.resultAsString= binaryNumber.reverse().toString();
    }

    public void binaryToInteger(){
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
        this.resultAsInt= integerNumber;
    }

    public void GCD (){
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
        this.resultAsInt = gcdNumber1;
    }

    public void calculateAverage(){
        data.setArrayLength();
        data.addNumbers();
        data.showArrayNumbers();

        int sum = 0;
        for (int number : data.arrayNumbers) {
            sum += number;
        }
        this.result = (double)sum/data.arrayLength;
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
            this.resultAsString = "yes";
        } else {
            this.resultAsString = "no";
        }
    }
    public double getResult(){
        return result;
    }

    public String getResultAsString() {
        return resultAsString;
    }

    public int getResultAsInt() {
        return resultAsInt;
    }
}
