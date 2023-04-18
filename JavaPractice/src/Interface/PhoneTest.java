package Interface;

public class PhoneTest{
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
    }
}
