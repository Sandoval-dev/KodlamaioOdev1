public class InstructorManager extends UserManager{
    @Override
    public void Add(User user) {
        System.out.println(user.getName() + " isimli eğitmen eklendi");
    }

    @Override
    public void IsEmpty(User user) {
        if (user.getName()==null){
            System.out.println("Eğitmen herhangi bir isme sahip değil");
        }
        else{
            System.out.println("Eğitmen bir isme sahip ve ismi: " + user.getName());
        }
    }

    @Override
    public void Delete(User user) {
     System.out.println(user.getName() + " " + user.getLastname() + " eğitmeni silindi");
    }
}
