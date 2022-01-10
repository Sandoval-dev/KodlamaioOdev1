public class Main {
    public static void main(String[] args){
        User user=new User();
        user.setId(1);
        user.setName("Hatice");
        user.setLastname("Erdek");
        user.setTcno("12345678901");
        user.setTelefonNo("05427845932");
        Student student=new Student();
        student.setId(1);
        student.setName("Osman");
        Instructor instructor=new Instructor();
        instructor.setName("Engin");


      UserManager userManager=new UserManager();
      StudentManager studentManager=new StudentManager();
      InstructorManager instructorManager=new InstructorManager();

      userManager.Add(user);
      studentManager.Add(student);
      instructorManager.Add(instructor);
      studentManager.IsEmpty(student);
      instructorManager.Delete(instructor);


    }
}
