package networkflow;

public class Main {
    public static void main(String[] args) {
        avgodd rv = new avgodd();
        PrintStars ps = new PrintStars();
        ps.printRightTriangle(10);
        int[] nums = {5, 1, 2, 3, 12};
        char ch = 'x';
        rv.find(nums);
        System.out.println(java.util.Arrays.toString(nums)); // Output: [l, e, o, t, c, e, d, e]

    }
}
