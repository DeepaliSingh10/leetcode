
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                arr.remove(arr.size() - 1);
            }
            else if (op.equals("D")) {
                int num = arr.get(arr.size() - 1) * 2;
                arr.add(num);
            }
            else if (op.equals("+")) {
                int n = arr.size();
                arr.add(arr.get(n - 1) + arr.get(n - 2));
            }
            else {
                arr.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : arr) {
            sum += score;
        }

        return sum;
    }
}
