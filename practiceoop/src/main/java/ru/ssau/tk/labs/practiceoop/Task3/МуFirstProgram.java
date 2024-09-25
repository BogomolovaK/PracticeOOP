class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass();
		System.out.println(o.sum());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				o.setFirstNum(i);
				o.setSecondNum(j);
				System.out.print(o.sum());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
class MySecondClass{
	private int num1;
	private int num2;

	MySecondClass(){
		num1 = 0;
		num2 = 0;
	}

	MySecondClass(int val1, int val2){
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