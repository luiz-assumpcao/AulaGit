public class Main {

    public static void sayHello(){
        System.out.println("Hello world!");
    }

    public static void sayHelloManyTimes(int times){
        for (int i = 0; i < times; i++){
            sayHello();
        }
    }

    public static void main(String[] args) {
        sayHelloManyTimes(6);
    }
}   