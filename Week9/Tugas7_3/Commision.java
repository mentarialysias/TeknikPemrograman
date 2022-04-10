package Tugas7_3;

//Author 	: Mentari Ayu Alysia Sudrajat

public class Commision extends Hourly {
	private double totalSales;
	private double commisionRate;
	
	//Mengaturcommision employee menggunakan informasi yang telah ditentukan.
	public Commision(String eName, String eAddress, String ePhone,	String socSecNumber, double rate, double commisionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
	    this.commisionRate = commisionRate;
	}
	
	//Menambahkan jumlah penjualan yang telah ditentukan ke total penjualan
	public void addSales(double sales) {
	    this.totalSales = sales;
	}
	
	//Menghitung dan mereturn nilai gaji untuk commision employee.
	public double pay() {
	    double payment = super.pay();
	    payment += totalSales * commisionRate;
	    totalSales = 0;
	    return payment;
	  }
	
	//mereturn informasi dari commision employee dalam bentuk string. 
	public String toString() {
		String result = super.toString();
	    result += "\nTotal Sales: " + totalSales; 
	    return result;
	}
}