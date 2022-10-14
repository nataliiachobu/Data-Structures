import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimalPractice {
    public static void main(String[] args) {
        int[] array=new int[]{2,9,9,6,9,6,3,7};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 5)));
    }

  public static int[] twoSumOptimalSolution(int[] array, int target){

        for( int i=0; i<array.length; i++){
            for( int j=i+1; j<array.length; j++){
                if(array[i]+array[j]==target){
                    return new int[]{i,j};
                }
            }

        }

        return array;
  }

}
