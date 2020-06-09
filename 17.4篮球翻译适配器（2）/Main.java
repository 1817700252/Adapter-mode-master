package day13_demo03;

import day13_demo02.Forwards;
import day13_demo02.Guards;
import day13_demo02.Player;

public class Main
{
	public static void main(String[] args)
	{
		Player b = new Forwards("°ÍµÙ¶û");
		b.attack();

		Player m = new Guards("Âó¿Ë¸ñÀ×µÏ");
		m.attack();

		Player ym = new Translator("Ò¦Ã÷");
		ym.attack();
		ym.defense();
	}
}