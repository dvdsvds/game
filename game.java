import java.io.IOException;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws IOException {
        commands c = new commands();
        level le = new level();
        
        Scanner sc = new Scanner(System.in);

        String[] dif = {"초급"};
        // , "중급", "고급"

        while(true) {
            System.out.println("도움말을 보시려면 help, 명령어 목록을 보시려면 command를 입력해주세요");
            System.out.println("q 입력시 게임이 시작됩니다.");
            System.out.print(">> ");
            String sel = sc.next();
            System.out.println("");

            if(sel.equals("help")) {
                System.out.println("===========");
                System.out.println("<게임 방법>");
                System.out.println("설명 글로만 판단해야하고, 4가지 명령어만 사용가능합니다.");
                System.out.println("난이도에 따라 맵의 크기가 정해지고, 캐릭터가 생성되는 좌표는 랜덤입니다.");
                System.out.println("Finish를 찾으면 게임이 종료됩니다.");
                System.out.println("===========\n");
            } 

            else if(sel.equals("command")) {
                System.out.println("========");
                System.out.println("<명령어>");
                System.out.println("- walk()");
                System.out.println("- jump()");
                System.out.println("- back()");
                System.out.println("- turn(?) -> ? 는 right, left를 대입해 방향을 바꿀 수 있습니다");
                System.out.println("========\n");
            } 

            else if(sel.equals("q") || sel.equals("Q") || sel.equals("quit") || sel.equals("QUIT")) {
                break;
            }

            else {
                System.out.println("다시 입력해주세요.\n");
            }
        }

        System.out.println("게임을 시작하시려면 y를 입력해주세요");
        System.out.println("y가 아닌 다른 것을 입력하시면 게임이 종료됩니다.");
        System.out.print(">> ");

        String yn = sc.next();
        System.out.println("");

            if(yn.equals("y")) {
                while(true) {
                String difficulty = c.difficulty(dif);
                System.out.println("게임의 난이도는 [" + difficulty + "] 입니다.");
                
                    if(difficulty.equals("초급")) {
                        le.easy();
                    }

                    // else if(difficulty.equals("중급")) {
                    //     le.normal();
                    // }

                    // else if(difficulty.equals("고급")) {
                    //     le.hard();
                    // }
                }
            } 
            else {
                System.out.println(("게임을 종료합니다."));
        }
        sc.close();
    }
}