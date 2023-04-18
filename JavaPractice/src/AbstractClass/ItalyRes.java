package AbstractClass;

public class ItalyRes extends Restaurant{
    @Override
    public void cook() {
        System.out.println("파스타를 조리합니다.");
    }

    @Override
    public void displayBusinessHours() {
        System.out.println("영업시간은 11시~20시입니다.");
    }

    @Override
    public void prepareFood() {
        System.out.println("크림소스와 생면을 준비합니다.");
    }
}
