
public class DonaldDuck extends Duck
{
	public DonaldDuck()
	{
		super("���ε�");
	}
	
	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
