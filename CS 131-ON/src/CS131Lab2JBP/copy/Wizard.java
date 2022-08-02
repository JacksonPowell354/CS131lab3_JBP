package CS131Lab2JBP.copy;
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable {

/**
* instance variable
* private String name
*/
private String name;
/**
* instance variable
* private String health
*/
private int health;
/**
* instance variable
* private int key
*/
private int key;

/**
* instance variable
* private boolean locked
*/
private boolean locked;

/**
* getter method for name
*/
public String getName() {
return name;
}

/**
* setter method for name
*
* @param name
*/
public void setName(String name) {
this.name = name;
}

/**
* getter method for health
*/
public int getHealth() {
return health;
}

/**
* setter method for health
*
* @param health
*/
public void setHealth(int health) {
this.health = health;
}

/**
* setter method for key
*
* @param key
*/
public void setKey(int key) {
if (this.key == 0 && key > 0)
this.key = key;
}

/**
* method checks whether the Wizard is locked
*
* @return boolean
*/
public boolean isLocked() {
return locked;
}

/**
* empty argument constructor for Wizard
* Initializes key as 0
* Initializes locked as false
*/
public Wizard() {
this.key = 0;
this.locked = false;
}

/**
* preferred constructor for Wizard
* Initializes key to 0
* Initializes locked as false
* sets the name
*
* @param name
*/
public Wizard(int key,String name) {
this.name = name;
this.key=key;






}

/**
* method takeDamage()
* method takes damage
* if wizard is not locked
*
* @param power
*/
public void takeDamage(int power) {
if (!isLocked())
this.health = this.health - power;
}

/**
* method lock()
* this method locks if the key matches
*/
public void lock(int key) {
if (this.key == key)
this.locked = true;
}

/**
* method unlock()
* this method unlocks if the key matches
*/
public void unlock(int key) {
if (this.key == key)
this.locked = false;

}

@Override
public String toString() {
	return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + ", getName()="
			+ getName() + ", getHealth()=" + getHealth() + ", isLocked()=" + isLocked() + "]";
}

}