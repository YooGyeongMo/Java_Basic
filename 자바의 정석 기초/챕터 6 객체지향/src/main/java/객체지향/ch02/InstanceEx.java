package 객체지향.ch02;

public class InstanceEx {
    public static void main(String[] args){
        Tv t; // 참조변수 리모콘
        t = new Tv(); // 참조변수 리모콘에 객결를 연결
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은" + t.channel +"입니다.");
    }
}

class Tv {
    // Tv의 속성 (멤버변수)
    String color;     //색상
    boolean power;   //전원
    int channel;      //채널

    // Tv의 기능 (메서드)
    void power()    { power = !power; }  //전원켜기 , 끄기 기능
    void channelUp()    { ++channel; }  //Tv의 채널을 높이는 기능
    void channelDown()  { --channel; }  //Tv의 채널을 낮추는 기능
}