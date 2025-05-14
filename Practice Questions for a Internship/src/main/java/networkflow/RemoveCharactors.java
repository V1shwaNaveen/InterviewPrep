package networkflow;

public class RemoveCharactors {
    public void remove(char[] s, char ch) {
        int length = s.length;
        int write = 0;

        for (int i = 0; i<length; i++){
            if(s[i] != ch){
                 s[write] = s[i];
                 write++;
            }
        }
        while (write<length){
            s[write] = ' ';
            write++;
        }
    }
}