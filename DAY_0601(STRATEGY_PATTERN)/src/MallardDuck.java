
public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		super("û�տ���");
	}

	@Override
	public void fly()
	{
		System.out.print(this.name+" : ");
		flyable.doFly();
	}
}
