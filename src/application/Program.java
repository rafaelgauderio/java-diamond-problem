package application;

import model.devices.Printer;
import model.devices.Scanner;

public class Program {

	public static void main(String [] args) {
		
		Printer hp = new Printer("HP","Laser jet Pro m454dw");
		hp.processingDocument("Rental Contract");
		hp.print("Rental Contract");
		
		System.out.println("\n");
		
		Scanner canon = new Scanner("Canon", "Lide 300");
		canon.processingDocument("Pictures of Paris travel");
		canon.scan("Pictures of Paris travel");
		
		
	}
}
