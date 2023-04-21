package generic.officials;

public class User extends Officials {
    public User(String name) {
        super(name);
    }

    @Override
    public void enter(){
        System.out.println("표를 보여줍니다.");
        super.enter();
    }
}
