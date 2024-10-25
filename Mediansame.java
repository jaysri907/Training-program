package Apexon;

public class Mediansame
{
    // Function to find the median of two sorted arrays of equal size
    public static double findmedian(int[] num1, int[] num2)
    {

        int i=0;
        int j=0;
        int n1= num1.length;
        int n2= num2.length;
        int n=n1+n2;
        int indx1 = n/2;
        int indx2 = indx1-1;
        int indx1Val=-1;
        int indx2Val=-1;
        int count=0;
        while(i<n1 && j<n2){
            if(num1[i]<num2[j]) {
                if(count==indx1) indx1Val=num1[i];
                if(count==indx2) indx2Val=num1[i];
                count++;
                i++;
            }
            else{
                if(count==indx1) indx1Val=num2[j];
                if(count==indx2) indx2Val=num2[j];
                count++;
                j++;
            }
        }
        while(i<n1){
            if(count==indx1) indx1Val=num1[i];
            if(count==indx2) indx2Val=num2[i];
            count++;
            i++;
        }
        while(j<n2){
            if(count==indx1) indx1Val=num2[j];
            if(count==indx2) indx2Val=num2[j];
            count++;
            j++;
        }
        if(n%2==1){
            return (double) indx1Val;
        }
        else{
            return (double) (indx1Val+indx2Val)/2;
        }


    }
    public static void main(String[] args)
    {
        int[] nums1={2,3,5,8};
        int[] nums2={10,12,14,16,18,20};
        System.out.println(findmedian(nums1, nums2));
    }
}



