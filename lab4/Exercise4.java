package lab4;

class Counter {
    static int count = 0;
    
    public Counter() {
        count++;
        System.out.println("Object Created! Current count is: " + count);
    }
    
    public static void showCount() {
        System.out.println(">> Total Objects Created so far: " + count);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        
        System.out.println("Start of program...");
        Counter.showCount();
        
        System.out.println("\nCreating 1st object:");
        Counter c1 = new Counter();
        
        System.out.println("\nCreating 2nd object:");
        Counter c2 = new Counter();
        
        System.out.println("\nCreating 3rd object:");
        Counter c3 = new Counter();
        
        System.out.println("-----------------");
        Counter.showCount(); 
    }
}