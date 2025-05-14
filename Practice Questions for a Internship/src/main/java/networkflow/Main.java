package networkflow;

public class Main {
    public static void main(String[] args) {
        MoveSpaces rv = new MoveSpaces();
        char[] s = {'h', 'e', ' ', 'l', 'l', ' ', 'o'};
        rv.move(s);
        System.out.println(java.util.Arrays.toString(s)); // Output: [l, e, o, t, c, e, d, e]
    }
}
