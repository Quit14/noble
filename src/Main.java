import java.util.ArrayList;
import java.util.Comparator;
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

        Comparator<Person> comparator = (p1, p2) -> {
            int nLength_o1 = p1.getSurname().split(" ").length;
            int nLength_o2 = p2.getSurname().split(" ").length;
            if(nLength_o1 > 4 && nLength_o2 > 4 || nLength_o1 == nLength_o2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
            return Integer.compare(nLength_o1, nLength_o2);
        };

        famousPeople.sort(comparator);
        System.out.println(famousPeople);
    }
}
