package h3;
public class H3_main {
    public static void main(String[] args) {
        int [][] einheiten = {{50000, 20000, 10000, 5000, 2000, 1000, 500,
             200, 100, 50, 20, 10, 5, 2, 1},
             {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int input = 6279;
        int rest = input;

        // 50000
        einheiten[1][0] = rest / 50000;
        rest = rest % 50000;

        // 20000
        einheiten[1][1] = rest / 20000;
        rest = rest % 20000;

        // 10000
        einheiten[1][2] = rest / 10000;
        rest = rest % 10000;

        // 5000
        einheiten[1][3] = rest / 5000;
        rest = rest % 5000;

        // 2000
        einheiten[1][4] = rest / 2000;
        rest = rest % 2000;

        // 1000
        einheiten[1][5] = rest / 1000;
        rest = rest % 1000;

        // 500
        einheiten[1][6] = rest / 500;
        rest = rest % 500;

        // 200
        einheiten[1][7] = rest / 200;
        rest = rest % 200;

        // 100
        einheiten[1][8] = rest / 100;
        rest = rest % 100;

        // 50
        einheiten[1][9] = rest / 50;
        rest = rest % 50;

        // 20
        einheiten[1][10] = rest / 20;
        rest = rest % 20;

        // 10
        einheiten[1][11] = rest / 10;
        rest = rest % 10;

        // 5
        einheiten[1][12] = rest / 5;
        rest = rest % 5;

        // 2
        einheiten[1][13] = rest / 2;
        rest = rest % 2;

        // 1
        einheiten[1][14] = rest / 1;
        rest = rest % 1;

       for (int i = 0; i < 15;) {
            System.out.println(einheiten[0][i] + ": " + einheiten[1][i]);
            i++;
        }
    }

    }


