import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //int[] marks={99,98,78,56,78,90,7,3,45,34,6,7,100};
        // for(int i=0;i<14;i++){
        //     if(i%2==0){
        //         System.out.println(marks[i]);
        //     }


        /* 
        int element= 90;
        int i=0;
        for(;i<14;i++){
            if(element == marks[i]){
                System.out.println(i);
                break;
            }
        }
        if(i==14){
            System.out.println(-1);
        }
      */
        


      /*
       in arrary for length no () needed
        System.out.println(marks.length);
       
     
       String[] names={"jiya","hasti","kritika","gandulog"};
        System.out.println(names.length);
       */


    /*
        int sum=0;

       for(int i=0;i<marks.length;i++){
        sum=sum+marks[i];
       
       }
       System.out.println(sum);
         
        
     */


     /* how to take an input form array

     
      Scanner s = new Scanner(System.in);
       int[] arr = new int[10];

       for(int i=0;i<arr.length;i++){
        arr[i]= s.nextInt();

       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       
      */

/* 
    CODE FOR DUPLICATES

       int array[]={1,2,9,3,4,5,6,5,4,7,8,8,9};
       int n= array.length;
      
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(array[i]==array[j])
            System.out.println(array[i]);
           
        }
       }
     */
        
     int sum=15;
     int arr[]={2,3,5,6,10,16,0,7,15,22};
     for(int i=0;i<arr.length;i++){
        int diff = sum - arr[i];
        for(int j=i+1; j<arr.length;j++){
            if(arr[j]==diff){
                System.out.println("yes");
                break;
            }
        }
     }


    }
}

