public class map {
    public void four() {
        int[][] four = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        for(int i = 0; i < four.length; i++) {
            for(int j = 0; j < four[i].length; j++) {
                System.out.print("□ ");
                System.out.print(four[i][j] + "\t");
            }
            System.out.println("\n\n\n");
        }
    }

    public void five() {
        int[][] five = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};

        for(int i = 0; i < five.length; i++) {
            for(int j = 0; j < five[i].length; j++) {
                System.out.print("□ ");
                System.out.print(five[i][j] + "\t");
            }
            System.out.println("\n\n\n");
        }
    }

    public void six() {
        int[][] six = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}, {31,32,33,34,35,36}};

        for(int i = 0; i < six.length; i++) {
            for(int j = 0; j < six[i].length; j++) {
                System.out.print("□ ");
                System.out.print(six[i][j] + "\t");
            }
            System.out.println("\n\n\n");
        }
    }
}
