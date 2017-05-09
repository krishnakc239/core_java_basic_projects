package static_non_static_members;

/**
 * Created by krishna KC on 11/23/2016.
 */
public class StudentService {
    public static void main(String[] args) {
        Student st= new Student();
        System.out.println(st.name);
        st.name="xyz";
        Student student= new Student();
        System.out.println(student.name);
    }
}
