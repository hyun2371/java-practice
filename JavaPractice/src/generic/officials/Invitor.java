package generic.officials;

public class Invitor extends Officials {
    public Invitor(String name) {
        super(name);
    }

    @Override
    public void enter(){
        System.out.println("초대권을 보여줍니다");
        super.enter();
    }
}
