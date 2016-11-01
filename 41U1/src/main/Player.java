package main;

import java.util.*;
public class Player implements IPlayer{
	
private String Name;
private int Strength;
private int Hp;
private int Defence;
private int Level;
private int Xp;
private int Damage;
private boolean Alive;

		public Player(String Name, boolean Alive, int Hp, int Strength, int Defence, int Level, int Xp, int Damage){
			this.Name = Name;
			this.setAlive(Alive);
			this.Hp = Hp;
			this.Defence = Defence;
			this.Level = Level;
			this.Xp = Xp;
			this.Damage = Damage;
		}
		
		private int attack(){
			
			if(dodge()){
				System.out.println("miss!");
			}
			return Damage + Strength;	
			}
		
		public int takeDamage(){
			return Hp;
		}
		
			private boolean dodge() {
						Random random = new Random();
							int i = random.nextInt(4);
								if(i == 0){
										return true;
									}
									else
											return false;			
											}

		public String showStats(){
			System.out.println(Name + " is " + (isAlive() ? "Alive" : "Dead") + ", has " + getHp() + " Hp and is Level "  + getLevel());
			return null;
		}
		
	public boolean isAlive() {
			if(Hp <= 0){
				System.out.println(getName() + " is dead. Better luck next time.");
				return false;
				
			}
			else{
		//		System.out.println(getName() + " is still alive somehow.");
				return Alive;
			}

			
		}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public int getHp() {
		return Hp;
	}

	public int getDefence() {
		return Defence;
	}

	public void setDefence(int defence) {
		Defence = defence;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public int getXp() {
		return Xp;
	}

	public void setXp(int xp) {
		Xp = xp;
	}

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}
	
	public String setName(){
		return Name;
	}
	public int setStrength(){
		return Strength;
	}

	public void setAlive(boolean alive) {
		Alive = alive;
	}

	public int setHp() {
		return Hp;
	}

	public int setDefence() {
		return Defence;
	}

	public int setLevel() {
		return Level;
	}

	public int setXp() {
		return Xp;
	}






}
