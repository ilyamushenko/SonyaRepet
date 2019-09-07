public class Child extends Man {
    @Override
    public String saySmth() {
        super.saySmth();
        return super.saySmth() + "И я ребёнок";
    }
}
