package day13_demo02;

public class Guards extends Player
{
	public Guards(String name)
	{
		super(name);
	}

	public void attack()
	{
		System.out.println("ºóÎÀ" + name + "½ø¹¥");
	}

	public void defense()
	{
		System.out.println("ºóÎÀ" + name + "·ÀÊØ");
	}
}
