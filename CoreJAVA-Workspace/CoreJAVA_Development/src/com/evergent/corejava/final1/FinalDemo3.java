package com.evergent.corejava.final1;
final class Demo
{
	final public void myProducts()
	{
		System.out.println("All Products");
	}
}
class finalDemo3{
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
		finalDemo3 fd2=new finalDemo3();
		Demo m=new Demo();
		fd2.myData();
		m.myProducts();
	}
}
