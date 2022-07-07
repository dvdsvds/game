import java.util.Scanner;

public class level {
    Scanner sel_coordinate = new Scanner(System.in);
    Scanner active = new Scanner(System.in);
    commands c = new commands();

    public void easy() {
        int[] four_width = {1,2,3,4};
        int[] four_length = {1,2,3,4};

        int x;
        int y;
        
        System.out.println("맵의 크기 : 4 x 4\n");
        for(int i = 0; i < four_width.length; i++) {
            x = four_width[i];
            System.out.print("  " + x + " ");
        }

        System.out.println("");
        
        for(int j = 0; j < four_length.length; j++) {
            y = four_length[j];
            System.out.print(y);

            System.out.println(" " + "@" + "   " + "@" + "   " + "@" + "   " + "@");
            System.out.println("");
        }

        // 생성될 좌표 지정(가장자리만 가능)       
        System.out.println("\n생성될 좌표를 지정해주세요.");
        System.out.println("* 가장자리만 가능합니다. *");
        System.out.println("예시) x = 1, y = 4(0)\n      x = 2, y = 2(x)\n");

        while(true) {
            System.out.print("x좌표를 입력해주세요 >> ");
            int coordinate_x = sel_coordinate.nextInt();

            System.out.print("y좌표를 입력해주세요 >> ");
            int coordinate_y = sel_coordinate.nextInt();

            while(true) {
                if((coordinate_x == 2 && coordinate_y == 2) || (coordinate_x == 2 && coordinate_y == 3) || (coordinate_x == 3 && coordinate_y == 2) || (coordinate_x == 3 && coordinate_y == 3)) {
                    System.out.println("가장자리만 가능합니다.");
                    System.out.println("다시 입력해주세요");
                    break;
                }
                else {
                    System.out.println("생성된 x좌표는 " + coordinate_x + "이고, " + "y좌표는 " + coordinate_y + "입니다.");
                    break;
                }
            }
            break;
        }

        System.out.println("\n행동을 입력하세요");
        while(true) {
            System.out.print(">> ");

            String act = active.next();

            if(act.equals("end")) {
                break;
            }
        }
    }
}

