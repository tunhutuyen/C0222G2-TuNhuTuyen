package ss10_danh_sach.bai_tap.TrienKhaiMyLinkedListTheoThuVien;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList =new MyLinkedList<>();
        Student student1 = new Student(1,"nam");
        Student student2 = new Student(2,"hoa");
        Student student3 = new Student(3,"quả");
        Student student4 = new Student(4,"banh");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.addLast(student4);

        //myLinkedList.remove(student4);

        //MyLinkedList<Student> cloneMyLinkedList = myLinkedList.clone();
        System.out.println(myLinkedList.constains(student2));
        System.out.println(myLinkedList.indexOf(student3));
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.print(student.getId()+" ");
            System.out.print(student.getName()+"\n");
        }
//        for (int i = 0; i < cloneMyLinkedList.size(); i++) {
//            Student student = (Student) cloneMyLinkedList.get(i);
//            System.out.print(student.getName()+"\n");
//        }
    }
}
