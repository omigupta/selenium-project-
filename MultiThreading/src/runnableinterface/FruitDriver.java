package runnableinterface;

import threadclass.Fruit;

public class FruitDriver {
	public static void main(String[]args)
	{
	
Fruit f1=new Fruit("mango",123,4.5);
Fruit f2=new Fruit("apple",180,8.5);
Fruit f3=new Fruit("orange",80,5.5);
Thread t1=new Thread(f1);
Thread t2=new Thread(f1);
Thread t3=new Thread(f1);
t1.start();
t2.start();
t3.start();
t1.setDaemon(true);

	}
}
