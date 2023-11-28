public class KthSmallestElement {
    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int kthsmallest(final int[] A, int B) {
            int min=A[0];
            int max=A[0];
            for(int i=0;i<A.length;i++){
                if(A[i]<min)
                    min=A[i];
                if(A[i]>max)
                    max=A[i];
            }
            int l=min;
            int r=max;
            while(l<r){
                int mid=(l+r)/2;
                if(count(A,mid)<B)
                    l=mid+1;
                else r=mid;
                
            }
            return l;
        }
        int count(int[]A,int x){
            int c=0;
            for(int i=0;i<A.length;i++){
                if(A[i]<=x)
                    c++;
            }
            return c;
        }
    }
    
}
