public class Array {

    public static void main(String[] args){
        int [] arr =new int[5];
        
        int[] input = {0,1,2,3,4};
        System.out.println(input.length);

        int[] input2 = {8,4,7,3,8,5};
        int n = 2;
        System.out.println(input2[n]);

        int[] input3 = {9,3,7,3,6};
        int c = 2;
        int val = 5;
        input3[c]=val;
        for (int number : input3) {
            System.out.print(number + " ");
        }

        int[] intArray = new int[3];
        System.out.println("Array Memory Address: "+ intArray);
    }
}