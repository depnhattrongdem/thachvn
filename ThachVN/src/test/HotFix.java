package test;

public class Test {

	public int Sum(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Test test = new Test();
		int sum = test.Sum(1, 2);
		System.out.println(sum);
	}
}
