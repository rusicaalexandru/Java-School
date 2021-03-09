import java.util.Scanner;

public class Laborator_Proba_evaluare_nr1 {
    private static int calculateSum(int num){ // calculeaza suma cifei
        int temp, sum = 0;
        while(num > 0)
        {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        //System.out.println("Suma cifrei :" + sum);
        return sum;
    }
    //-------------------------------------------------------------------------------------------
    static Scanner in = new Scanner(System.in);
    public static void ex1(){
        int x, a=6,b=7;
        x=a++ + b++;
        //raspunsul va fi  : C. х=13, а=7, b=8
        /*
        deoarece :
        *   variabilei x i se atribuie variabilele initiale a,b
        *   dupa utilizarea acestei atribuiri a,b ramin cu valori modificate
        *   in urma incrementarii
        */
    }
    //-------------------------------------------------------------------------------------------
    public static void ex2(){
        int x=4;
        System.out.println("valoarea este "+((x > 4) ? 99.99:9));
        System.out.println("Raspunsul: C. Output-ul este: valoarea este 9.0");
        //pentru a primi alt rezultat este nevoie de schimbat operatorul > pe >=
        /*  Sau de schimbat x pe o valoare mai mare
        *   (x>4) se verifica afirmatia, daca este corect va fi afishat 99.99
        *   daca va fi falsa va fi afishat 9
        *   : este in loc de else
        */
    }
    //-------------------------------------------------------------------------------------------
    public static void ex3(){
        int num1, num2;
        System.out.println("Introduceti nr1 :");
        num1 = in.nextInt();
        System.out.println("Introduceti nr2 :");
        num2 = in.nextInt();

        if(calculateSum(num1) == calculateSum(num2)){
            System.out.println("Suma numerelor coencid");
        } else {
            System.out.println("Suma numerelor nu coencid");
        }
    }
    //-------------------------------------------------------------------------------------------
    public static void ex4(){
        //cîte 2 atribute și 2 metode
        class Transport{
            int nivelSecuritate;
            int popularitate;
        }
        class Automobil extends Transport{
            String denumire;
            int lungime;
        }
        class Roata extends Automobil{
            int dimensiuni;
            int rezistenta;
        }
        class Shofer extends Automobil{
            String nume;
            String prenume;
        }
    }
    //-------------------------------------------------------------------------------------------
    public static void ex5(){
        class Student{
            String nume;
            int age;
            int nr_matricola;
            int media;
            Student(String _nume, int _age,int _nr_matricola, int _media){
                nume = _nume;
                age = _age;
                nr_matricola = _nr_matricola;
                media = _media;
            }
            protected void sayHi(){
                System.out.println()
            }
        }
    }
}
