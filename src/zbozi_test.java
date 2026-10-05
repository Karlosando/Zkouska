public class zbozi_test {
    public static void main(String[] args){
        Zbozi zbozi = new Zbozi(46278,"romadur",50);

        System.out.println(zbozi.getCode());
        System.out.println(zbozi.getName());
        System.out.println(zbozi.getCost());

        System.out.println(zbozi.mnozstvi(10));
    }
}
