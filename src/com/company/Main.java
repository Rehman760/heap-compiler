package com.company;


public class Main {
    public static int HeapySize=0;
    public static int[]a=new int[100];
    public static void minHeapipy(int[] a, int i){
        int l=Left(i);
        int r=Right(i);
        int min=0;
        if(l<=HeapySize&& a[l]<a[i])
            min=l;
        else min=i;
        if(r<=HeapySize&& a[r]<a[min])
            min =r;
        if(min!=i){
            swap(a,i,min);
            minHeapipy(a,min);
        }
    }
    static int Left(int i){
        return 2*i;
    }
    static int Right(int i){
        return (2*i)+1;
    }
    static void HeapyInsert(int a[], int value){
        if(a.length<HeapySize){
            a[HeapySize++]=value;
        }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void PrintHeap(int a[]){
        for (int i=0;i<HeapySize;i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
	// write your code here
        int arr[]={1,2,7,3,2,9};
        for (int i: arr) {
            HeapyInsert(arr,i);
        }
        PrintHeap(arr);

    }
}
