public class active {
    public void walk(int value) {
        System.out.println(value + "칸 만큼 앞으로 전진합니다.");
    }

    public void jump() {
        System.out.println("장애물을 뛰어넘습니다.");
    }

    public void back(int value) {
        System.out.println(value + "칸 만큼 뒤로 돌아갑니다.");
    }

    public void turn(String direction) {
        if(direction == "left" || direction == "Left" || direction == "l" || direction == "L") {
            System.out.println("왼쪽으로 돕니다.");
        } else if(direction == "right" || direction == "Right" || direction == "r" || direction == "R") {
            System.out.println("오른쪽으로 돕니다.");
        } else {
            System.out.println("방향이 잘못되었습니다.");
        }
    }
}

