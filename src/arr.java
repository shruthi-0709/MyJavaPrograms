import java.util.Arrays;

public class arr {

    public static void main(String[] args){
//        int[] numbers = new int[5]; these 3 lines are old syntax
//        numbers[0] = 1;
//        numbers[1] = 2;
        int[] numbers = {2,6,9,8,7};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
