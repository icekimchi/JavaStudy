import java.util.Scanner;

public class DowhileExmaple{
    public static void main(String[] args){
        System.out.prinln("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        String inputString;

        //do-while문
        do{
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (! inputString.equals("q")); //문자열을 비교할 때는 equals() 메소드 사용

        System.out.println(프로그램 종료);
    }
}