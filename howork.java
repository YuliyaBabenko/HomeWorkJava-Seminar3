import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class howork {
    public static void main(String[] args) {
        // 1. Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее арифметическое из этого списка.

        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(rand.nextInt(0,100));
        }

        for (int item: nums) {
            System.out.print(item + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);    
        }
        System.out.print(sum);
        System.out.println();

        int average = sum/nums.size();
        System.out.println("Среднее арифметическое списка" + " " + "-" + " " + average);
        System.out.println("Максимальный элемент списка" + " " + "-" + " " + Collections.max(nums));
        System.out.println("Минимальный элемент списка" + " " + "-" + " " + Collections.min(nums));
    }

}