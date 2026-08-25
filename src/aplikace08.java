public class aplikace08 {
    public static void main(String[] args){

        aplikace08class auto1 = new aplikace08class("Karel","Peugeot",4007);
        aplikace08class auto2 = new aplikace08class("Václav","nisan", 67);


        auto1.ridi();
        auto2.ridi();

        System.out.println(auto1.model);
        System.out.println(auto2.model);

    }
}
