package ch07;
public class DmbCellPhone extends CellPhone {
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color= color;
        this.channel = channel;
    }

    //메소드
    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }
}
