package Interface;

public class NewPhone extends PhoneInfo implements Contact, Film{
    @Override
    public void sendMessage() {
        System.out.println("빠른 속도로 메세지를 전송합니다.");
    }

    @Override
    public void call() {
        System.out.println("높은 음질로 통화를 합니다.");
    }

    @Override
    public void takeVideo() {
        System.out.println("고화질 동영상을 촬영합니다.");
    }

    @Override
    public void takePicture() {
        System.out.println("고화질 사진을 찍습니다.");
    }

    @Override
    public void printPrice() {
        System.out.println("6000원 입니다.");
    }
}
