
//package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args)
     {    
     	//WeaponFactory wf = new WeaponFactory();
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        Weapon axe = WeaponFactory.getWeapon("axe");
        Weapon magicstaff = WeaponFactory.getWeapon("magicstaff");

		System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        //armor = 30;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points and it ignores 5points if armour is present.");
        System.out.println("Axe has " + axe.hit() + " of damage and ignores 5 points of armour if armour is present.");
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points and it ignores armour less than 20.");
        System.out.println("magicstaff has " + magicstaff.hit() + " of damage.");
        System.out.println("magicstaff was able to do " + magicstaff.hit(armor) + " of damage due to an armor with "+armor+ " points because it ignores armor by 20%.");
        
        

    }
}
