import java.util.*;

public class Main {
    public  static int getValue(int[] gifts, int n) {
        // write code here
        //冒泡排序 n-1趟
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(gifts[j]>gifts[j+1]){
                    swap(gifts,j,j+1);
                }
            }
        }
        int a=gifts[n/2];
        int count=0;
        for(int i=0;i<n/2;i++){
            if ((gifts[i]==a)){
                count++;
            }
        }
        for(int i=n/2;i<n;i++){
            if ((gifts[i]==a)){
                count++;
            }
        }
        if(count>n/2){
            return a;
        }
        return 0;
    }

    private static void swap(int[] gifts, int i, int j) {
        int temp=gifts[i];
        gifts[i]=gifts[j];
        gifts[j]=temp;
    }
}