1.
给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
class Solution {
    public boolean judgeSquareSum(int c) {
        int sum=0;
        int i=0;
        int j=(int)Math.pow(c,0.5);
        while(i<=j){
            sum=i*i+j*j;
            if(sum<c){
                i++;
            }else if(sum>c){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}

2.
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr={0,0};
        for(int i=0;i<nums.length;i++){
            int j=0;
            for(j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
            if(j!=nums.length){
                break;
            }
        }
         return arr;
    }
}

3.
编写一个程序判断给定的数是否为丑数。

丑数就是只包含质因数 2, 3, 5 的正整数。
class Solution {
    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
       while(num%5==0){
           num/=5;
       }
        while(num%3==0){
           num/=3;
       }
        while(num%2==0){
           num/=2;
       }
        return num==1;
    }
}
