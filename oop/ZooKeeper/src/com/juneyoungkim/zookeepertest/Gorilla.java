package com.juneyoungkim.zookeepertest;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super(100);
	}
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla is throwing something at you!!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla is eating bananas");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla is climbing tree!");
	}
}
