import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array: ");
        Scanner n = new Scanner(System.in);
        int arr[n];
        for(int i=0;i<n;i++){
            Scanner arr[i] = new Scanner(System.in);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++)
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println("Sorting array---- ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
    }
}
