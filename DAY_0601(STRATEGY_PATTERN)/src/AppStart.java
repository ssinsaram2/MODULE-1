
public class AppStart
{
	public static void main(String[] args)
	{
		Duck[] ds = new Duck[] { new MallardDuck(), new RubberDuck(), new DonaldDuck() };

		Duck d1 = new MallardDuck();
		Duck d2 = new RubberDuck();
		Duck d3 = new DonaldDuck();
		
		d1.setFlyable(new FlyWithWing());
		d2.setFlyable(new FlyNoWay());
		d3.setFlyable(new FlyNoWay());
		
		d1.fly();
		d2.fly();
		d3.fly();
		
		d3.setFlyable(new FlyWithWing());
		
		d1.fly();
		d2.fly();
		d3.fly();
	}
}
