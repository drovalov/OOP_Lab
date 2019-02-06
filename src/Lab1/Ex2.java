package Lab1;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) (Math.random()*25);

        }
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>10){
                System.out.println(arr[i]);
            }

        }
    }
}
