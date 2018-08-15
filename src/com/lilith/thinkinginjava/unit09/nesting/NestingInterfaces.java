package com.lilith.thinkinginjava.unit09.nesting;
/**
 * P185	嵌套接口
 * 1、接口中的与默认是static和final修饰的
 * 2、嵌套接口的访问权限
 * @author 56580
 *
 */
class A {
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f() {}
	}
	public class BImp2 implements B{
		public void f() {}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f() {}
	}
	private class CImp2 implements C{
		public void f() {}
	}
	private interface D{
		void f();
	}
	private class DImp implements D{
		public void f() {}
	}
	public  class DImp2 implements D{
		public void f() {}
	}
	public D getD() {
		return new DImp2();
	}
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}
interface E{
	interface G{
		void f();
	}
	public interface H{
		void f();
	}
	void g();
}
public class NestingInterfaces{
	public class BImp implements A.B{
		public void f() {}
	}
	class CImp implements A.C{
		public void f() {}
	}
	class EImp implements E{
		public void g() {}
	}
	class EGImp2 implements E.G{
		public void f() {}
	}
	class EImp2 implements E{
		public void g() {}
		class EG implements E.G{
			public void f() {}
		}
	}
	public static void main(String[] args) {
		A a = new A();
//		A.DImp2 di2 = a.getD();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
