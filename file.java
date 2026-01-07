This is my Second commit......!
public class SpiralPatternExample2 {
 

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Calculate and print the values for pattern
                System.out.print((Math.max(Math.abs(i - n), Math.abs(j - n)) + 1) + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();
        printPattern(n);
    }
}
This is my second commit.......!

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();

        // Function calling
        printPattern(n);
    }
}
