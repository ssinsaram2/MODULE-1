
public class RubberDuck extends Duck
{
	public RubberDuck()
	{
		super("�� ����");
	}
	
	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
