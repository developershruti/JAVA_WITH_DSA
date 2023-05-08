public class solution {
    public static int getpivot(int nums[], int n){
         
        int s=0;
        int e=n-1;
        int mid = s+(e-s)/2;
        while(s<e){
            if(nums[mid]>=nums[0]){
                s=mid+1;
            }else{
                e = mid;
            }
              mid = s+(e-s)/2;
        }
            return s;
    }
    
public static int binarysearch(int[] nums, int s, int e, int target) {
       int n = nums.length-1;
         s=0;
         e = n-1;
            int mid = s+(e-s)/2;
        while(s<=e){

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            s= mid+1;
        }
        else if(nums[mid]>target){
            e=mid-1;
        }
       mid = s+(e-s)/2;
    }
    return-1;
        
}
public  static int search(int[] nums, int target) {
         int n = nums.length-1;
    int  pivot = getpivot(nums,n);
    if(target>=nums[pivot] && target<=nums[n-1]){
        return binarysearch(nums, pivot,n-1,target);
    }
    else{
        return binarysearch(nums,0,pivot-1,target);
    }
    
}

    public static void main(String[] args) {
        int nums[] = {4,5,6,0,1,2};
        int target = 0;
      
       System.out.println( search(nums, target));
       
    }
}
