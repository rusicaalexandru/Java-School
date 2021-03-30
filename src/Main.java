import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Cite cifre va contine tabloul");
        Scanner in = new Scanner(System.in);
        int tablou[] = new int[in.nextInt()];
        System.out.println("Introduceti cifrele : ");
        for(int i = 0; i < tablou.length; i++){
            tablou[i] = in.nextInt();
        }
    }
}
