package threadclass;

public class FruitDriver {
	public static void main(String[]args)
	{
	
Fruit f1=new Fruit("mango",123,4.5);
Fruit f2=new Fruit("apple",180,8.5);
Fruit f3=new Fruit("orange",80,5.5);
//f1.Display();
//f2.Display();
//f3.Display();
f1.start();
f2.start();
f3.start();
}
}
 