package edu.cnm.deepdive;

public class compareSwap {

  public static void xorSwap(){
    int a = 13;
    int b = 7;

    a ^= b;
    b ^= a;
    a ^= b;
  }

  public static void tempSwap(){
    int a = 13;
    int b = 7;
    int temp;

    temp = a;
    a = b;
    b = temp;
  }

  public static void main(String[] args) {

    long start = System.nanoTime();
    for (int i = 0; i <1000000 ; i++) {
    xorSwap();
    }
    long end = System.nanoTime();
    System.out.println((end - start));



    long start1 = System.nanoTime();
    for (int i = 0; i <1000000 ; i++) {
    tempSwap();
    }
    long end1 = System.nanoTime();
    System.out.println((end1 - start1));


  }
}