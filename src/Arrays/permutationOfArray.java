package Arrays;

import java.util.ArrayList;
import java.util.List;

public class permutationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        List<List<Integer>> list = permute(arr);
        System.out.println(list);
    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), arr);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] arr) {
        if (tempList.size() == arr.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!tempList.contains(arr[i])) {  // element already exists, skip
                    tempList.add(arr[i]);
                    backtrack(list, tempList, arr);
                    tempList.remove(tempList.size() - 1);   //Backtrack / Recover list
                }
            }
        }
    }


}
