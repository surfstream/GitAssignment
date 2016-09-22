//package edu.fsu.cs.cen5035;
public class WeaponFactory  {

    public static Weapon getWeapon(String type) {
        WeaponFactory wf = new WeaponFactory();
        switch (type) {
            case "sword":
            	Weapon s = wf.createSword();
                //Weapon s = new Sword(); 
                return s;
            case "arrow":
            	Weapon a = wf.createArrow();
                return a;
            case "axe":
                Weapon ax= wf.createAxe();
                return ax; 
            case "magicstaff":
                Weapon magic=wf.createmagic();
                return magic;       
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
    public Weapon createSword() {
    	return new Sword();
    }
    public Weapon createArrow() {
    	return new Arrow();
    }
     public Weapon createAxe() {
    	return new Axe();
    }
     public Weapon createmagic() {
    	return new MagicStaff();
    }
}
