public abstract class Mijloc_de_transport {
    String nume;
    int pret;
    public void nrRoti(){}
}
class Automobil extends Mijloc_de_transport{
    public void nrRoti(){
        System.out.println("4");
    }
}
class Motocicleta  extends Mijloc_de_transport{
    public void nrRoti(){
        System.out.println("4");
    }
}
class Camion  extends Mijloc_de_transport{
    public void nrRoti(){
        System.out.println("8");
    }
}
