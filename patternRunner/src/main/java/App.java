public class App {
    public static void main(String[] args) {

      SingletonImplementation single = SingletonImplementation.getInstance();
      System.out.println(single);

      SingletonImplementation single2 = SingletonImplementation.getInstance();
      System.out.println(single2);


    }
}
