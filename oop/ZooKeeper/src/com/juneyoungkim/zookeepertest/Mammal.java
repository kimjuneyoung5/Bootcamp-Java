package com.juneyoungkim.zookeepertest;

public class Mammal {
	
	protected int energyLevel;
	
	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	public int displayEnergy() {
		System.out.println("Energy: " + energyLevel);
		return this.energyLevel;
	}
	
}
