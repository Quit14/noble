import java.util.Comparator;

public class PersonsNameAndAgeComparator implements Comparator <Person> {
    private int minNameLength;
    public PersonsNameAndAgeComparator(int minNameLength) {
        this.minNameLength = minNameLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int nLength_o1 = o1.getSurname().split(" ").length;
        int nLength_o2 = o2.getSurname().split(" ").length;
        if(nLength_o1 > minNameLength && nLength_o2 > minNameLength || nLength_o1 == nLength_o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(nLength_o1, nLength_o2);
    }

}
