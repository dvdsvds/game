import java.io.IOException;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws IOException {
        functions c = new functions();
        easy le = new easy();
        
        Scanner sc = new Scanner(System.in);

        String[] dif = {"쉬움"};

        while(true) {
            c.start_help();
            String sel = sc.next();
            System.out.println("");

            if(sel.equals("help")) {
                c.help();
            } else if(sel.equals("command")) {
                c.command();
            } else if(sel.equals("start")) {
                break;
            } else if(sel.equals("quit")) {
                System.exit(1);
            } else {
                System.out.println("다시 입력해주세요.\n");
            }
        }

        while(true) {
            String difficulty = c.difficulty(dif);
            System.out.println("게임의 난이도는 [" + difficulty + "] 입니다.");
            
            if(difficulty.equals("쉬움")) {
                le.easy_level();
                break;
            }
        }
        sc.close();
    }
}