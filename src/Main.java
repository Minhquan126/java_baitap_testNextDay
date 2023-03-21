import rickkei_academy.NextDayCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay :");
        int day = input.nextInt();
        System.out.println("Nhap thang :");
        int month = input.nextInt();
        System.out.println("Nhap nam :");
        int year = input.nextInt();
        System.out.println(" Ngay tiep theo la :");
        System.out.println(NextDayCalculator.nextDay(day,month,year));
    }
}