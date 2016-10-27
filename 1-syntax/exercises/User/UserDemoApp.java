public class UserDemoApp {
  public static void main(String[] args){
    User chewie = new User("Chewbacca");

    System.out.println(chewie.userName);
    System.out.println(User.userName);

    User vader = new User("Vader");

    System.out.println("This is vader: " + vader.userName);
    System.out.println("This is chewie: " + chewie.userName);
    System.out.println("This is user: " + User.userName);
  }
}
