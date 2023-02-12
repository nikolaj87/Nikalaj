import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<ShipWar> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ShipWar myship = new ShipWar();
            for (int j = 0; j < 4; j++) {
//                myship.loc.add((int)(Math.random()*10));
//                  myship.setLoc((int)(Math.random()*10));
            }
            list.add(myship);
        }


//
//
//
//
//        ShipWar two = new ShipWar();
//        two.loc.add("5");
//        two.loc.add("6");
//        two.loc.add("7");
//
//        ShipWar three = new ShipWar();
//        three.loc.add("11");
//        three.loc.add("12");
//        three.loc.add("13");
//
//        list.add(one);
//        list.add(two);
//        list.add(three);

        for (ShipWar x : list) {

            for (int i = 0; i < x.loc.size(); i++) {

                System.out.print(x.loc.get(i));

            }
            System.out.println();
        }



//        list.add(10);
//        list.add(12);
//        list.add(0);
//        list.remove(2);
//        list.add(0);
//        System.out.println(list);

//        Integer bolean = list.get(0);
//        System.out.println(bolean);


//
//        System.out.println(list.size());
//        System.out.println(list.contains(0));
//        System.out.println(list.indexOf(10));

    }
}
