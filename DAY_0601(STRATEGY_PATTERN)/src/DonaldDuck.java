
public class DonaldDuck extends Duck
{
	public DonaldDuck()
	{
		super("µµ³Îµå");
	}
	
	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
