package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Search {

  int binarySearch(int[] arr, int needle){
    int lowIndex = 0;
    int highIndex = arr.length;

    while (highIndex>lowIndex+1){
     int mid = highIndex+lowIndex/2;

     if (arr[mid] == needle){
       return mid;
     }
     if (arr[mid]<needle){
       lowIndex = mid;
     } else{
       highIndex = mid;
     }
    }
    return (arr[lowIndex]==needle)?lowIndex:-1;
  }

  int linearSearch(int[] arr,int needle){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==needle){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    Search search = new Search();
    Random rand = new Random();
    int arrSize = 1000;
    //int[] needle = new int[343];
    double start;
    double end;
    int index;

    int[] arr = new int[arrSize];
    for (int i = 0; i < arr.length; i++) {
      int randInt = rand.nextInt(arrSize);
      arr[i] = randInt;
    }

    int[] needle = new int[arrSize];
    for (int i = 0; i < needle.length; i++) {
      int randInt = rand.nextInt(arrSize);
      needle[i] = randInt;
    }

    start = System.nanoTime();
    for (int target : needle) {
    Arrays.sort(arr);
    index = search.linearSearch(arr, target);
  }

    end = System.nanoTime();
    System.out.println("Time: "+(end-start));
//    if (index==-1){
//      System.out.println("Number no exist");
//    } else {
//      System.out.println("Number at index"+index);
//    }
  }
}
