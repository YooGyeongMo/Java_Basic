package 객체지향.ch04;

public class Ex4_1 {
    public static void main(String[] args) {
        // kind, number iv
        // width, height cv
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.weight = " + Card.height);

        // iv c1
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 3;

        System.out.println("c1은" + c1.kind + c1.number + " 이며, 크기는 (" + Card.width + " , " + Card.height + " )");
        System.out.println("c2은" + c2.kind + c2.number + " 이며, 크기는 (" + Card.width + " , " + Card.height + " )");

        System.out.println("c1과 c2의 크기를 변경합니다."); // cv 변경
        Card.width = 50;
        Card.height = 1;

        System.out.println("c1은" + c1.kind + c1.number + " 이며, 크기는 (" + Card.width + " , " + Card.height + " )");
        System.out.println("c2은" + c2.kind + c2.number + " 이며, 크기는 (" + Card.width + " , " + Card.height + " )");
    }
}

class Card{
  String kind;
  int number;
  static int width = 100;
  static int height = 250;


}
