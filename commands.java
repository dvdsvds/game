import java.util.concurrent.TimeUnit;
import java.lang.Math;

public class commands {
    public void start_help() {
        System.out.println("도움말을 보시려면 help, 명령어 목록을 보시려면 command를 입력해주세요");
        System.out.println("게임을 시작하려면 start, 종료하려면 quit을 입력해주세요");
        System.out.print(">> ");
    }

    public void help() {
        System.out.println("===========");
        System.out.println("<게임 방법>");
        System.out.println("설명 글로만 판단해야하고, 4가지 명령어만 사용가능합니다.");
        System.out.println("난이도에 따라 맵의 크기가 정해지고, 캐릭터가 생성되는 좌표는 랜덤입니다.");
        System.out.println("Finish를 찾으면 게임이 종료됩니다.");
        System.out.println("===========\n");
    }

    public void command() {
        System.out.println("========");
        System.out.println("<명령어>");
        System.out.println("- walk : x좌표가 1만큼 증가합니다.");
        System.out.println("         turn(?) 입력 후 y좌표가 1만큼 증가합니다.\n");
        System.out.println("- back : x좌표가 1만큼 감소합니다.");
        System.out.println("         turn(?) 입력 후 y좌표가 1만큼 감소합니다.\n");
        System.out.println("- turn(left) : 왼쪽으로 시선을 옮깁니다.");
        System.out.println("- turn(right) : 오른쪽으로 시선을 옮깁니다.");
        System.out.println("========\n");
    }
    
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
    // public int random(int value) {
    //     int random = (int)(Math.random() * value + 1);
    //     return random;
    // }
}