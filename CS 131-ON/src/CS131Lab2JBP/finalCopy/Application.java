package CS131Lab2JBP.finalCopy;

public class Application extends Wizard implements Lockable {

	public static void main(String[] args) {
Wizard jack = new Wizard();
jack.setKey(2);
jack.lock(5);
jack.takeDamage(35);
System.out.println(jack.getHealth());

jack.unlock(5);
jack.takeDamage(24);
System.out.println(jack.getHealth());

jack.takeDamage(65);
System.out.println(jack.getHealth());

jack.lock(2);
jack.takeDamage(47);
System.out.println(jack.getHealth());
System.out.println(jack.isLocked());

jack.unlock(6);
System.out.println(jack.isLocked());

jack.setName("Jack");
System.out.println(jack.toString());


	}//end main

}//end class
