package model.devices;

public class MultifunctionalPrinterAndScanner extends Device implements Printer, Scanner {

	public MultifunctionalPrinterAndScanner(String manufacturer, String name) {
		super(manufacturer, name);
		
	}

	@Override
	public void processingDocument(String document) {		
		System.out.println("Multifunctional processing the document: " + document);
	}

	@Override
	public void scan(String document) {		
		System.out.println("The Multifunctional " + this.name + " - " + this.manufacturer + " is scanning the document: " + document);
	}

	@Override
	public void print(String document) {		
		System.out.println("The Multifunctional " + this.name + " - " + this.manufacturer + " is printing the document: " + document);
	}

}
