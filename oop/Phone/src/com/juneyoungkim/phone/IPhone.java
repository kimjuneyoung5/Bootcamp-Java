package com.juneyoungkim.phone;

public class IPhone extends Phone implements Ringable {
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        // your code here
		return "iPhone says " + this.getRingTone();
    }
    
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
        // your code here   
    	System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}

