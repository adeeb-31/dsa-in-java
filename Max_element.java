import  java.util.Scanner;
public class Max_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,34,56,32,12,10,98,109,65};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element is:"+max);

    }
    
}
