package day13_demo03;

import day13_demo02.Player;

public class Translator extends Player
{
	private ForeignCenter	wjzf	= new ForeignCenter();

	public Translator(String name)
	{
		super(name);
		wjzf.setName(name);
	}

	public void attack()
	{
		wjzf.����();
	}

	public void defense()
	{
		wjzf.����();
	}
}
