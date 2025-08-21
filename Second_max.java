 import  java.util.Scanner;

public class Second_max {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,34,56,32,12,10,98,109,65};
        int max2;

        int max1=max2=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];

            }
        }
        System.out.println("Maximum element is:"+max1);
        System.out.println("Second maximum element is:"+max2);

    }
    
}

    

