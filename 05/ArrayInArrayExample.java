public class ArrayInArrayExample {
    public static void main(String[] args){
        int[][] mathScores=  new int[2][3];
        for(int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++){
                System.out.println("mathScores["+i+"]["+k+"]="
                +mathScores[i][k]);
            }
        }
    
    int[][] javaScores = {{95, 80}, {92, 96, 80}};
    for(int i=0; i<javaScores.length; i++){
        for(int k=0; k<javaScores[i].length; k++){
            System.out.println("javaScores["+i+"]["+k+"]="
            +javaScores[i][k]);
        }
    }
}
}
