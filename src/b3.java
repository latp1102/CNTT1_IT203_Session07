public class b3 {
    public static boolean check(double score){
        return score >= 5.0;
    }
    public static double average(double s1, double s2, double s3){
        return (s1 + s2 + s3) / 3;
    }
    public static void main(String[] args) {
        double avg = b3.average(6,7,8);
        boolean check = b3.check(avg);
        System.out.println("Điểm tb: " + avg);
        if(check){
            System.out.println("Kết quả: đạt");
        }else {
            System.out.println("Kết quả: không đạt");
        }
    }
}
