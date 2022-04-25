package sec01_typeofexception.EX02_UncheckedException;

class A {}
class B extends A {}

public class UncheckedException {
	public static void main(String[] args) {
		
		// UncheckedException = RuntimeException(실행 예외)
		
		// 1. ArithmeticException
		System.out.print(3 / 0);
		
		// 2. ClassCastException
		A a = new A();
		B b = (B)a;
		
		// 3. ArrayIndexOutOfBoundException
		int[] array = {1, 2, 3};
		System.out.println(array[3]);
		
		// 4. NumberFormatException
		int num = Integer.parseInt("10!");
		
		// 5. NullPointerException
		String str = null;
		System.out.println(str.charAt(2));
	}
}
