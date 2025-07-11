public class Calculate {

    //덧셈
    public int plus(int a, int b){
        return a+b;
    }


    //뺄셈
    public int minus(int a, int b) {
        return a-b;
    }


    //곱셈
    public int times(int a, int b) {
        return a*b;
    }


    //나눗셈
    public int divide(int a, int b) {
        return a/b;
    }


    //main 계산기 작동 확인
    public static void main(String[] args){
        Calculate cal = new Calculate();

        int a = 4;
        int b = 2;
        System.out.println("입력 받은 값: " +a+ ","+ b);
        System.out.println("더하기: " + cal.plus(a,b));
        System.out.println("빼기: " + cal.minus(a,b));
        System.out.println("곱하기: " + cal.times(a,b));
        System.out.println("나누기: " + cal.divide(a,b));
    }



}
