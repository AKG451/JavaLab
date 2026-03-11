package ignore;
import java.util.Scanner;
import java.util.Arrays;

/*Create a class Smartphone that contains an inner class Processor. Implement the
following:
1.The Smartphone class should have an instance variable brand and a constructor
to initialize it.
2.The inner class Processor should have instance variables cores (int) and
clockSpeed (double, in GHz) with a constructor to initialize them.
3.The Processor class should have a method displayProcessorDetails() that prints
the smartphone brand, number of cores, and clock speed.
Implement the necessary logic in the main() method to create a Smartphone object
and associate it with a Processor object. Then, display the processor details.*/

class Smartphone{
	String brand;
	public Smartphone(String brand) {
		this.brand = brand;
	}
	class Processor{
		int cores;
		double clockSpeed;
		public Processor(int cores,double clockSpeed) {
			this.cores = cores;
			this.clockSpeed = clockSpeed;
		}
		public void displayProcessorDetails(){
			System.out.println("Brand: " + brand);
			System.out.println("Numbers of cores: " +cores);
			System.out.println("Clock speed: " + clockSpeed);
		}
	}
}

public class qpInner {
	public static void main(String[] args) {
	Smartphone smartphone = new Smartphone("Samsung");
	Smartphone.Processor pros = smartphone.new Processor(8,4.8);
	pros.displayProcessorDetails();
}
}