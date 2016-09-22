
//package edu.fsu.cs.cen5035;
public class MagicStaff extends BasicWeapon implements Weapon
{
   public MagicStaff()
   {
        super(80);


   }
   public int hit()
   {
      return DAMAGE;

   }
   public  int hit(int armor)
   {    if(armor>0)
        { int damage=DAMAGE-(armor-(armor*20/100));
          return damage;
        } 
        else
        {
          return DAMAGE;
        }

   }




} 
