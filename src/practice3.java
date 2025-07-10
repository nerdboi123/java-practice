public class practice3 {
    public static void main(String[] args) {

        // for 문 실행 (0부터 4까지 하나씩 더해가며 출력. 단 5보다 값이 커지지 않음)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("/////////////////");

        // while 문
        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("/////////////////");

        // do-while 문
        int num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 3);
    }
}