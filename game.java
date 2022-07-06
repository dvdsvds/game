import java.io.IOException;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws IOException {
        commands c = new commands();
        ex ex = new ex();
        map map = new map();
        
        Scanner sc = new Scanner(System.in);

        String[] dif = {"초급", "중급", "고급"};

        while(true) {
            ex.help_ex();
            String sel = sc.next();
            System.out.println("");

            if(sel.equals("help")) {
                ex.help();
            } 

            else if(sel.equals("command")) {
                ex.command_help();
            } 

            else if(sel.equals("q") || sel.equals("Q") || sel.equals("quit") || sel.equals("QUIT")) {
                break;
            }

            else {
                System.out.println("다시 입력해주세요.");
            }
        }

        ex.gameStart_ex();
        String yn = sc.next();
        System.out.println("");

        
        if(yn.equals("y")) {
            String difficulty = c.difficulty(dif);
            System.out.println("게임의 난이도는 [" + difficulty + "] 입니다.");

            if(difficulty.equals("초급")) {
                System.out.println("맵의 크기 : 4 x 4\n");
                System.out.println("생성된 곳은 <" + c.random(16) + "> 입니다.\n\n");

                
                map.four();
            }

            else if(difficulty.equals("중급")) {
                System.out.println("맵의 크기 : 5 x 5\n");
                System.out.println("생성된 곳은 <" + c.random(25) + "> 입니다.\n\n");

                map.five();
            }


            else if(difficulty.equals("고급")) {
                System.out.println("맵의 크기 : 6 x 6\n");
                System.out.println("생성된 곳은 <" + c.random(36) + "> 입니다.\n\n");

                map.six();
            }

        sc.close();

        }

        else {
            System.out.println(("게임을 종료합니다."));
        }
    }
}