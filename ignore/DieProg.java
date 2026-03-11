package ignore;

class Die{
	int sideUp;
	public Die() {
		roll();
	}
	public int getSideUp() {
		return sideUp;
	}
	public void roll() {
		sideUp = (int)((Math.random()*6)+1);
	}
}

public class DieProg {
	public static void main(String[] args) {
		Die d1 = new Die();
		Die d2 = new Die();
		int val1 = d1.getSideUp();
		int val2 = d2.getSideUp();
		System.out.println("The value of Die 1 is: " +val1);
		System.out.println("The value of Die 2 is: " +val2);
		int sum = val1 + val2;
	    System.out.println("The sum of the two sides up is: " + sum);
	}
}
