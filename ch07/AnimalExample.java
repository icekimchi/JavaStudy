package ch07;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        //변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();

        //메소드의 다형성
        animalSound(new Dog()); //자동타입 변환
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
