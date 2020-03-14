
public abstract class Duck
{
	protected Flyable flyable;
	protected String name;

	public Duck(String name)
	{
		this.name = name;
	}

	public abstract void fly();
	/* 서로 다른 부분은 분리하라 */

	public void setName(String name)
	{
		this.name = name;
	}

	public void setFlyable(Flyable flyable)
	{
		this.flyable = flyable;
	}

}
