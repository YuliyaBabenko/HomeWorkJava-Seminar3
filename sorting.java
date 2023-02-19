import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] array = new int[] {5, 8, 13, 90, 14, 47, 28, 31, 10};

        arraySortMerge(array);
        System.out.printf(Arrays.toString(array));
    }

    private static int[] arraySortMerge(int[] array) {
        int[] tapeA = new int[array.length];
        int[] tapeB = new int[array.length];

        boolean isNotSorted = true;
        int index, indexA, indexB, endA, endB;
        int max_index = array.length;
        boolean state;

        while (isNotSorted){
            isNotSorted = false;

            state = true;
            indexA = 0;
            indexB = 0;
            endA = 0;
            endB = 0;
            tapeA[indexA++] = array[0];
            for (index = 1; index < max_index; index++) {
                if (array[index] < array[index - 1]) {
                    state = !state;
                    isNotSorted = true;
                }
                if (state) {
                    tapeA[indexA++] = array[index];
                    endA = indexA;
                } else {
                    tapeB[indexB++] = array[index];
                    endB = indexB;
                }
            }

            if (!isNotSorted) {
                return array;
            }

            indexA = 0;
            indexB = 0;
            for (index = 0; index < max_index; index++){
                if (indexA == endA){
                    array[index] = tapeB[indexB++];
                    continue;
                }
                if (indexB == endB){
                    array[index] = tapeA[indexA++];
                    continue;
                }
                if (tapeA[indexA] <= tapeB[indexB]){
                    array[index] = tapeA[indexA++];
                } else {
                    array[index] = tapeB[indexB++];
                }
            }
        }
        return array;
    }
}
