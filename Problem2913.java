import java.util.ArrayList;
import java.util.List;

public class Problem2913 {
    public static void main(String[] args) {
        // not solved
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        //arr.add(2);
        arr.add(2);
        arr.add(5);
        arr.add(5);
        System.out.println(sumCounts(arr));
    }
    public static int sumCounts(List<Integer> nums) {
        int n= nums.size();//2
        int ans = 0;
        for(int s=0;s<n;s++){
            for (int i=s;i<n;i++){
                List<Integer> arrList1 = new ArrayList<Integer>();
                for(int j=i;j<n;j++){
                    arrList1.add(nums.get(j));
                }
                System.out.println(arrList1);
                int res = 1;
                int m= arrList1.size();
                for(int j=1;j<m;j++){
                    int k=0;
                    for(k=0;k<j;k++){
                        if(arrList1.get(j)== arrList1.get(k))
                            break;
                    }
                    if(j==k)
                        res++;
                }
                ans += (res*res);
                System.out.println(ans);
            }
        }
        return ans;
    }
}
