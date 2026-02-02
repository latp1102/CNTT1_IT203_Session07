//public class b1 {
//    private String studentId;
//    private String studentName;
//    private static int totalStudent = 0;
//    public b1(String studentId, String studentName){
//        this.studentId = studentId;
//        this.studentName = studentName;
//        totalStudent++;
//    }
//    public void display(){
//        System.out.println("Mã sv: " + studentId);
//        System.out.println("Tên sv: " + studentName);
//    }
//    public static void print(){
//        System.out.println("Tổng sv:" + totalStudent);
//    }
//    public static void main(String[] args) {
//        b1 s1 = new b1("SV001", "A");
//        b1 s2 = new b1("SV002", "B");
//        s1.display();
//        System.out.println();
//        s2.display();
//        System.out.println();
//        b1.print();
//    }
//}

public class b1 {
    static class Student {
        private String studentId;
        private String studentName;
        private static int totalStudent;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            totalStudent++;
        }
        public void display() {
            System.out.println("Mã sv: " + studentId);
            System.out.println("Tên sv: " + studentName);
        }
        public static void print() {
            System.out.println("Tổng sv: " + totalStudent);
        }
        public static void main(String[] args) {
            Student s1 = new Student("1", "A");
            Student s2 = new Student("2", "B");
            s1.display();
            s2.display();
            Student.print();
        }
    }
}