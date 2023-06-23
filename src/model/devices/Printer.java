package model.devices;

public class Printer extends Device {
	
	public Printer(String manufacturer, String name) {
		super(manufacturer, name);
	}

	@Override
	public void processingDocument(String document) {
		System.out.println("Printer processing the document: " + document);
		
	}
	
	public void print(String document) {
		System.out.println("The printer " + this.name + " - " + this.manufacturer + " is printing the document: " + document);
		
	}

}
