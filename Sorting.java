import java.util.Arrays;
public class Sorting 
{   
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,1,2,1,2,1,0,0,0} ;
        System.out.println("before"+ Arrays.toString(arr));
        Sorting obj = new Sorting();
        obj.sort012(arr);
        System.out.println("After" + Arrays.toString(arr));
    }

    public void sort012(int[] arr)
    {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high)
        {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid] ;
                    arr[mid] = temp;
                    low++;
                    mid++;                    
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }               
            }
        }
    }
}
//  Used three pointers (low, mid, high) to partition the array into three zones, moving 0s to the start, 2s to the end, and leaving 1s in the middle.

//  Achieved an O(N) time complexity by scanning the array in a single pass and O(1) space complexity by swapping elements in-place.

//  When swapping a 2 from the mid to the high position, the mid pointer is not incremented immediately to ensure the newly swapped element is evaluated.