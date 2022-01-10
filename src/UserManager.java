public class UserManager {
    public void Add(User user){
        System.out.println(user.getName() + " isimli kullanıcı eklendi.");
    }

    public void Delete(User user){
        System.out.println(user.getName() + " " + user.getLastname() + " kullanıcısı silindi");
    }

    public void IsEmpty(User user){

        if (user.getName()==null){
            System.out.println("Kullanıcı herhangi bir isme sahip değil");
        }
        else{
            System.out.println("Kullanıcı bir isme sahip ve ismi: " + user.getName());
        }

    }

}
