package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
	
	 double chashKm = 0.21;
	 int underage = 18;
	 int over = 65;
	 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("numero km:");
     int km = sc.nextInt();
     
     System.out.println("età:");
     int age = sc.nextInt();
     
     double ticket = km * chashKm; 
     
     
     if (age < underage) {
    	 double underScount = (ticket / 100) * 20;
    	 double underTicket = ticket - underScount;
    	 System.out.println("costo biglietto= " + underTicket);
     }else if(age > over) {
    	 double overScount = (ticket / 100) * 40;
    	 double overTicket = ticket - overScount;
    	 System.out.println("costo biglietto= " + overTicket);
     }else {
         System.out.println("costo biglietto= " + ticket);
     }
     }
	
}
