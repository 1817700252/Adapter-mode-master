package day13_demo02;

public class Main
{
	public static void main(String[] args)
	{
		Player b = new Forwards("°ÍµÙ¶û");
		b.attack();

		Player m = new Guards("Âó¿Ë¸ñÀ×µÏ");
		m.attack();

		Player ym = new Center("Ò¦Ã÷");
		ym.attack();
		ym.defense();
	}
}
