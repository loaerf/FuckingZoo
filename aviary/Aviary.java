package com.aviary;

import com.animal.Animal;
import com.animal.Carnivorous;
import com.animal.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<C extends Carnivorous,H extends Herbivore> {
        private Map<String, H> herbivore;
        private Map<String, C> carnivorous;
        private AviarySize size;

        /*
        public Aviary(C c, AviarySize size) {
            carnivorous = new HashMap<>();
            this.size = size;
        }
        */
        public Aviary(AviarySize size) {
            herbivore = new HashMap<>();
            carnivorous = new HashMap<>();
            this.size = size;
        }

        public void add(H animal) {
            if (animal.getSize() <= size.getSize()){
                herbivore.put(animal.getName(), animal);
                System.out.println(animal.getName() + " added");
            }
            else {
                System.out.println("Aviary size is too small");
            }

        }
        public void add(C animal) {
            if (animal.getSize() <= size.getSize()){
                carnivorous.put(animal.getName(), animal);
                System.out.println(animal.getName() + " added");
            }
            else {
                System.out.println("Aviary size is too small");
            }


        }

        public void remove(String name, Animal animal) {
            if (herbivore.containsKey(name)) {
                herbivore.remove(name);
            }
            else {
                carnivorous.remove(name);
            }
            System.out.println(name + " removed");
        }

        public Animal get(String name) {
            if (herbivore.containsKey(name)) {
                return herbivore.get(name);
            }
            else {
                return carnivorous.get(name);
            }

        }

}
