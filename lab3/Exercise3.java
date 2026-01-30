package lab3;
import java.util.Scanner;

class Mixer {
    int arr[];

    public Mixer(int size) {
        arr = new int[size];
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " Elements");
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.println("Enter element no." + (i + 1));
                int val = sc.nextInt();
                
                if (i > 0 && val <= arr[i - 1]) {
                    System.out.println("Please enter a element larger than: " + arr[i - 1]);
                    continue;
                }
                
                arr[i] = val;
                break;
            }
        }
    }

    public Mixer mix(Mixer other) {
        int n1 = this.arr.length;
        int n2 = other.arr.length;

        int temp[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (this.arr[i] < other.arr[j]) {
                temp[k++] = this.arr[i++];
            } else if (this.arr[i] > other.arr[j]) {
                temp[k++] = other.arr[j++];
            } else {
                temp[k++] = this.arr[i++];
                j++;
            }
        }
        while (i < n1) {
            temp[k++] = this.arr[i++];
        }
        while (j < n2) {
            temp[k++] = other.arr[j++];
        }

        Mixer result = new Mixer(k);
        for (int x = 0; x < k; x++) {
            result.arr[x] = temp[x];
        }
        return result;
    }

    public void display() {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(" }");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        Mixer m1 = new Mixer(n1);
        m1.accept();

        System.out.print("\nEnter size of second array: ");
        int n2 = sc.nextInt();
        Mixer m2 = new Mixer(n2);
        m2.accept();

        Mixer mergedMixer = m1.mix(m2);

        System.out.println("\n--- Results ---");
        System.out.print("Array 1: ");
        m1.display();
        System.out.print("Array 2: ");
        m2.display();
        System.out.print("Merged Array: ");
        mergedMixer.display();
    }
}