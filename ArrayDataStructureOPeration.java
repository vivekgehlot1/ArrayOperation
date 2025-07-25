
package com.mycompany.arraydatastructureoperation;

public class ArrayDataStructureOPeration {
    public static void main(String[] args) {
 int  array[]={10,20,30,40,50,60,80};
 int value=30;
//        for(int a:array){
//            System.out.println(a);
//        }

        ArrayOPeration ob =new ArrayOPeration(20);
        ob.Addlast(12);
        ob.Addlast(15);
        ob.Addlast(222);
        ob.AddFirst(44);
        ob.Addlast(3);
        ob.Addlast(33);
        ob.Addlast(24);
        ob.Addlast(30);
//        ob.RemoveLast();
//        ob.RemoveLast();
//        ob.RemoveFirst();
//        ob.AddFirst(11);
//        ob.AddIndex(22, 3);
//        ob.AddIndex(50, 2);
//        ob.Removefirst();
//        ob.RemoveIndex(1);
//ob.ViewFirst();
//ob.ViewLast();
//ob.ViewIndex(1);

//ob.UpdateFirst(50);
//ob.UpdateLast(100);
//ob.UpdateIndex(75, 2);
//ob.sortinAssendingOrder();

//        System.out.println("==========================");
//        ob.sortinAssendingOrder();
//        System.out.println("==========================");
//        ob.sortinDisAssendingOrder();
//        System.out.println("============================");
//        ob.linearSearch(30);
        System.out.println("==========================");
//        
//        ob.BinarySearch(arr,value);
           
//        ob.Mergelast(array);
//          ob.Mergefirstt(array);
//        ob.printarr();
//        System.out.println("==============================");
//        ob.replacelast(3, 30);
//        ob.printarr();
//        System.out.println("==============================");
//        ob.replaceFirst(33, 30);
//        ob.printarr();
        System.out.println("==============================");
        ob.Mergelast(array);
        ob.ViewAll();
        System.out.println("==============================");
        ob.mergfirst(array);
        ob.ViewAll();
        
        
        
    }
}
