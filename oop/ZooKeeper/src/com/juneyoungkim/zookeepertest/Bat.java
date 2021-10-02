package com.juneyoungkim.zookeepertest;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		if(this.energyLevel - 50 == 0) {
			this.energyLevel = 0;
			System.out.println("Giant Bat is flying!!");
			System.out.println("Bat looks exhausted");
		}
		else if (this.energyLevel - 50 < 0) {
			System.out.println("Bat does not have enough energy to fly");
		}
		else {
			this.energyLevel -= 50;
			System.out.println("Giant Bat is flying!!");
		}
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Giant Bat is attacking humans!!");
	}
	
	public void attackTown() {
		if(this.energyLevel - 100 == 0) {
			this.energyLevel = 0;
			System.out.println("Giant Bat is attacking town!!");
			System.out.println("Bat looks exhausted");
		}
		else if (this.energyLevel - 100 < 0) {
			System.out.println("Bat does not have enough energy to attack town");
		}
		else {
			this.energyLevel -= 100;
			System.out.println("Our town is under attack!");
		}
	}
}
