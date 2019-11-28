package ua.Alexander.Romanov;

public class Main {

    public static void main(String[] args) {
        int a =10;
        int b =99;

       // System.out.println(rand);
	int [][] array =new int[8][5];
        for (int i=0;i < array.length;i++){
            for (int j=0;j < array[i].length;j++){
                int rand = (int) (( Math.random() * (b-a) ) +a );
                array[i][j]=rand;
            }
        }
        for (int i=0;i < array.length;i++,System.out.println()){
            for (int j=0;j < array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }}
    }
}