public class ex {
    public void help() {
        System.out.println(" <게임 방법> ");
        System.out.println(" 설명 글로만 판단해야하고, 4가지 명령어만 사용가능합니다.");
        System.out.println(" 난이도에 따라 맵의 크기가 정해지고, 캐릭터가 생성되는 장소는 랜덤이며, 생성된 장소를 알려주지 않습니다.");
        System.out.println(" Finish를 찾으면 게임이 종료됩니다.");
    }

    public void command_help() {
        System.out.println(" <명령어> ");
        System.out.println(" - walk()");
        System.out.println(" - jump()");
        System.out.println(" - back()");
        System.out.println(" - turn(?) -> ? 는 right, left로 입력하여 방향을 바꿀 수 있습니다.");
    }

    public void help_ex() {
            System.out.println("도움말을 보시려면 help, 명령어 목록을 보시려면 command를 입력해주세요");
            System.out.println("q 입력시 게임이 시작됩니다.");
            System.out.print(">> ");

    }

    public void gameStart_ex() {

        System.out.println("게임을 시작하시려면 y를 입력해주세요");
        System.out.println("y가 아닌 다른 것을 입력하시면 게임이 종료됩니다.");
        System.out.print(">> ");

        
        

    }
}
