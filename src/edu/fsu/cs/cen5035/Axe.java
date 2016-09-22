
//package edu.fsu.cs.cen5035;
public class Axe extends BasicWeapon implements Weapon
{
   public Axe()
   {

       super(60);


   }
   public int hit()
   {

   	return DAMAGE;

   }
   public int hit(int armor)
   {   
   	   int damage=0;
      
       if(armor>=0 && armor<20)
       {    damage=DAMAGE;      
            //return DAMAGE; 


       }
      else if(armor>=20)
      {
            damage=DAMAGE-armor;
            //return damage;



      }
      return damage;

   }




}
