package sas.java.practice.sample;



public class CodeSnippet {
	
	
	public static void main(String[] args) {
		System.out.println("start");
		B b = new C();
		b.print(new Integer(5));
		System.out.println("end");
	}

}


class A {
	
	static A a = new A();
	
}

class B {
	
	static void test(){
		System.out.println("test");
	}
	
	void print(int i){
		System.out.println("B = "+i);
	}
	
}


class C extends B{
	void print(Integer i){
		System.out.println("C = "+i);
	}
	
	
}