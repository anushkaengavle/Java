import java.util.Scanner;

public class max {

    public static void findingmax(int[] list) {
        int n = list.length;
        int max = list[0];
        int max2 = 0;
        
        for (int i = 1; i < n; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (list[i] != max && list[i] > max2) {
                max2 = list[i];
            }
        }
        
        System.out.println("Max element is " + max);
        System.out.println("Second Max element is " + max2);
    }

    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");
        int count = scanner.nextInt();
        array = new int[count]; // Initialize the array with the specified size

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Element");
            array[i] = scanner.nextInt();
        }

        findingmax(array);
    }
}
