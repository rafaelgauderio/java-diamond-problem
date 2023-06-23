package application;

import model.devices.ConcretePrinter;
import model.devices.ConcreteScanner;
import model.devices.MultifunctionalPrinterAndScanner;

public class Program {

	public static void main(String [] args) {
		
		ConcretePrinter hp = new ConcretePrinter("HP","Laser jet Pro m454dw");
		hp.processingDocument("Rental Contract");
		hp.print("Rental Contract");
		
		System.out.println("\n");
		
		ConcreteScanner canon = new ConcreteScanner("Canon", "Lide 300");
		canon.processingDocument("Pictures of Paris travel");
		canon.scan("Pictures of Paris travel");
		
		System.out.println("\n");
		
		MultifunctionalPrinterAndScanner ricoh = new MultifunctionalPrinterAndScanner("Ricoh","LaserJet Aficio sp 3510sf");
		ricoh.processingDocument("invoice");
		ricoh.print("invoice");
		ricoh.scan("Personal documents");
		
	}
}
