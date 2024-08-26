package com.evergent.corejava.oops;
class PersonData
{
	public void myPersonData()
	{
		System.out.println("Person data class method");
	}
}
class PersonInfo extends PersonData
{
	public void myDetails()
	{
		System.out.println("Person Info class method");
	}
}
public class MultiLevelInheritanceDemo extends PersonInfo{
	public void show()
	{
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritanceDemo mi=new MultiLevelInheritanceDemo();
		mi.myPersonData();
		mi.myDetails();
		mi.show();

	}

}
