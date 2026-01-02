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
