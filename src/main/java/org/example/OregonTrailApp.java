package org.example;

public class OregonTrailApp {

    public static void main(String[] args) {

        Traveler dwene = new Traveler("Dwene", 100, 100);

        System.out.println("before hunting food" + dwene.getFood());
        System.out.println(dwene.hunt());

        System.out.println("after hunting food" + dwene.getFood());

        //dwene is hunting
        System.out.println(dwene.hunt());

        //dwene finally gets to eat
        System.out.println(dwene.eat());

        //hopefully dwene gets to his food
        System.out.println(dwene.getFood());


        Traveler eric = new Traveler("Eric", 80, 100);
        System.out.println(eric.getFood());


        Wagon ourWagon = new Wagon(5);

        System.out.println("Passengers: " + ourWagon.getPassengers().size());
//lets put dwene in the wagon!
        System.out.println(ourWagon.join(dwene));
  //lets ask, how many passengers will fit? passenger list and number/size
        System.out.println(ourWagon.getPassengers().size());
    }
}
