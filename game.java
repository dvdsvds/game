import java.io.IOException;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws IOException {
        functions f = new functions();

        Scanner sc = new Scanner(System.in);

        String[] dif = {"쉬움"};

        while(true) {
            f.start_help();
            String sel = sc.next();
            System.out.println("");

            if(sel.equals("help")) {
                f.help();
            } else if(sel.equals("command")) {
                f.command();
            } else if(sel.equals("start")) {
                break;
            } else if(sel.equals("quit")) {
                System.exit(1);
            } else {
                System.out.println("다시 입력해주세요.\n");
            }
        }

        while(true) {
            String difficulty = f.difficulty(dif);
            System.out.println("게임의 난이도는 [" + difficulty + "] 입니다.");
            
            if(difficulty.equals("쉬움")) {
                int[] four_width = {1,2,3,4,5,6,7};
                int[] four_length = {1,2,3,4,5,6,7};
            // int x; int y;
                System.out.println("맵의 크기 : 4 x 4\n");
                for(int i = 0; i < four_width.length; i++) {
                    System.out.print("  " + four_width[i] + " ");
                }

                System.out.println("");
                
                for(int j = 0; j < four_length.length; j++) {
                    System.out.print(four_length[j]);
                    System.out.println(" @" + "   @" + "   @" + "   @" + "   @" + "   @" + "   @");
                    System.out.println("");
                }

                // 생성 좌표 지정      
                f.sel_coordinate();
                // 찾아야 하는 목표 랜덤 생성
                
                System.out.println("목표물이 생성되었습니다.");

                System.out.println("\n행동을 입력하세요");
                f.active();
                break;
            }
        }
        sc.close();
    }
}