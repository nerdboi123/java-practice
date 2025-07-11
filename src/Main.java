
public class Main {

    public static String ifTest(int num) {

        String str = "";

        if (num > 0) {
            str = "양수";

        } else if (num == 0) {
            str = "0";

        } else {
            str = "음수";

        }
        return str;  // 문자열 반환
    }


    public static void main(String[] args) {
        String str = ifTest(2);
        System.out.println(str + "입니다.");
    }

}