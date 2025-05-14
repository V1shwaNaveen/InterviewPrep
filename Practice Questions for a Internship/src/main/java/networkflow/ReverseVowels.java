package networkflow;

public class ReverseVowels {
    public void reverseVowels(char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left<right){
            while (left<right && !isVowel(s[left])){
                left++;
            }
            while (left<right && !isVowel(s[right])){
                right--;
            }

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
