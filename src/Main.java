import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Man> rep = new ArrayList<>();


        rep.add(new Man());
        rep.add(new Woman());
        rep.add(new Child());

        RepMans a = new RepMans(rep);
        a.printFamily();

    }
}
