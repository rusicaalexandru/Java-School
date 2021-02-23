import java.sql.Array;
import java.util.*;

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
    public static void ex3() { // ready
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
    public static void ex4() { // ready
        System.out.print("Introduceti numarul componentelor : ");
        int arrNum = in.nextInt();
        int[] arr = new int[arrNum];
        for (int i = 0; i < arrNum; i++){ // introducerea datelor
            System.out.print("Introduceti elementul : ");
            arr[i] = in.nextInt();
        }
        for (int element : arr)
        {
            System.out.print(element + " ");
        }
        Arrays.sort(arr);
        System.out.print("\n" + arr[arr.length - 2]  + "/" + arr[arr.length - 1]);
    }
    public static void ex5() {// not ready
        
    }
}

