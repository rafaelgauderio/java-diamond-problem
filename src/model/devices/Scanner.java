package model.devices;

public class Scanner extends Device {

	public Scanner(String manufacturer, String name) {
		super(manufacturer, name);
	}

	@Override
	public void processingDocument(String document) {
		System.out.println("Scanner processing the document: " + document);
		
	}
	
	public void scan(String document) {
		System.out.println("The scanner " + this.name + " - " + this.manufacturer + " is scanning the document:" + document);
	}

}
