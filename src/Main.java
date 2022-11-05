public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Piyush", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String pName, int score){
        System.out.println("Player " + pName + " scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No Player, no score!");
        return 0;
    }
}