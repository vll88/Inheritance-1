package Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by vilenalivinsky on 5/12/17.
 */
public class Program {

    int numberOfPets;
    ArrayList<String> petlist = new ArrayList<String>();

    public int getNumberOfPets() {
        System.out.println(numberOfPets);
        return numberOfPets;
    }

    public void getUserInput() {
        System.out.println("how many pets?");
        Scanner sc = new Scanner(System.in);
        numberOfPets = sc.nextInt();
    }

    public void createDog(String name, String type){
        Dog dog = new Dog(name, type);
    }

    public void createCat(String name, String type){
        Cat cat = new Cat(name, type);
    }

    public void createPet(String name, String type){
        Pet pet = new Pet(name, type);
    }

    public void getDetails(){

        for (int i=1; i<=numberOfPets; i++){
            System.out.println("Name?");
            Scanner scname = new Scanner(System.in);
            String name = scname.nextLine(); //local var
            petlist.add(name);
            System.out.println("Type?");
            Scanner sctype = new Scanner(System.in);
            String type = sctype.nextLine(); //local var

            if (type.equalsIgnoreCase("dog")) {
                createDog(name, type);
            }
            if (type.equalsIgnoreCase("cat")) {
                createCat(name, type);
            }
            else {
                createPet(name, type);
            }
        }
    }

    public void speak(){

        System.out.println("This is the default");

    }

    public void printNames () {
        Collections.sort(petlist);
        for (int i = 0; i < petlist.size(); i++) {
            System.out.println(petlist.get(i));
        }
    }

}
