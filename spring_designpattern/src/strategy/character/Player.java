package strategy.character;

import strategy.weapon.Weapon;

public abstract class Player extends AbstractCharacter{
    
    public Player(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
    }
    
    public void equippedWeapon(Weapon weapon){
        System.out.println(weapon.getName() + " 착용했습니다.");
        super.weapon = weapon;
    }
}
