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
            int min = 100000;
            for(int i = 0; i< array.length; i++){
                if(min > array[i]) min = array[i];
            }
            System.out.println("Min : " + min);
        }
        void average(){
            int acumulator = 0;
            for(int i = 0; i< array.length; i++){
                acumulator += array[i];
            }
            int media = acumulator/array.length;
            System.out.println("Media : " + media);
        }
        void sumEven(){
            for(int i = 0; i< array.length; i++){
                if(i % 2 == 1){
                    if(i < array.length-2){
                        array[i] *= array[i+2];
                    }
                }
            }
            for(int i = 0; i< array.length; i++){
                System.out.println(array[i]);
            }
        }
    }
}