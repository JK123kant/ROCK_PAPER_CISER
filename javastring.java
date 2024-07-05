import java.util.Random;
import java.util.Scanner;

public class javastring {

    public static void main(String[] args) {
        int Rock = 0, Paper = 1, Ciser = 2, Yourflag = 0, Opponent = 0;
        Random random = new Random();
        int count = 0;
        System.out.println(
                "-----Enter You Choice-----\nNOTE THAT *For Win The Match Your Score Must be Higher then Opponent* ");
        do {
            System.out.println("Enter 0 for Rock\nEnter 1 for Paper \nEnter 2 for Ciser");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt(); // rock 0,paper 1,ciser 2
            int randomnumber = random.nextInt(2);
            System.out.println("Random number is");
            System.out.println(randomnumber);
            if (num > 2) {
                System.out.println("Please Enter Given Number");
            }
            if (randomnumber == Rock && num == 1) {
                Yourflag++;
                Opponent--;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else if (randomnumber == Rock && num == 2) {
                Yourflag--;
                Opponent++;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else if (randomnumber == Paper && num == 0) {
                Yourflag--;
                Opponent++;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else if (randomnumber == Paper && num == 2) {
                Yourflag++;
                Opponent--;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else if (randomnumber == Ciser && num == 0) {
                Yourflag++;
                Opponent--;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else if (randomnumber == Ciser && num == 1) {
                Yourflag--;
                Opponent++;
                System.out.println("You Point :" + Yourflag);
                System.out.println("Oppnent Point :" + Opponent);
            } else {
                System.out.println("Both Choose Same");
                continue;
            }
            count++;
        } while (count != 3);
        if (Yourflag > Opponent) {
            System.out.println("------Finally You Are The Winner------");
        } else if (Yourflag == Opponent) {
            System.out.println("------Match Draw------");
        } else {
            System.out.println("Opps!   Better Luck For Next Time");
        }
    }
}