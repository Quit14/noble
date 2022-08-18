import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> famousPeople = new ArrayList<>();
        famousPeople.add(new Person("Gaspard", "de Coligny de Chatillon", 53));
        famousPeople.add(new Person("Fernando", "Alvarez de Toledo y Pimentel", 75));
        famousPeople.add(new Person("Publius", "Cornelius Scipio Africanus Maior", 52));
        famousPeople.add(new Person("Charles Louis", "de Seconda, Baron de La Brede et de Montesquieuv", 66));
        famousPeople.add(new Person("Jose Gabriel", "Condorcanqui Noguera", 43));
        famousPeople.add(new Person("Otto Eduard Leopold", "von Bismarck Schonhausen", 83));

        famousPeople.sort(new PersonsNameAndAgeComparator(4));
        System.out.println(famousPeople);
    }
}
