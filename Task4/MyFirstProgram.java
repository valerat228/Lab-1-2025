class MyFirstClass {
	void main(String[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
		int i, j;
		MySecondClass o = new MySecondClass(0, 0);
    		for (i = 1; i <= 8; i++) {
        		for(j = 1; j <= 8; j++) {
            			o.setFirstNumber(i);
                		o.setSecondNumber(j);
            			System.out.print(o.multiply());
            			System.out.print(" ");
        		}
        		System.out.println();
    		}
	}
}

class MySecondClass {
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