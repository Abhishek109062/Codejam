import java.util.Arrays;
import java.util.Scanner;

public class d1000000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=1;x<=t;x++){
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int y=0;y<n;y++)
                ar[y]=sc.nextInt();

            Arrays.sort(ar);
            int count=1;
            for(int y=1;y<=n;y++){
                if(ar[y-1]>=count){
                    count++;
                }
            }
            System.out.print("Case #"+x+": ");
            System.out.println(count-1);
        }
    }
}
