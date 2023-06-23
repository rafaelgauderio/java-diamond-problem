package model.devices;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String manufacturer, String name) {
		super(manufacturer, name);
	}

	@Override
	public void processingDocument(String document) {
		System.out.println("Scanner processing the document: " + document);
		
	}
	
	@Override
	public void scan(String document) {
		System.out.println("The scanner " + this.name + " - " + this.manufacturer + " is scanning the document:" + document);
	}

}
