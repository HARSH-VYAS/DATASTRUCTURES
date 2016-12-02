package com.company;

/**
 * Created by Harsh P Vyas on 11/13/2016.
 */
public class Food {

    public void serveFood(){
        System.out.println("I am serving Food");
    }
}

class FastFood extends Food{

    FastFood(){
        super();
    }

    @Override
    public void serveFood(){
        System.out.println("I'm serving FastFood");
    }

}

class Fruit extends Food{

    Fruit(){
        super();
    }

    @Override
    public void serveFood(){
        System.out.println("I'm serving Fruit");
    }
}

class FoodFactory extends Food {

    public Food getFood(String name){

        if(name.equals("FastFood"))
            return new FastFood();
        if(name.equals("Fruit"))
            return new Fruit();

        return new Food();
    }

}