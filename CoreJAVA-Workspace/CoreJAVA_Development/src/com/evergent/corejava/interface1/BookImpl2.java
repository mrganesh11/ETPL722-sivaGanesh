package com.evergent.corejava.interface1;

public class BookImpl2 implements Book {
	public void bookTitle()
	{
		System.out.println("Core Java");
	}
	public void bookAuthor()
	{
		System.out.println("Oracle corp : "+cName);
	}
	public void bookPrice()
	{
		System.out.println("RS. 550");
	}
	public void show()
	{
		System.out.println("Local class method of BookImpl");
	}
	public static void main(String[] args) {
		Book b2=new BookImpl2();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookPrice();
		//b2.show();
	}

}
