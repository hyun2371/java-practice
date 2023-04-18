package AbstractClass;

public class ChineseRes extends Restaurant{
    @Override
    public void cook() {
        System.out.println("짜장면을 조리합니다.");
    }

    @Override
    public void displayBusinessHours() {
        System.out.println("영업시간은 17시~ 23시입니다.");
    }

    @Override
    public void prepareFood() {
        System.out.println("춘장과 수타면을 준비합니다.");
    }
}
