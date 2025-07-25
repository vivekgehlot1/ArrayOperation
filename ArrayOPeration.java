
package com.mycompany.arraydatastructureoperation;

public class ArrayOPeration {
    private int arr[];
    private int currentposition=-1;
    int temp=0;
    int firstposition=0;
//    int lastposition=arr.length-1;
    public ArrayOPeration(int size){
        arr=new int[size];
    
    int first=0;
    int last=arr.length-1;
    }
    public boolean Addlast(int value){
        currentposition++;
        if(currentposition<=arr.length-1){
            arr[currentposition]=value;
            return true;  
        }
        return false;
        
    }
    public boolean AddFirst(int value){
        if( currentposition <= arr.length-1){
            currentposition++;
            for(int i=currentposition;i > 0;i--){
            arr[i]=arr[i-1];
            }
            arr[0]=value;
            return true;  
            
        }
        return false;
    }
     public boolean AddIndex(int value,int index){
        if( currentposition <= arr.length-1){
            currentposition++;
            for(int i=currentposition;i > index;i--){
            arr[i]=arr[i-1];
            }
            arr[index]=value;
            return true;  
            
        }
        return false;
    }
    public boolean RemoveLast(){
           
        if(currentposition<=arr.length-1){
            arr[currentposition]=0;
            currentposition--;
            
            return true;  
        }
        return false;
        
    }
    public boolean Removefirst(){
           
        if(currentposition<=arr.length-1){
            for(int i=0;i < currentposition;i++){
                arr[i]=arr[i+1];   
            }
            arr[currentposition]=0;
            currentposition--;
         
            return true;  
        }
        return false;
        
    }
    public boolean RemoveIndex(int index){
           
        if(currentposition<=arr.length-1){
            for(int i=index;i < currentposition;i++){
                arr[i]=arr[i+1];   
            }
            arr[currentposition]=0;
            currentposition--;
         
            return true;  
        }
        return false;
        
    }
    public void getFirst(){
        if(currentposition>=0){
        
        System.out.println(arr[0]+" in index : 0"); 
        }
    }
    public void getLast(){
        if(currentposition>=0){
        
        System.out.println(arr[currentposition]+" in index : "+(arr.length-1));
        }
    }
    public void getindex(int index){
        if(currentposition>=0){
        
        System.out.println(arr[index]+" in index : " +index); 
        }
    }
    public void ViewFirst(){
           
        if(0 <=currentposition){
            System.out.println(arr[0]);
        }   
    }
    public void ViewLast(){      
        if(0 <=currentposition){
            System.out.println(arr[currentposition]);
        }    
    }
    public void ViewIndex(int index){      
        if(0 <=currentposition){
            System.out.println(arr[index]);
        }    
    }
    public void ViewAll(){
    for (int i = 0; i <= currentposition; i++) {
            System.out.println(arr[i]);
            
        }
}
    public void UpdateFirst(int value){      
        if(0 <=currentposition){
            arr[0]=value;
            
        }    
    }
    public void UpdateLast(int value){      
        if(0 <=currentposition){
            arr[currentposition]=value;  
        }    
    }
    public void UpdateIndex(int value,int index){      
        if(0 <=currentposition){
            arr[index]=value;  
        }    
    }
    public boolean mergfirst(int newarr[]){
         int desirlength=newarr.length-1;
         int availablelength=(arr.length-currentposition+1);
         
         if(desirlength <= availablelength){
             
             for(int i=currentposition;i>=0;i--){
             arr[i+desirlength+1]=arr[i];
             
             currentposition +=desirlength;
         }
             for(int j=0;j <=desirlength;j++){
                 arr[j]=newarr[j];
             }
             return true;
     }else
         return false;
     }
    public int Mergelast(int array[]){
        int availablesize=(arr.length-currentposition+1);
        int newarr=array.length-1;
        int count =0;
        if(availablesize >=newarr){
           
           for(int i:array){
               currentposition++;
               arr[currentposition]=i;
               
           }
           return 1;
        }
       return -1;
    }
    public boolean MergeIndex(int index,int array[]){
        if( currentposition <= arr.length-1){
            currentposition++;
            for(int i=currentposition;i > 0;i--){
            arr[i]=arr[i-1];
            }
            arr[0]=0;
            return true;  
            
        }
        return false;
    }
    public void sortinAssendingOrder(){       
            for(int i=0;i <= currentposition;i++){
                for(int j=i;j <= currentposition;j++){
                   if(arr[i]>arr[j]){
                       temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                    }
                }
            }
            for (int i = 0; i <= currentposition; i++) {
                System.out.println(arr[i]);
        }
    }
    public void sortinDisAssendingOrder(){     
            for(int i=0;i < arr.length;i++){
                for(int j=i;j < arr.length;j++)
                if(arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
            
            for (int i = 0; i <= currentposition; i++) {
                System.out.println(arr[i]);
        }
        
    }  
    public int linearSearch(int value){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==value){
                System.out.println(value+" is index " +i );
                } 
            }
        return-1;
    }
    public int BinarySearch(int value){
        int first=0;
        int last=arr.length-1;
        int mid;
        while(first <= last){
           mid=((first+last)/2); 
 
        if(value ==arr[mid] ){
            System.out.println(value +" is present in index :"+arr[mid]);
        }
        else if(arr[mid] > value){
           return first=mid+1;
        }
        else if(arr[mid]<value){
            return last=mid-1;
        }
        else{
        
            System.out.println("value is not present in array");
        }

        }
        return -1;
    }
    public boolean replaceFirstocurence(int value,int newdata){
        if(0 <=currentposition){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==value){
                    arr[i]=newdata;
                }
                
                
            }
        }
        
        return true;
    }
    public boolean replacelastocurence(int value,int newdata){
        if(0 <=currentposition){
            for (int i = arr.length-1; i >=0; i--) {
                if(arr[i]==value){
                    arr[i]=newdata;
                }
                
                
            }
        }
        return true;
    }
    public boolean replaceAll(int value,int newdata){
        if(0 <=currentposition){
            for (int i = arr.length-1; i >=0; i--) {
                if(arr[i]==value){
                    arr[i]=newdata;
                }  
            }
        }
        return true;
    }
    
    }
