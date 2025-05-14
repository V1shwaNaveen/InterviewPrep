package networkflow;

public class MoveSpaces {
    public void move(char[] s) {
        int write = 0;

        // First pass: move all non-space characters to the front
        for (int i = 0; i < s.length; i++) {
            if (s[i] != ' ') {
                s[write] = s[i];
                write++;
            }
        }

        // Second pass: fill the rest with spaces
        while (write < s.length) {
            s[write] = ' ';
            write++;
        }
    }
}
