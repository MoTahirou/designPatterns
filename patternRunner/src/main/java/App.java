public class App {
    public static void main(String[] args) {

      SingletonImplementation single = SingletonImplementation.getInstance();
      System.out.println(single);

      SingletonImplementation single2 = SingletonImplementation.getInstance();
      System.out.println(single2);

      Sandwich.Builder builder = new Sandwich.Builder();
      Sandwich sandwich = builder
              .bread("Italian")
              .lettuce("Spinach")
              .mayo("Vegan")
              .tomato("None")
              .build();

      System.out.println(sandwich.getBread());
    }
}
