package slidingWindow;

import java.util.ArrayList;
import java.util.*;

public class SlidingWindow {

  public double[] findAverages(int K, int[] arr) {
    int backIndex  =0;
    double sum = 0;
    List<Double> result = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];

      if(i == K-1){
        result.add(Double.valueOf(sum/K));
      }

      if(i > K-1){
        sum -= arr[backIndex++];
        result.add(Double.valueOf(sum/K));
      }
    }

     int counter = 0;
      double [] result2 = new double[result.size()];

      for(double d : result){
        result2[counter++] = d;
      }

      return  result2;
  }

  public double[] findAveragesV2(int K, int[] arr){
    int startIndex  =0;
    double sum = Double.valueOf(0);

    double [] result = new double[(arr.length - K )+ 1];
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];

      if(i == K-1){
        result[counter++] = sum /K;
      }

      if(i > K-1){

        sum-= arr[startIndex++];
        result[counter++] = sum /K;
      }
    }
    return result;

  }

  public  int findMaxSumSubArray(int k, int[] arr) {
    int max = Integer.MIN_VALUE;
    int startIndex  = 0;
    int sum = 0;

    for(int i = 0 ; i < arr.length; i++){
      sum += arr[i];

      if(i == k-1){
        max = Math.max(max, sum);
      }

      if(i > k-1){
        sum -= arr[startIndex++];
        max = Math.max(max, sum);
      }
    }

    return max;

  }

  public int findMinSubArray(int S, int[] arr) {
    int sum = 0;
    int startIndex = 0;
    int min = Integer.MAX_VALUE;
    int count = Integer.MAX_VALUE;

    for(int i = 0; i < arr.length; i++){
      sum+= arr[i];
      if(sum >= S){
        min = Math.min(min, sum);
        int x = i - startIndex;
        count = Math.min(count,  x);
        sum-=arr[startIndex++];

      }

    }

    return  count;
  }
}
