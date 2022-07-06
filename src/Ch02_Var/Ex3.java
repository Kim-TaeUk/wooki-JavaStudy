package Ch02_Var;

public class Ex3 {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }
}

//datatype -> 기본형, 참조형

//기본형 -> 논리형, 문자형, 정수형, 실수형
//논리형 boolean / 문자형 char / 정수형 byte, short, int, long / 실수형 float, double
//boolean을 제외한 다른 기본형끼리는 연산과 변환 가능


//상수 & 리터럴
//상수 -> datatype 앞에 final 붙이면 됨

//int year = 2022;
//final int MAX_VALUE = 100;
//-> 변수: year, 상수: MAX_VALUE, 리터럴: 2022, 100


//리터럴 -> 타입과 접미사가 존재
//논리형, 정수형(L), 실수형(f,d), 문자형, 문자열

//ex1) float pi = 3.14; -> error 발생 O -> 실수형은 default가 double이다 -> 3.14 = 3.14d
//ex2) float pi = 3.14f; -> error 발생 X
//ex3) double pi = 3.14; -> error 발생 X
//ex4) double pi = 3.14f; -> error 발생 X -> 넓은 저장범위 가진 type에 좁은 타입의 value 저장은 허용


//문자 리터럴 & 문자형열리터럴
//문자 리터럴 'A' / 문자열 리터럴 "Hello"

//ex1) char ch = 'A'; -> error 발생 X
//ex2) char ch = 'Hello'; -> error 발생 O
//ex3) String name = "Hello"; -> error 발생 X

//ex4) String str = ""; -> error 발생 X -> 빈 문자열
//ex5) char ch = ''; -> error 발생 O -> ''안에 반드시 하나의 문자가 필요함
//ex6) char ch = ' '; -> error 발생 X -> blank(공백문자)로 ch 초기화

//ex7) String name = new String("Hello"); -> String 객체 생성 -> String은 원래 class라서 객체 생성 new 연산자 사용하는게 정석

//ex8) String name = "He" + "llo"; -> 덧셈 연산자로 결합 가능 -> name = "Hello"
//ex8') String str = name + 2022; -> str = "Hello2022" -> 2022가 String으로 변환되고 결합

//덧셈 연산자 이용할 때
//피연산자 둘 다 숫자 -> 더하기 연산
//피연산자 중 하나라도 문자열이면 아닌 피연산자를 String으로 변환하고 String끼리 결합
//-> 기본형 타입의 값을 문자열로 변환하고 싶으면 ""(빈 문자열) 더해주면 됨!

//ex1) 7 + 7 + "" -> 14 + "" -> "14"
//ex2) "" + 7 + 7 -> "7" + 7 -> "77"
