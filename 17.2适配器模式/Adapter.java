package day13_demo01;

public class Adapter extends Target
{
	private Adaptee	adaptee	= new Adaptee();

	public void request()
	{
		adaptee.specificRequest();
	}
}
