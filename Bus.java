package com.project;

public class Bus {
	private int busNo;
	private boolean Ac;
	private int capacity;
	
	Bus(int no, boolean Ac, int cap)
	{
		this.busNo = no;
		this.Ac = Ac;
		this.capacity = cap;
	}
	
	public int getbusNo()
	{
		return this.busNo;
	}
	public void setbusNo(int busNo)
	{
		this.busNo=busNo;
	}
	public boolean getAc()
	{
		return this.Ac;
	}
	public void setAc(boolean Ac)
	{
		this.Ac=Ac;
	}
	public int getcapacity()
	{
		return this.capacity;
	}
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public void displayBusInfo()
	{
		System.out.println("Bus No: " + busNo + "Ac: "+ Ac + " Total capacity "+ capacity);
	}
}


