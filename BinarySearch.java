
package com.mycompany.arraydatastructureoperation;


public class BinarySearch {
        static int mid;
        public int binarySearch(int arr[],int value){
        int first=0;
        int last=arr.length-1;
        
        while(first <= last){
           mid=((first+last)/2); 
 
        if(value ==arr[mid] ){
            return mid;
        }
        else if(arr[mid] > value){
           return first=mid+1;
        }
        else if(arr[mid]<value){
            return last=mid-1;
        }
        
        }
        return -1;
    }
        public static void main(String[] args) {
         int  arr[]={10,20,30,40,50,60,80};
         int value=30;
         if(arr[mid]==value){
             System.out.println("");
         }
         else{
        
            System.out.println("value is not present in array");
        }

    }
}
