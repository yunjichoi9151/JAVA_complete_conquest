package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() { 
		// 객체생성 
		A a = new A();
		
		// 멤버 활용
		System.out.print(a.a+ " "); 
		System.out.print(a.b+ " ");
		System.out.print(a.c+ " ");
		//System.out.print(a.d + " ");
		System.out.println();
	}
}
