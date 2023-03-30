import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercise19_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        sort(arrayList);
        System.out.print("The sorted numbers are ");
        for(Integer i: arrayList) {
            System.out.print(i + " ");
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

}
