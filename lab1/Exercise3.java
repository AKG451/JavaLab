package lab1;

public class Exercise3 {

    public static void main(String[] args) {
        /* Prove that Java automatically promotes smaller types (byte, short) 
           to int during expressions. */
        
        byte b1 = 50;
        byte b2 = 40;
        
        // --- PROOF 1: Multiplication ---
        // This line causes a COMPILER ERROR: "Type mismatch: cannot convert from int to byte"
        // This proves that (b1 * b2) was promoted to an int automatically.
        // byte productError = b1 * b2; // Uncomment to see error
        
        // Correct way:
        int productInt = b1 * b2; // No cast needed if we store in int
        System.out.println("Product (as int): " + productInt);

        // --- PROOF 2: Addition ---
        // Even though 50 + 40 = 90 (which fits in a byte), Java still promotes to int.
        // byte sumError = b1 + b2; // Uncomment to see error
        
        // Correct way with casting:
        byte sum = (byte) (b1 + b2); 
        System.out.println("Sum (cast to byte): " + sum);
        
        // --- PROOF 3: The Overflow Risk ---
        // This shows WHY Java promotes to int. 
        // 50 * 40 = 2000. A byte can only hold up to 127.
        // If we force it back into a byte, we lose data (overflow).
        byte productCast = (byte) (b1 * b2); 
        System.out.println("Product (cast to byte - Data Loss!): " + productCast);
    }
}