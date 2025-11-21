package h1;

public class H1_main { 
    public static void main(String[] args) {
    int[] myArray = {5, 6, 7, 10} ;
    int a,b;
    a = myArray[0];
    myArray[0] = myArray[3];
    myArray[3] = a;

    b = myArray[1];
    myArray[1] = myArray[2];
    myArray[2] = b;

   for (int i = 0; i < myArray.length;) {
        System.out.print(myArray[i] + " ");
        i++;

    }

}
}
    

