package ch07;

public class CarEaxmple {
    public static void main(String args[]){
        Car car = new Car();

        //Car의 run() 5번 실행
        for(int i=1; i<=5; i++){
            int problemLocation = car.run();
        

            switch(problemLocation){
                case 1:
                System.out.println("앞왼쪽 hankooktire로 교체");
                car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                break;

                case 2:
                System.out.println("앞오른쪽 hankooktire로 교체");
                car.frontLeftTire = new HankookTire("앞오른쪽", 13);
                break; 

                case 3:
                System.out.println("뒤왼쪽 hankooktire로 교체");
                car.frontLeftTire = new HankookTire("앞오른쪽", 14);
                break;

                case 4:
                System.out.println("뒤오른쪽 hankooktire로 교체");
                car.frontLeftTire = new HankookTire("앞오른쪽", 17);
                break;
            }
            System.out.println("-----------------------");
        }
    }
}
