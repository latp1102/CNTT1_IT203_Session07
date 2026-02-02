public class b5 {
    private static final double MAX_SCORE = 10;
    private static final double MIN_SCORE = 0;
    public static void main(String[] args) {
        System.out.println("max: " + b5.MAX_SCORE);
        System.out.println("min: " + b5.MIN_SCORE);
        // b5.MAX_SCORE = 200; // Lỗi biên dịch vì final 
        // là định nghĩa hằng số không được phép thay đổi
        // Lỗi: cannot assign a value to final variable MAX_SCORE
    }
}
