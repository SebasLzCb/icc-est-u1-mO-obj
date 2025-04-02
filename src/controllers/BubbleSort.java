package controllers;

import models.Person;

public class BubbleSort {

    public void sortByAge(Person[] people) {
        for (int i = 0; i < people.length -1; i++){
            for(int j = 0; j < people.length -1 -i; j++){
                if (people[j].getAge() > people[j + 1].getAge()){
                    //Intercambiar
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;}

            }
    }
        }
    
    public void sortByName(Person[] people) {
        for (int i = 0; i < people.length- 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    //Intercambiar
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}
