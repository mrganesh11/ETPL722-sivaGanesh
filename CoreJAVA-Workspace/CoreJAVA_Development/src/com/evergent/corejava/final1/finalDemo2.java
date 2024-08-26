package com.evergent.corejava.final1;
class MyClass
{
	final public void myProducts()
	{
		System.out.println("All Products");
	}
}
public class finalDemo2 extends MyClass{
	final String cname="India";
	public void myProducts1()
	{
		System.out.println("All Products");
	}
	public void myData()
	{
		System.out.println(cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalDemo2 fd2=new finalDemo2();
		fd2.myData();
		fd2.myProducts();
	}

}
