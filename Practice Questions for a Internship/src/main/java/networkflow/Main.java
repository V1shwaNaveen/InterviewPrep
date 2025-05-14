package networkflow;

public class Main {
    public static void main(String[] args) {
        RemoveCharactors rv = new RemoveCharactors();
        char[] s = {'a', 'b', 'x', 'c', 'x', 'd'};
        char ch = 'x';
        rv.remove(s,ch);
        System.out.println(java.util.Arrays.toString(s)); // Output: [l, e, o, t, c, e, d, e]
    }
}
