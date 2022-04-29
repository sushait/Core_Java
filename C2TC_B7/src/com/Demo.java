package com;
public class Demo {
void func()
{
	System.out.println("hi");
}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.func();
		
System.out.println(d1.getClass());
System.out.println(d1.hashCode());
System.out.println(d2.hashCode());
	}

}
