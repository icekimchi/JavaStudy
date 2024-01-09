public class Calculator {
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double avg(int x, int y){
        double sum = plus(x, y);
        double result1 = sum/2;
        return result1;
    }

    void execute(){
        double result = avg(7, 10); //위 함수 호출
        println("실행결과: " + result); //아래 함수 호출
    }

    void println(String message){
        System.out.println(message);
    }
}
