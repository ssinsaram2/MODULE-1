
public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		super("Ã»µÕ¿À¸®");
	}

	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
