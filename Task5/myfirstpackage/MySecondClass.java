package myfirstpackage;

public class MySecondClass {
	private int firstNumber;
    	private int secondNumber;
    
    	public MySecondClass(int first, int second) {
        	firstNumber = first;
        	secondNumber = second;
    	}
    
    	public void setFirstNumber(int value) {
        	firstNumber = value;
    	}
    
    	public void setSecondNumber(int value) {
     	   secondNumber = value;
    	}
    
    	public int getFirstNumber() {
    	    return firstNumber;
    	}
    
    	public int getSecondNumber() {
        	return secondNumber;
    	}
    
    	public int multiply() {
       		return firstNumber * secondNumber;
    	}
}