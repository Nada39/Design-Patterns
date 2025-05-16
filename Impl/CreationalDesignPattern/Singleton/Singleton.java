package Singleton;

// SOLID principles: 
// single responsipility violation -> Manages both instantiation and behavior
// Dependency inversion violation  -> controls instantiation rather than relying on dependency injection.


class Singleton{
    private static Singleton instance = null;
    private Singleton(){}


    public static Singleton getInstance() 
    {
        // double-checked locking
        if(instance == null)  // avoid locking if instance is already created
        {
            synchronized(Singleton.class) // thread safety ---- Synronization --- only one thread can enter
            {
                if(instance == null) // ensure that only one thread creates the instance
                    instance = new Singleton();
            }
        }
        return instance;
    }

}