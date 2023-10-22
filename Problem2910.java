public class Problem2910 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,1,1,2,2,3,1,3,2};
        System.out.println(minGroupsForValidAssignment(arr));
//        int a= 2;
//        int b= 3;
//        double c = (double)a/b;
//        int r = (int) Math.ceil(c);
//        System.out.println(r);
    }
    public static int minGroupsForValidAssignment(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            if(max<nums[i]){
                max= nums[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int min= Integer.MAX_VALUE;
        for(int i=0;i<count.length;i++){
            if(min>count[i] && count[i]!=0){
                min= count[i];
            }
        }
        // minimum group size can be min+1
        min++;
        int groups= 0;
        for (int a :count         ) {
            System.out.print(a+"");
        }
        System.out.println();

        for(int i=0;i<count.length;i++){
            groups += (int)Math.ceil((double)count[i]/min);
        }
        return groups;
    }
}
