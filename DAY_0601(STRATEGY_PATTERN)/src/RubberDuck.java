
public class RubberDuck extends Duck
{
	public RubberDuck()
	{
		super("고무 오리");
	}
	
	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
