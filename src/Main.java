import hashset.HashSetCustom;

public class Main {
    public static void main(String[] args) {
        HashSetCustom<Integer> set = new HashSetCustom<Integer>();
        set.add(3);
        set.add(3);
        set.add(6);
        set.add(7);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
