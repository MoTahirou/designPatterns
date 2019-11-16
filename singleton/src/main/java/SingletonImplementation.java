public class SingletonImplementation {

    //Volatile implements a block on access making sure that the singleton is thread safe
    private static volatile SingletonImplementation instance;

    //Prevent client creating their own instances
    private SingletonImplementation() {
        if (instance != null){
            throw  new RuntimeException("Use getInstance()");
        }
    }

    //Only way to get an instance
    public static SingletonImplementation getInstance() {
        //Lazy loading
        if(instance == null) {
            //Thread safety by synchronizing access
            synchronized (SingletonImplementation.class) {
               // result = instance;
                if (instance == null) {
                   instance = new SingletonImplementation();
                }
            }
        }

        return instance;
    }
}
