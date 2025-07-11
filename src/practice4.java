public class practice4 {

    public static String if_test(int num) {
        String result = "";
        //if문 예제
        if (num > 0) {
            result = ("양수");
        } else if (num == 0) {
            result = ("0입니다.");
        } else {
            result = ("음수입니다.");
        }
        return result;
    }

    public static String switch_test(int day) {
        // switch 문 : 값에 따라 여러 분기로 나누기

        String result ="";

        switch(day) {
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
            default:
                result = "기타 요일";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(if_test(3));
        System.out.println(switch_test(1));
    }
}
