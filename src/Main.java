import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How man transports");
        int n = in.nextInt();
        Mijloc_de_transport[] transport = new Mijloc_de_transport[n];
        int transportType;
        for(int i = 0; i < n; i++){
            System.out.println("Introduceti tipul transportului");
            System.out.println("1 : Automobil");
            System.out.println("2 : Camion");
            System.out.println("3 : Motocicleta");

            transportType = in.nextByte();
            if(transportType == 1){
                transport[i] = new Automobil();
                System.out.println("Denumirea Automobil : ");
                transport[i].nume = in.next();
            } else if(transportType == 2){
                transport[i] = new Camion();
                System.out.println("Denumirea Camionului : ");
                transport[i].nume = in.next();
            } else if(transportType == 3){
                transport[i] = new Motocicleta();
                System.out.println("Denumirea Motocicletei : ");
                transport[i].nume = in.next();
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(transport[i].nume + " nr de roti : ");
            transport[i].nrRoti();
        }
    }
}
