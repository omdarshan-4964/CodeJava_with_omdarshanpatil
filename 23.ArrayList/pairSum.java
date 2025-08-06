
import java.util.ArrayList;

// Two-Pointer Approach
public class pairSum {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if( sum == target) {
                return true;
            }

            if(sum < target) {
                lp++; 
            } else {
                rp--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if(sum == target) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 40;
        int target2 = 4;

        System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target2));

    }
}