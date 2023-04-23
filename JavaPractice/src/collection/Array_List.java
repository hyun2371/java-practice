package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        /*
        맛집 대기
         */

        // 데이터 추가
        ArrayList<String> list = new ArrayList<>();
        list.add("라이언");
        list.add("춘식");
        list.add("무지");
        list.add("프로도");

        System.out.println("==대기 명단==");

        // 전체 데이터 조회
        for (String s : list) {
            System.out.println(s);
        }


        // 인덱스로 특정 데이터 조회
        System.out.print("첫번째 대기자: ");
        System.out.println(list.get(0));

        System.out.print("총 대기 수: ");
        System.out.println(list.size());

        System.out.println("==================");

        // 리스트 특정 요소 포함 여부 확인
        if (list.contains("프로도"))
            System.out.println("VIP 손님 프로도를 맞아주세요");

        //리스트 해당 요소의 인덱스 출력
        System.out.println(list.indexOf("춘식"));

        System.out.println("==================");


        // 정렬
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

        // 삭제
        list.remove(0);


        // 리스트 빈 여부 확인하고 아니라면 리스트 비우기
        if (!list.isEmpty())
            list.clear();
    }
}
