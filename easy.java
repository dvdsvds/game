import java.util.Scanner;

public class easy {
    Scanner value = new Scanner(System.in);
    functions f = new functions();

    public void easy_level() {
        int[] four_width = {1,2,3,4};
        int[] four_length = {1,2,3,4};
        // int x; int y;
        System.out.println("맵의 크기 : 4 x 4\n");
        for(int i = 0; i < four_width.length; i++) {
            System.out.print("  " + four_width[i] + " ");
        }

        System.out.println("");
        
        for(int j = 0; j < four_length.length; j++) {
            System.out.print(four_length[j]);
            System.out.println(" " + "@" + "   " + "@" + "   " + "@" + "   " + "@");
            System.out.println("");
        }

        // 생성 좌표 지정      
        f.sel_coordinate();
        System.out.println("\n행동을 입력하세요");
        f.easy_active();
        
    }
}

