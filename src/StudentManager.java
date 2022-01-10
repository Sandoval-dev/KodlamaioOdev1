public class StudentManager extends UserManager{
    @Override
    public void Add(User user) {
        System.out.println(user.getName() + " isimli öğrenci eklendi.");
    }

    @Override
    public void Delete(User user) {
        System.out.println(user.getName() + " " + user.getLastname() + " öğrenicisi silindi");
    }

    @Override
    public void IsEmpty(User user) {
        if (user.getName()==null){
            System.out.println("Öğrenci herhangi bir isme sahip değil");
        }
        else{
            System.out.println("Öğrenci bir isme sahip ve ismi: " + user.getName());
        }
    }
}
