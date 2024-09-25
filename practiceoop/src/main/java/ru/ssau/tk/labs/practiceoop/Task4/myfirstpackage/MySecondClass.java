package myfirstpackage;

public class MySecondClass{
	private int num1;
	private int num2;

	public MySecondClass(){
		num1 = 0;
		num2 = 0;
	}

	public MySecondClass(int val1, int val2){
		num1 = val1;
		num2 = val2;
	}

	public int getFirstNum(){
		return num1;
	}

	public int getSecondNum(){
		return num2;
	}

	public void setFirstNum(int val){
		num1 = val;
	}

	public void setSecondNum(int val){
		num2 = val;
	}

	public int sum(){
		return num1+num2;
	}
}