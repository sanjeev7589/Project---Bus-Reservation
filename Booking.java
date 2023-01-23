package com.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
String PassengerName;
int busNo;
Date date;

Booking() throws ParseException
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name: ");
	PassengerName =s.next();
	System.out.println("Enter busno: ");
	busNo = s.nextInt();
	System.out.println("Enter date dd-mm-yyyy");
	String dateInput = s.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	date = dateFormat.parse(dateInput);
}
public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses)
{
	int capacity =0;
	for(Bus bus:buses)
	{
		if(bus.getbusNo() == this.busNo)
		{
			capacity = bus.getcapacity();
		}
	}
	int booked =0;
	for(Booking booking:bookings)
	{
		if(booking.busNo == this.busNo && booking.date.equals(this.date))
		{
			booked++;
		}
	}
	return booked<capacity?true:false;
}
}
