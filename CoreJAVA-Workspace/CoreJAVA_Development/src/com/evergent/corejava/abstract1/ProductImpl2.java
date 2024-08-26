package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product
{
	public void newProduct()
	{
		System.out.println("My new product");
	}
	public void show()
	{
		System.out.println("Local methods of product Impl class");
	}
	public static void main(String[] args) 
	{
		ProductImpl2 p2=new ProductImpl2();
		p2.allProducts();
		p2.newProduct();
	}
}
