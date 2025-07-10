public class practice2 {
    static int num = 10;

    public static void main(String[] args) {

        //조건문 : if문
        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        // switch 문 : 값에 따라 여러 분기로 나누기
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
            default:
                System.out.println("기타 요일");
                break;
        }
    }
}


