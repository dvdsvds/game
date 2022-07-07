import java.util.concurrent.TimeUnit;
import java.lang.Math;

public class commands {
    public void timeDelay(int time) {
        String str = "... ";
        char[] arr = str.toCharArray();
        try {
            for(int i = 0; i < arr.length; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(arr[i]);
            }
        }
        catch(Exception e) {}
    }

    public String difficulty(String[] difficulty) {
        System.out.println("난이도가 랜덤으로 선택됩니다.");
        System.out.print("난이도 선택중");
        timeDelay(1);

        double random = Math.random(); 
        int num = (int)Math.round(random * (difficulty.length - 1));
        System.out.println("");
        System.out.println();
        return difficulty[num];
    }

    public int random(int value) {
        int random = (int)(Math.random() * value + 1);
        return random;
    }

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