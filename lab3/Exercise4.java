//Create a Die class with one integer instance variable called sideUp. Give it a
//getSideUp() method that returns the values of sideUp and a void roll() method that
//changes sideUpto a random value from 1 to 6.Then create a DieDemo class with a
//method that creates two Die objects, rolls them, and prints the sum of the two sides
//up.
package lab3;

class DIE{
	int sideUp ;
	public DIE(){
		sideUp = 1;
	}
	public void roll() {
		sideUp = (int) (Math.random() *6)+1;
	}
	public int getSideUp() {
		return sideUp;
	}
}
class DieDemo{
	public void play() {
	DIE die1 = new DIE();
	DIE die2 = new DIE();
	System.out.println("Rolling the two dices");
	die1.roll();
	die2.roll();
	int value1 = die1.getSideUp();
	int value2 = die2.getSideUp();
	System.out.println("Die 1: " + value1);
    System.out.println("Die 2: " + value2);
    System.out.println("Total Sum: " + (value1 + value2));
}
}

public class Exercise4{
	public static void main(String[] args) {
		DieDemo play = new DieDemo();
		play.play();
	}
}

