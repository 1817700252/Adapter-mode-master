package day13_demo02;

public class Main
{
	public static void main(String[] args)
	{
		Player b = new Forwards("�͵ٶ�");
		b.attack();

		Player m = new Guards("��˸��׵�");
		m.attack();

		Player ym = new Center("Ҧ��");
		ym.attack();
		ym.defense();
	}
}
