package generic;

import generic.officials.Invitor;
import generic.officials.Officials;
import generic.officials.User;

public class Test {
    public static void main(String[] args) {
        // 제너릭 클래스
        TimeReminder<String> p1 = new TimeReminder<>("절반");
        p1.notice();

        TimeReminder<Integer> p2 = new TimeReminder<>(30);
        p2.notice();

        // 제너릭 클래스 타입 제한하기
        Restaurant<Officials> o1 = new Restaurant<>(new Invitor("나유명"));
        Restaurant<Officials> o2 = new Restaurant<>(new User("한평범"));

        o1.serve();
        o2.serve();

        // 제너릭 메서드
        showReceipt("쌀국수",8500);
        showReceipt(123,"12000원");

    }
    //제너릭 메서드 여러 타입 파라미터 사용 가능
    public static <T, V> void showReceipt(T name, V price){
        System.out.println(name +": "+price);
    }
}
