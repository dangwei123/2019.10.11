1.
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/plus-one
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int[] plusOne(int[] digits) {
        int count=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){
                count++;
            }
        }
        int[] arr1=new int[digits.length+1];
        int[] arr2=new int[digits.length];
        if(count==digits.length){
            arr1[0]=1;
            for(int i=1;i<digits.length+1;i++){
                arr1[i]=0;
            }
            return arr1;
        }else{
            int i=digits.length-1;
            int flag=1;
           while(i>=0){
                if(flag==1){
                    digits[i]+=1;
                }if(digits[i]==10){
                    arr2[i]=0;
                    flag=1;
                }else{
                    arr2[i]=digits[i];
                    flag=0;
                }
               i--;
            }
        }
        return arr2;
    }
}

2.
在一根无限长的数轴上，你站在0的位置。终点在target的位置。

每次你可以选择向左或向右移动。第 n 次移动（从 1 开始），可以走 n 步。

返回到达终点需要的最小移动次数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reach-a-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int reachNumber(int target) {
        if(target<0){
            target=-target;
        }
        int count=0;
        int i=0;
        int sum=0;
        while(sum<target){
             i++;
            sum+=i;
        }
        int tmp=sum-target;
        if(tmp%2==0){
            return i;
        }else{
            if(i%2==0){
                return i+1;
            }else{
                return i+2;
            }
        }
    }
}

3.
给你两个数组，arr1 和 arr2，

arr2 中的元素各不相同
arr2 中的每个元素都出现在 arr1 中
对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/relative-sort-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] arr=new int[1001];
        int[] res=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr[arr1[i]]++;
        }
        int a=0;
        for(int i=0;i<arr2.length;i++){
            while(arr[arr2[i]]>0){
            res[a++]=arr2[i];
            arr[arr2[i]]--;
            }
         
        }
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                res[a++]=i;
                arr[i]--;
            }
        }
        return res;
    }
}

4.
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x!=0){
            int tmp=x%10;
            if(sum>Integer.MAX_VALUE/10||(sum==Integer.MAX_VALUE/10&&tmp%10>7)){
                return 0;
            } if(sum<Integer.MIN_VALUE/10||(sum==Integer.MIN_VALUE/10&&tmp%10<-8)){
                return 0;
            }
            sum=sum*10+tmp;
            x/=10;
        }
         return sum;
    }
}