package h2;

public class H2_main {
    public static void main(String[] args) {
        
        int n = 299;
        int digits = 0;

        int[] a = {0,0,0,0,0,0,0,0,0};
        int index = 8;

        
        int n_copy = n;
        if (n_copy == 0) digits = 1;
        else {
            while (n_copy > 0) {
                digits++;
                n_copy = n_copy / 10;
            }
        }

    
        int n_copy_2 = n;
        while (n_copy_2 > 0) {
            a[index] = n_copy_2 % 10;
            n_copy_2 = n_copy_2 / 10;
            index--;
        }

    
        System.out.println("digits = " + digits);

        for (int i = 0; i < a.length;) {
        System.out.print(a[i] + " ");
        i++;
        
        }
}

}
