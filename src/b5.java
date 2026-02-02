public class b5 {
    private static final double MAX_SCORE = 10;
    private static final double MIN_SCORE = 0;
    public static void main(String[] args) {
        double score = 4;
        if(score >= b5.MIN_SCORE && score <= b5.MAX_SCORE){
            System.out.println("Điểm hợp lệ");
        }else {
            System.out.println("không hợp lệ");
        }
    }
}
