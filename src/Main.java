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
        Outer out = new Outer(tablou);
        out.display();
        Outer.Inner iner = out.new Inner();
    }
}
class Outer{
    int[] array;
    void display(){
        Inner iner = new Inner();
        iner.min();
        iner.average();
        iner.sumEven();
    }
    Outer(int[] arr){
        array = arr;
    }
    class Inner{
        void min(){
            for(int i = 0; i< array.length; i++){

            }
        }
        void average(){
            for(int i = 0; i< array.length; i++){

            }
        }
        void sumEven(){
            for(int i = 0; i< array.length; i++){

            }
        }
    }
}