package Ch02_Var;

public class Ex2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);
    }
}

//덧셈 연산자 +로 문자열과 숫자 결합 가능
