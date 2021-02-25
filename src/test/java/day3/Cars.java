package day3;

import java.net.CacheRequest;

public class Cars {


    public Cars() {
        System.out.println("I am a Default constructor");

    }

    public Cars(String colour) {
        System.out.println("Colour "+colour);
    }

    public Cars(int doors) {
        System.out.println("Doors "+doors);
    }


    public static void main(String[] args) {
        Cars car = new Cars("red");
        Cars c1 =new Cars(4);
        Cars c2=new Cars();
        car.colour("Pink");
        c1.colour("Black");
        c2.colour("Grey");
        c2.colour("Green","Toyota");
    }
    public void colour(String colour){

   System.out.println("Colour "+ colour);

    }
        public void colour(String colour,String type){
        System.out.println("Colour "+ colour);
        System.out.println("Type"+ type);

    }
}