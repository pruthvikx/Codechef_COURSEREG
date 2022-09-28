import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i=0;i<t;i++){
            int N = scan.nextInt();
            int M = scan.nextInt();
            int K = scan.nextInt();

            if (M >= (N + K)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}