import java.util.List;

public class RepMans {

    //[1 2 3]
    //new [1 2 3 4]
    //({1}, {2}, {3})
    //({1}, {2}, {3}, {4})

    List<Man> family;

    public RepMans(List<Man> fam) {
        this.family = fam;
    }

    public void printFamily() {
        family.forEach(el -> System.out.println(el.saySmth()));
//        for(Man el: family)
//            System.out.println(el.saySmth());
    }
}
