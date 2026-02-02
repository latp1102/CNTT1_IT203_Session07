public class b4 {
    private String studentName;
    private static double classFund = 0;
    public b4(String studentName){
        this.studentName = studentName;

    }
    public void payFull(double amount){
        classFund += amount;
        System.out.println(studentName + " đóng" + amount + " vào quỹ");
    }
    public static void display(){
        System.out.println("Tổng quỹ: " + classFund);
    }
    public static void main(String[] args) {
        b4 s1 = new b4("A");
        b4 s2 = new b4("B");
        s1.payFull(10);
        s2.payFull(10);
        b4.display();
    }
}
