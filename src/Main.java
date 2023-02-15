import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        int left_products[]=new int[nums.length];
        int right_products[]= new int[nums.length];

        int answer [] = new int[nums.length];
        left_products[0]=1;
        right_products[nums.length-1]=1;

        for (int i = 1; i < nums.length ; i++) {
            left_products[i]=nums[i-1]*left_products[i-1];
        }

        for (int i = nums.length-2; i >=0; i--) {
            right_products[i]=nums[i+1]*right_products[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i]=left_products[i]*right_products[i];
        }


    }
}


