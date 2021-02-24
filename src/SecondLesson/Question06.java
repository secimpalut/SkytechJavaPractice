package SecondLesson;

import java.util.Scanner;

/*
0 ile 100 arası puanlama
50 den dusuk ise D
50 ile 70 arası ise C
70  ie 85 arası ise B
daha yukarıs ise A
notlar 100 e kadar

kullanıcı dan not girisi alınacak

in : 80

output : B
 */
public class Question06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your not");
        int not = scan.nextInt();

        if (not>=0 && not <= 100) {

            if (not < 50) {
                System.out.println("D");
            }
            else if (not>50 && not < 70){
                System.out.println("C");
            }
            else if(not >=70 && not<85) {
                System.out.println("B");
            }
            else{
                System.out.println("A");
            }

        }else {

            System.out.println("Girdiginiz not gecerli degil");

        }

    }
}
