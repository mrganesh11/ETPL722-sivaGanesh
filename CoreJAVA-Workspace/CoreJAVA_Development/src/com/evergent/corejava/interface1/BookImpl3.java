package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook {
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
	public void myNewBook()
	{
		System.out.println("My new book");
	}
	public void dataInfo()
	{
		System.out.println("My data info");
	}
	public static void main(String[] args) {
		BookImpl3 book3=new BookImpl3();
		book3.bookTitle();
		book3.bookAuthor();
		book3.bookPrice();
		book3.show();
		book3.myNewBook();
	}

}
