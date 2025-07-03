public class NameClass  implements Name{
    @Override
    public void details() {
        System.out.println("my name is DJ");
    }

    public static void main(String[] args) {
        NameClass name = new NameClass();
        name.details();
    }
}
