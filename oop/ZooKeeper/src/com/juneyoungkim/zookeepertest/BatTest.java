package com.juneyoungkim.zookeepertest;

public class BatTest {
	
	public static void main(String[] args) {
		
		Bat vampire = new Bat();
		
		vampire.attackTown();
		vampire.attackTown();
		vampire.attackTown();
		
		vampire.eatHumans();
		vampire.eatHumans();
		
		vampire.fly();
		vampire.fly();
		
		vampire.displayEnergy();
	}
}
