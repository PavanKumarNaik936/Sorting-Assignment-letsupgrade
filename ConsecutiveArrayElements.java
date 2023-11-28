class Solution
{
    boolean areConsecutives(long arr[], int N)
    {   double sum=0;
        long min=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        double ans=2*min+(N-1);
        double s=(N/2.0)*ans;
        
        if(s==sum)
            return true;
        else return false;

    }
}

