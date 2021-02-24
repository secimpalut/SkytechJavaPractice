package FirstLesson;

import java.util.Scanner;

/*
Soru 9: patron çalışanlarına zam yapıyor %20 oranında,
eski maaşını giren çalışanın yeni massını gösteren program yazınız
 */
public class Question09 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your old salary:");
            double salary = scan.nextDouble();

            double new_salary = salary * 1.2;

            System.out.println("yeni maasınız: " + new_salary);

        }

    }
