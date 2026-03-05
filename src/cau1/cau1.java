package cau1;

import java.util.*;

public class cau1 {
    static void main(String[] args) {
        // tong tien chi tieu
        double total = 0;
        //muc chi tieu trung binh moi ngay
        double avg = 0 ;
        //so ngay vuot qua chi tieu
        int count = 0 ;

        List<Double> day = new ArrayList<>() ;
        //nhap so ngay chi tieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay chi tieu :");
        int totalDay = sc.nextInt();

        if (totalDay <= 0) {
            System.out.println("ko hop le");
            return;
        }

        for (int i = 1; i <= totalDay; i++) {
            System.out.println("Ngay "+i +  " chi tieu :");
            double money = sc.nextDouble();
            day.add(money);
        }

        //tong chi tieu
        for (double d : day) {
            total += d;
        }

        // trung binh
        avg = total / totalDay;

        System.out.printf("Tong chi tieu: %.2f\n" , total);
        System.out.printf("Trung binh moi ngay: %.2f \n" , avg);

        double max = day.get(0);
        double min = day.get(0);

        int maxDay = 1;
        int minDay = 1;

        for (int i = 0; i < day.size(); i++) {
            if (day.get(i) > max) {
                max = day.get(i);
                maxDay = i + 1;
            }

            if (day.get(i) < min) {
                min = day.get(i);
                minDay = i + 1;
            }
        }

        System.out.printf("chi tieu nhieu nhat : %.2f (ngay :%d) \n",max,maxDay);

        System.out.printf("chi tieu it nhat : %.2f (ngay : %d) \n",min,minDay);


        for (int i = 0 ; i< day.size(); i++){
            if( avg < day.get(i)){
                count++;
            }
        }
        System.out.println("So ngay vuot trung binh :" +count);

    }
}
