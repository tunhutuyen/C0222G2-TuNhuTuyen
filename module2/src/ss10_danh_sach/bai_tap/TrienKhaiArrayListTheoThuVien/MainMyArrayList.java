package ss10_danh_sach.bai_tap.TrienKhaiArrayListTheoThuVien;

public class MainMyArrayList {
    public static class Student{
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
    public static void main(String[] args) {
        Student student1 = new Student(1,"hoa");
        Student student2 = new Student(3,"quả");
        Student student3 = new Student(2,"trái");
        Student student4 = new Student(5,"cây");
        Student student5 = new Student(6,"thụ");


        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(2,student4);
        studentMyList.add(student3);

        //studentMyList.clear();
        studentMyList.add(student5);
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getName());
        }
        System.out.println(studentMyList.size());
    }
}
