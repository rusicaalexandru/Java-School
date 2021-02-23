import java.util.ArrayList;
import java.util.Scanner;

public class Laborator1 {
    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
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
        //Se citește un număr natural cu 5 cifre. Afișați numpărul format după
        //eliminarea cifrei din mijloc


        ArrayList<Integer> example = new ArrayList<>();
        System.out.print("Introduceti o cifra de lungimea 5 :" );
        String num = in.nextLine();
        if(num.length() == 5 && isNumeric(num)){
            char[] ch = new char[num.length()];
            for (int i = 0; i < num.length(); i++) {
                ch[i] = num.charAt(i);
            }
            for(int i = 0; i < num.length(); i++){
                if (!(i == num.length()/2)){
                    System.out.print(ch[i]);
                }
            }
        } else {
            System.out.println("You must insert 5 digit number!");
        }

    }
}
