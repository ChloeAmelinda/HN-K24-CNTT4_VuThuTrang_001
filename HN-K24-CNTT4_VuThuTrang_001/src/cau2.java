import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu:");
        int n = sc.nextInt();

        if (n<=0){
            System.out.println("Loi so luong ko hop le");
            return;
        }

        LinkedList<Integer> number = new LinkedList<>();
        for (int i=1; i<= n ; i++){
            System.out.printf("Nhap phan tu thu %d :",i);
            int input = sc.nextInt();
            number.add(input);
        }

        for (int i : number){
            System.out.printf("%d\t" , i);
        }
        System.out.println();

        //luu number va so lan xuat hien
        Map<Integer , Integer> arr = new HashMap<>();
        //dem so lan xuat hien
        for (int i : number) {
            arr.put(i, arr.getOrDefault(i, 0) + 1);
        }

        //in
        arr.forEach((key, value) -> {
            System.out.println(key + ": " + value + " lan");
        });

    }
}
