package com.project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
public static void main(String[] args) throws ParseException
{
	ArrayList<Bus> buses = new ArrayList<Bus>();
	buses.add(new Bus(1,true,1));
	buses.add(new Bus(2,true,50));
	buses.add(new Bus(3,true,48));
	
	for(Bus bus:buses)
	{
		bus.displayBusInfo();
	}
	
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	
	int userOpt=1;
	Scanner s = new Scanner(System.in);
	while(userOpt ==1)
	{
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = s.nextInt();
		if(userOpt == 1)
		{
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,buses))
			{
				bookings.add(booking);
				System.out.println("Booking confirmed");
			}
			else
			{
				System.out.println("Bus is full");
			}
		}
		
	}	
}
}
