package ignore;

import java.util.Scanner;

class Mixer{
	int arr[];
	public Mixer(int size) {
		arr = new int[size];
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++) {
			while(true) {
				System.out.println("Enter element no.: "+(i+1));
			
			int val = sc.nextInt();
			if(i>0 && val<arr[i-1]) {
				System.out.println("Enter element bigger than: "+arr[i-1]);
				continue;
			}
			arr[i]=val;
			break;
		}
		}
	}


public Mixer mix(Mixer A) {
	int n1 = this.arr.length;
	int n2 = A.arr.length;
	int temp[] = new int[n1+n2];
	
	int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
        if (this.arr[i] < A.arr[j]) {
            temp[k++] = this.arr[i++];
        } else if (this.arr[i] > A.arr[j]) {
            temp[k++] = A.arr[j++];
        } else {
            temp[k++] = this.arr[i++];
            j++;
        }
    }
    while (i < n1) {
        temp[k++] = this.arr[i++];
    }
    while (j < n2) {
        temp[k++] = A.arr[j++];
    }
	
	Mixer result = new Mixer(k);
	for(int z =0;z<k;z++) {
		result.arr[z]= temp[z];
	}
	return result;
}
public void display() {
    System.out.print("{ ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println(" }");
}
}
public class mixer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number of elements in the first array: ");
	int n1 = sc.nextInt();
	Mixer m1 = new Mixer(n1);
	m1.accept();
	
	System.out.println("Please enter the number of elements in the second array: ");
	int n2 = sc.nextInt();
	Mixer m2 = new Mixer(n2);
	m2.accept();
	
	Mixer mergedArray = m1.mix(m2);
	System.out.println("\n--- Results ---");
    System.out.print("Array 1: ");
    m1.display();
    System.out.print("Array 2: ");
    m2.display();
    System.out.print("Merged Array: ");
    mergedArray.display();
}
}
