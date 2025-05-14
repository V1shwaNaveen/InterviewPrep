package networkflow;

public class Main {
    public static void main(String[] args) {
        MoveZeros rv = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        char ch = 'x';
        rv.move(nums);
        System.out.println(java.util.Arrays.toString(nums)); // Output: [l, e, o, t, c, e, d, e]
    }
}
