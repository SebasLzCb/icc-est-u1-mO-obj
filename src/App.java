import controllers.ManagePeople;

public class App {
    public static void main(String[] args) throws Exception {
        // Person person = new Person("Pablo",20);
        // System.out.println(person.getName());
        ManagePeople mG = new ManagePeople();
        mG.sortPeopleByAge();
        mG.sortPeopleByName();
    }
}
