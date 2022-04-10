package Tugas7_3;

//Author 	: Lewis/Loftus
//Represents an employee that gets paid by the hour

public class Hourly extends Employee{
	
	private int hoursWorked;
	
	public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		super (eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0 ;
	}
	
	public void addHours (int moreHours){
		hoursWorked += moreHours;
	}
	
	public double pay(){
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		
		return payment;
	}
	
	public String toString(){
		String result = super.toString();
		result += "\nCurrent hours : " + hoursWorked;
		
		return result;
	}
}