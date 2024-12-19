package Lectures.Week2;

import java.util.Arrays;

public class assessment {
    public static void main(String[] args){
        String revature = "Revature";
        String temp ="";
        for(int i=0; i<revature.length(); i++){
            temp = revature.charAt(i)+temp;
        }
        System.out.println(temp);
        int array[] ={8,1,2,3,4,5,6,7};
        Arrays.sort(array);
        int first= -1000;
        int second=-1000;
        for(int i=0; i<array.length; i++){
            if(first<array[i]){
                second=first;
                first=array[i];
            }
            System.out.println("First="+first+" second="+second);
        }

    }
    
}
