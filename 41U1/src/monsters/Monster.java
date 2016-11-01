package monsters;

import java.util.ArrayList;
import java.util.Random;

public abstract class Monster implements IMonster{
	
	
	protected int Hp;
	protected int Damage;
	
	public static ArrayList<Monster> monsterList= new ArrayList<Monster>(2);
	Monster Skaven= new Skaven(10, 4);
	Monster Orc= new Orc (20, 6);
	Monster Ogre= new Ogre (30, 10);
	
	public Monster(){

	} 
	
	public int attack(){
		
		if(dodge()){
			System.out.println("miss!");
		}
		return Damage;	
		}
	
	public boolean dodge() {
		Random random = new Random();
			int i = random.nextInt(4);
				if(i == 0){
						return true;
					}
					else
							return false;			
							}
	
	public boolean isAlive() {
		if(Hp <= 0){
			return false;
			
		}
		else{
			return true;
		}
	}


	

}
