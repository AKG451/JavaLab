package ignore;
import java.util.Scanner;
import java.util.Arrays;
/*Define a class called BillPayment with paymenttype,amount,details.For this given
BillPayment class, demonstrate constructor overloading for three types of payment.
That is for cash on delivery, card, and UPI payments. Instantiate the BillPayment
class using each overloaded constructor. Call the processPayment() method on
each instance to display the corresponding payment details.*/

class BillPayment{
	String paymentType;
	double amount;
	String details;
	public BillPayment() {
		paymentType = "COD";
		amount = 0.0;
		details = "Cash on delivery";
	}
	public BillPayment(String card,double amount) {
		this.paymentType = card;
		this.amount = amount;
		this.details = "Card Payment";
	}
    public BillPayment(String upiId,double amount,Boolean isUpi) {
		if(isUpi) {
			this.paymentType = upiId;
			this.amount = amount;
			this.details = "UPI payment";
		}
	}
    public void processPayment(){
    	System.out.println("Payment Type: "+ paymentType);
    	System.out.println("Amount: "+ amount);
    	System.out.println("Details: "+ details);
    }
}

public class payment {
	public static void main(String[] args) {
	BillPayment b1 = new BillPayment();
	b1.processPayment();
	BillPayment b2 = new BillPayment("Visa",1000);
	b2.processPayment();
	BillPayment b3 = new BillPayment("23532",2000,true);
	b3.processPayment();
}
}