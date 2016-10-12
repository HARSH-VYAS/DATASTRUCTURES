package com.ctc;

import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 9/24/2016.
 */
public class AnimalShelter {

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    int order=0;

    public class Animal{
        int order;
        String name;
        Animal(String name){
            this.name= name;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public boolean isOlder(Animal a){
            return (this.getOrder()<a.getOrder());
        }
    }

    public class Dog extends Animal{
        Dog(String name){
                super(name);}

    }

    public class Cat extends Animal{

        Cat(String name){
            super(name);
        }

    }

    public void enqueue(Animal a){
            a.setOrder(order);
            order++;
            if(a instanceof Dog ){
                dogs.add((Dog)a);
            }
            else{
                cats.add((Cat)a);
            }
    }

    public Animal dequeue(){

        Animal a = null;
        if(dogs.isEmpty()) {
            a = (Animal) cats.poll();
        }
        else if (cats.isEmpty()) {
            a = (Animal) dogs.poll();
        }
        else{
            Dog d = dogs.peek();
            Cat c = cats.peek();
            if(d.isOlder(c)){
                a= (Animal)dogs.poll();
            }
            else{
                a=(Animal)cats.poll();
            }
        }
        return  a;
    }



}
