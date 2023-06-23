package model.devices;

public abstract class Device {
	
	public String manufacturer;
	public String name;	
	
	
	public Device(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void processingDocument(String document); 
	
	

}
