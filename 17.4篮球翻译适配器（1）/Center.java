package day13_demo02;

public class Center extends Player
{
	public Center(String name)
	{
		super(name);
	}

	public void attack()
	{
		System.out.println("ÖĞ·æ" + name + "½ø¹¥");
	}

	public void defense()
	{
		System.out.println("ÖĞ·æ" + name + "·ÀÊØ");
	}
}
