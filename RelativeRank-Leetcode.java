import java.util.*;
class Main{
    public static void main(String [] args){
        int score[] = {10,3,8,9,4};
        String [] ans = RelativeRank(score);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] RelativeRank(int [] nums){
        PriorityQueue<Integer> rank = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : nums){
            rank.add(val);
            System.out.println(val);
        }
        String output[] = new String [nums.length];
        int n = rank.size();
        for(int i = 0 ; i<n ;i++){
            int rankof= rank.poll();
            for(int j =0;j<nums.length;j++){
                if(nums[j] == rankof){
                    if(i == 0) output[j] ="Gold";
                    else if(i == 1) output[j] ="Silver";
                    else if(i == 2) output[j] ="Bronze";
                    else{
                        output[j]  = String.format("%s", i+1);
                    }
                }
            }
        }
        return output;
    }
}
