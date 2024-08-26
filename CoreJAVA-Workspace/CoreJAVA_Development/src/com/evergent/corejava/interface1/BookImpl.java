package com.evergent.corejava.interface1;

public class BookImpl implements Book {
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
		BookImpl book1=new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
	}

}
