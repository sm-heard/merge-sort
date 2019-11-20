package edu.cnm.deepdive;

public class MergeSorter {

  public void sort(int[] data){

    sort(data, 0, data.length);

  }

  private void sort(int[] data, int from, int to){
    if (to-from<=1){
      return;
    }
    int midpoint = (from+to)/2;

    sort(data,from,midpoint);//sort left
    sort(data,midpoint,to);

    int[] merged = new int[to-from];
    int leftIndex = from;
    int rightIndex = midpoint;
    int mergedIndex = 0;

    while (leftIndex<midpoint && rightIndex<to){
      if (data[leftIndex]<=data[rightIndex]){
        merged[mergedIndex] = data[leftIndex];
        leftIndex++;

      }else{
        merged[mergedIndex] = data[rightIndex];
        rightIndex++;
      }
      mergedIndex++;
    }

    for (int i = leftIndex; i < midpoint; i++) {
      merged[mergedIndex] = data[i];
      mergedIndex++;
    }

    for (int i = rightIndex; i < to; i++) {
      merged[mergedIndex] = data[i];
      mergedIndex++;
    }

    System.arraycopy(merged,0,data,from,merged.length);
  }


}
