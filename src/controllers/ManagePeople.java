 package controllers;
 import views.ViewConsole;
 import models.Person;


 public class ManagePeople {

    private ViewConsole vista;
    private BubbleSort sorting;
    private Person[] people;
    
    public ManagePeople(){
        // Instancia de clases
        this.vista = new ViewConsole();
        this.sorting = new BubbleSort();
        // Instancia de variables
        this.people = new Person[5]; // Creacion 5 espacios
        this.people[0] = new Person("Alice", 30 );
        this.people[1] = new Person("Bob", 25 );
        this.people[2] = new Person("Charlie", 35 );
        this.people[3] = new Person("David", 20 );
        this.people[4] = new Person("Eve", 28 );

        vista.showMessage("Clase Manage People create");
        vista.printPeopleList(people);
    }


    public void sortPeopleByAge(){
        vista.showMessage("Personas por edad");
        sorting.sortByAge(people);
        vista.printPeopleList(people);
    } 

    public void sortPeopleByName(){
        vista.showMessage("Personas por nombre");
        sorting.sortByName(people);
        vista.printPeopleList(people);
    }
}