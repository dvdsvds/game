import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.Scanner;

public class functions {
    Scanner active = new Scanner(System.in);
    Scanner sel_coor = new Scanner(System.in);

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
        System.out.println("- xwalk : x좌표가 1만큼 증가합니다.");
        System.out.println("- ywalk : y좌표가 1만큼 증가합니다.");
        System.out.println("- xback : x좌표가 1만큼 감소합니다.");
        System.out.println("- yback : y좌표가 1만큼 증가합니다.");
        System.out.println("- here : 현재의 좌표를 알려줍니다.\n");
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

    int coordinate_x;
    int coordinate_y;
    public void sel_coordinate() {
        System.out.println("\n생성될 좌표를 지정해주세요.");
        System.out.println("* 가장자리만 가능합니다. *");
        System.out.println("예시) x = 1, y = 4(0)\n      x = 2, y = 2(x)\n");

        while(true) {
            while(true) {
                System.out.print("x좌표를 입력해주세요 >> ");
                coordinate_x = sel_coor.nextInt();

                System.out.print("y좌표를 입력해주세요 >> ");
                coordinate_y = sel_coor.nextInt();

                if((coordinate_x > 7 || coordinate_y > 7)) {
                    System.out.println("값이 잘못되었습니다.");
                    System.out.println("다시 입력해주세요.");
                    continue;
                } 
                else {
                    System.out.println("생성된 x좌표는 " + coordinate_x + "이고, " + "y좌표는 " + coordinate_y + "입니다.");
                    break;
                }
            }
            break;
        }
    }


    public void xwalk() {
        coordinate_x++;
        
        if(coordinate_x < 5) {
            System.out.println("1칸 앞으로 갑니다.");
            System.out.println("당신의 x좌표는 " + coordinate_x + ", y좌표는 " + coordinate_y + "입니다." );
        } 
    }

    public void xback() {
        coordinate_x--;

        if(coordinate_x > 0) {
            System.out.println("1칸 뒤로 갑니다.");
            System.out.println("당신의 x좌표는 " + coordinate_x + ", y좌표는 " + coordinate_y + "입니다." );
        }
    }

    public void ywalk() {
        coordinate_y++; 
        
        if(coordinate_y < 5) {
            System.out.println("1칸 앞으로 갑니다.");
            System.out.println("당신의 x좌표는 " + coordinate_x + ", y좌표는 " + coordinate_y + "입니다." );
        } 
    }

    public void yback() {
        coordinate_y--;

        if(coordinate_y > 0) {
            System.out.println("1칸 뒤로 갑니다.");
            System.out.println("당신의 x좌표는 " + coordinate_x + ", y좌표는 " + coordinate_y + "입니다." );
        }
    }

    public void here() {
        System.out.println("당신의 x좌표는 " + coordinate_x + "이고, y좌표는 " + coordinate_y + "입니다." );
    }

    public void active() {
        while(true) {
            while(true) {
                System.out.print(">> ");
                String act = active.nextLine();
                String[] act_arr = act.split("");

                if(act.equals("xwalk") && act_arr.length == 5) {
                    xwalk();
                    if(coordinate_x >= 5) {
                        System.out.println("맵 밖으로 빠져나갈수 없습니다.");
                        System.out.println("다시 입력해주세요");
                        coordinate_x = 4;
                        continue;
                    }
                }

                else if(act.equals("xback") && act_arr.length == 5) { 
                    xback();

                    if(coordinate_x <= 0) {
                        System.out.println("맵 밖으로 빠져나갈수 없습니다.");
                        System.out.println("다시 입력해주세요");
                        coordinate_x = 1;
                        continue;
                    }
                }

                else if(act.equals("ywalk") && act_arr.length == 5) {
                    ywalk();
                    
                    if(coordinate_y >= 5) {
                        System.out.println("맵 밖으로 빠져나갈수 없습니다.");
                        System.out.println("다시 입력해주세요");
                        coordinate_y = 4;
                        continue;
                    }
                }

                else if(act.equals("yback") && act_arr.length == 5) { 
                    yback();

                    if(coordinate_y <= 0) {
                        System.out.println("맵 밖으로 빠져나갈수 없습니다.");
                        System.out.println("다시 입력해주세요");
                        coordinate_y = 1;
                        continue;
                    }
                }
                
                else if(act.equals("here") && act_arr.length == 4) { 
                    here();
                }

                else if(act.equals("end")) {
                    break;
                }

                else if(!(act.equals("xwalk") || act.equals("ywalk") || act.equals("xback") || act.equals("yback"))){
                    System.out.println("! 값을 잘못 입력하셨습니다.");
                    continue;
                }
            }
            break;
        }
    }


}