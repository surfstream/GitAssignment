
//package edu.fsu.cs.cen5035;
public class Arrow extends BasicWeapon implements Weapon{

 public Arrow()
 {
   super(70);

 }
  public int hit()
  {
  	return DAMAGE;
  }
  public int hit(int armor)
  {
    int damage=DAMAGE-(armor-5);
    if(damage<0)
    {
       return 0;

    }
    else if(armor<=5)
    {

    	return DAMAGE;
    }	
    else
    	return damage;
  }





}
