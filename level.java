public class level {
    commands c = new commands();

    int x;
    int y;

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
        // easy 난이도 x 값 지정

        // easy 난이도 y 값 지정


    }

    // public void normal() {
    //     int[] five_width = {1,2,3,4,5};
    //     int[] five_length = {1,2,3,4,5};
        
    //     int x;
    //     int y;
    //     System.out.println("맵의 크기 : 5 x 5\n");
    //     for(int i = 0; i < five_width.length; i++) {
    //         x = five_width[i];
    //         System.out.print("  " + x + " ");
    //     }
    //     System.out.println("");
        
    //     for(int j = 0; j < five_length.length; j++) {
    //         y = five_length[j];
    //         System.out.print(y);

    //         System.out.println(" " + "@" + "   " + "@" + "   " + "@" + "   " + "@" + "   " + "@");
    //         System.out.println("");
    //     }   

    // } 
    
    // public void hard() {
    //     int[] six_width = {1,2,3,4,5,6};
    //     int[] six_length = {1,2,3,4,5,6};
        
    //     int x;
    //     int y;
    //     System.out.println("맵의 크기 : 6 x 6\n");
    //     for(int i = 0; i < six_width.length; i++) {
    //         x = six_width[i];
    //         System.out.print("  " + x + " ");
    //     }
    //     System.out.println("");
        
    //     for(int j = 0; j < six_length.length; j++) {
    //         y = six_length[j];
    //         System.out.print(y);

    //         System.out.println(" " + "@" + "   " + "@" + "   " + "@" + "   " + "@" + "   " + "@" + "   " + "@");
    //         System.out.println("");

    //     }
    // }
}

