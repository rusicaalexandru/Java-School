import java.util.ArrayList;
import java.util.Scanner;

public class Laborator1 {
    static Scanner in = new Scanner(System.in);

    public static void ex1() { // ready
        System.out.println("Exercitiu 1 :");
        System.out.print("Cite numere veti introduce? : ");
        int num = in.nextInt();
        int minimum = 999999999;
        for (int i = 0; i< num; i++){
            int input = in.nextInt();
            if (input < minimum){
                minimum = input;
            }
        }
        System.out.println("Numarul minim este " + minimum);
    }
    public static void ex2() { // ready
        System.out.print("Introduceti cifrele : ");
        ArrayList<Integer> example = new ArrayList<>();
        int input, temp = 0;
        do {
            input = in.nextInt();
            if (input == 0){
                break;
            }
            example.add(input);
            temp += input;
        }while (input != 0);
        System.out.println(example);
        System.out.println("Media aritmetica este : " + temp/example.size());
    }
    public static void ex3() {
        
    }
}
