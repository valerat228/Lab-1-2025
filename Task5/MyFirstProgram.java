import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
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
