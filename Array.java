import java.util.Arrays;

public class Array{

    public static void main(String args[]){

        int[] arrayName = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arrayName));


        // Used when know the size already
        int[] arrayNo = new int[5];

        arrayNo[0] = 10;
        arrayNo[1] = 20;
        arrayNo[2] = 30;
        arrayNo[3] = 40;
        arrayNo[4] = 50;

        System.out.println(Arrays.toString(arrayNo));
    }
}