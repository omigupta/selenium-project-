package threadclass;

public class Fruit extends Thread {
	String name;
	int price;
	double weight;
	Fruit()
	{
		
	}
public Fruit(String name,int price,double weight)
{
	this.name=name;
	this.price=price;
	this.weight=weight;
}
@Override
public void run() {
	System.out.println("Run method is overridden");
	System.out.println(1);
	Display();
	System.out.println(2);
	System.out.println(3);
	System.out.println("==================run ends===========================");
}

public void Display()
{
	System.out.println("name is:"+name);
	System.out.println("price is:"+price);
	System.out.println("weight is:"+weight);
	System.out.println("============================================");
}
}