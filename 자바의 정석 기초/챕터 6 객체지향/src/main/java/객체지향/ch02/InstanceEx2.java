package 객체지향.ch02;

public class InstanceEx2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // 변수의 초기화와 동시에 변수 설정
        Tv t2 = new Tv();
        System.out.println("t1의 channel은" + t1.channel + "입니다.");  // 채널 주소의 값은 0
        System.out.println("t2의 channel은" + t2.channel + "입니다.");   // 상동

        t1.channel = 7;
        System.out.println("t1의 channel을" + t1.channel + "로 변경하였습니다."); // 채널 주소의 값 설정 7로 변경

        // *근데 여기서 t2 = t1을 넣으면 ?

        t2 = t1; //참조변수 t1을 t2에 저장.
        System.out.println("t1의 channel은" + t1.channel + "입니다.");   // 7
        System.out.println("t2의 channel은" + t2.channel + "입니다.");   // 0 에서 7로 변경
    }
}
