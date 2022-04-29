package com;
class car
{
	final int max_speed=120;
	final int y=90;
	void controlSpeed()
	{
	//max_speed=180; 
	final int x=12;
	System.out.println("Max Speed value is " +max_speed);
	System.out.println("x value is "+ x);
	}
	final void display()
	{
		System.out.println(max_speed+" " +y+" ");
	}
}
class Maruti extends car
{

	@Override
	void controlSpeed() 
	{
		System.out.println("bbbbbbbbbbbbbbbblaaaaaaaaaaaaaaaaah");
	}
	
}
class Hyundai extends car
{

	@Override
	void controlSpeed()
	{
	
	}
	
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		car obj=new car();
		obj.controlSpeed();
		obj.display();
}
}
