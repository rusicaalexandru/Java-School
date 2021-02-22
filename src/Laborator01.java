import java.util.Scanner;

public class Laborator01 {
    static Scanner scan = new Scanner(System.in);
    public static void ora(){
        System.out.print("Introduceti ora : ");
        int hour = scan.nextInt();
        if (hour < 10){
            System.out.print("Buna dimeneata!");
        } else if (hour > 10 && hour < 16){
            System.out.print("Buna ziua!");
        } else if(hour > 16 && hour < 20){
            System.out.print("Buna Seara!");
        } else {
            System.out.print("Este prea tirziu vreau sa dorm -_-");
        }
    }
    public static void categorVirste(){
        System.out.print("Introduceti virsta : ");
        int age = scan.nextInt();
        //copil adolescent adult   virstnic
        //0-15  16-29      30-40   50...
        if (age < 16){
            System.out.print("Copil");
        } else if(age >= 16 && age < 30){
            System.out.print("Adolescent");
        } else if(age >= 30 && age < 40){
            System.out.print("Adult");
        } else if(age >= 40){
            System.out.println("Virstnic");
        } else {
            System.out.println("wtf did you do?");
        }
    }
    //public static void
}
