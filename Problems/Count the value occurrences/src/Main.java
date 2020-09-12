import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int c1 = 0, c2 = 0;
        for (int i = 0;i < list1.size(); i++) {
            if (list1.get(i) == elem) {
                c1++;
            }
        }
        for (int i = 0;i < list2.size(); i++) {
            if (list2.get(i) == elem) {
                c2++;
            }
        }
        if (c1 == c2) {
            return true;
        }
        return false;
    }
}