public class prob1
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int count = 0;
        int max = 0;

        for(int num : nums){
            if (num ==1){
                count++;
            }else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }

        }
        if (count > max){
            max = count;
        }
        return max;
        // int[] nums = [1,0,1,1,0,1];

    }
    public static void main(String[] args)
    {
        int[] testArray = {1, 1, 0, 1, 1, 1}; 
        prob1 solver = new prob1();
        int result = solver.findMaxConsecutiveOnes(testArray);
        System.out.println(result);
        
    } 
   
    
}