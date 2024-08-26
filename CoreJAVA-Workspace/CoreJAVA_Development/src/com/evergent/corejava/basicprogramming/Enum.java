package com.evergent.corejava.basicprogramming;
enum color{
		 red,green,blue;	
	}
	enum news{
		north,east,west,south;
	}
	enum Abcproducts{
		laptop,desktops,tools;
	}
	enum days
	{
		Monday,tuesday,wednesdsay,thursday,friday,saturday,sunday;
	}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		color c=color.red;
		System.out.println(c);
		news s=news.north;
		System.out.println(s);
		Abcproducts p=Abcproducts.laptop;
		System.out.println(p);
		days d=days.sunday;
		System.out.println(d);
	}

}
