package networkflow;

public class avgodd {
    int write = 0;
    int sum = 0;
    public void find(int[]num){
        for(int i=0; i<num.length;i++){
            if(num[i] % 2 != 0){
                sum += num[i];
                write++;
            }
        }
        System.out.println(sum/write);
    }
}
