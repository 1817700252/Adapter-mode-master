package day13_demo03;

import day13_demo02.Forwards;
import day13_demo02.Guards;
import day13_demo02.Player;

public class Main
{
	public static void main(String[] args)
	{
		Player b = new Forwards("�͵ٶ�");
		b.attack();

		Player m = new Guards("��˸��׵�");
		m.attack();

		Player ym = new Translator("Ҧ��");
		ym.attack();
		ym.defense();
	}
}