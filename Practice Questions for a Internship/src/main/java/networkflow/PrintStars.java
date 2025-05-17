package networkflow;

public class PrintStars {
    int count = 0;
    String star = "*";


    public void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
