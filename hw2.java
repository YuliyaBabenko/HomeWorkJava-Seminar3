import java.util.ArrayList;
import java.util.Random;

public class hw2 {
    public static void main(String[] args) {
        // 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(rand.nextInt(0,100));
        }

        for (int item: nums) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                nums.remove(i);
                i--;
            }
        }
        for (int item: nums) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
