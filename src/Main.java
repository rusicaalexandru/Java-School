public class Main {
    public static void punctuA(){
        String str = "abecedar abc defg zxy space libe";
        int pozitiaCaracterului = 3;
        char caracterul = 'c';
        System.out.println(str.indexOf(caracterul));
        System.out.println(str.charAt(pozitiaCaracterului));
    }
    public static void punctuB(){
        //Case sens
        String s1Case = "Space";
        String s2Case = "space";
        if(s1Case == s2Case){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        //Non case sens
        String str1 = new String("Space");
        String str2 = new String("space");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
    public static void punctuC(){
        String sir = "i will fl in to the space";
        String subSir = "space";
        if (sir.contains(subSir)) System.out.println(true);
    }
    public static void punctuD(){
        String sir = "abecedar carte masina lapte soare";
        String subSir = "carte";
        System.out.println(sir.indexOf(subSir));
    }
    public static void punctuE(){
        //wuuut?
    }
    public static void punctuF(){
        String fraza = "Spacing space at the edge of the empire after new suset at the cliff";
        int nr_de_cuvinte = 0;
        for (int i = 0; i < fraza.length(); i++) {
            if(fraza.charAt(i) == ' ' || fraza.charAt(i) == '-'){
                nr_de_cuvinte++;
            }
        }
        System.out.println(nr_de_cuvinte + 1);
    }
    public static void main(String args[]){
        punctuF();
    }
}
