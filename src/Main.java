public class Main {
    public static void main(String[] args) {
        String student_1 = "Ali";
        String student_2 = "Mehmet";
        String student_3 = "Ahmet";
        String student_4 = "Hüseyin";

        System.out.println(student_1);
        System.out.println(student_2);
        System.out.println(student_3);
        System.out.println(student_4);

        System.out.println("---------------------------------------");

        String[] students = new String[4];
        students[0] = "Ali";
        students[1] = "Mehmet";
        students[2] = "Ahmet";
        students[3] = "Hüseyin";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("------------------------------------------");
        for (String student:students){
            System.out.println(student);
        }
    }
}