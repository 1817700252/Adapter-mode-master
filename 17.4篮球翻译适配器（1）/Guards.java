package day13_demo02;

public class Guards extends Player
{
	public Guards(String name)
	{
		super(name);
	}

	public void attack()
	{
		System.out.println("����" + name + "����");
	}

	public void defense()
	{
		System.out.println("����" + name + "����");
	}
}
