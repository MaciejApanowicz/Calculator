package model;

public class Calculations {
    private Data data = new Data();

    public void multiplyNumbers(){
        System.out.println("You have chosen to multiply!");
        data.setFirstNumber();
        data.setSecondNumber();
        System.out.println("Result is: " + (data.getFirstNumber()* data.getSecondNumber()) + '\n');
    }

}
