public class Ex04 {
    public static void main(String[] args) {
        int[][] score = {{10,20,30},{40,50,60},{70,80,90}};
        int sum = 0;

        for(int i = 0 ; i < score.length ; i++) {
            for(int j = 0 ; j < score[i].length ; j++) {
                sum += score[i][j];
            }
        }
        System.out.println(sum);
    }
}
