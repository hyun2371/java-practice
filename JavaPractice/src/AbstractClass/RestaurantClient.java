package AbstractClass;

public class RestaurantClient {
    public static void main(String[] args) {
        //Restaurant res = new Restaurant(); // 오류남

        ChineseRes chineseRes = new ChineseRes();
        chineseRes.displayBusinessHours();

        ItalyRes italyRes = new ItalyRes();
        italyRes.displayBusinessHours();
    }
}
