class Solution {
    public int[] sortArray(int[] nums) {
        int N=nums.length;
        return mergeSort(nums,0,N-1); 
           
    }
    int[] mergeSort(int[]A,int l,int r){
        if(l==r) return A; 
        int m=(l+r)/2;
        mergeSort(A,l,m);
        mergeSort(A,m+1,r);
        return merge(A,l,m+1,r);
        
    }
    int[] merge(int[]A,int l,int y,int r){
        int i=l;int j=y;int k=0;
        int[] temp=new int[r-l+1];
        while(i<y&&j<=r){
            if(A[i]<A[j])
                temp[k++]=A[i++];
            else 
                temp[k++]=A[j++];
        }
        while(i<y){
            temp[k++]=A[i++];
        }
    
        while(j<=r)
            temp[k++]=A[j++];
        for(int p1=0;p1<temp.length;p1++){
            A[l+p1]=temp[p1];
        }
        
        return A;
    }
}