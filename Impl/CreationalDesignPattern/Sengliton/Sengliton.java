package Sengliton;
class Sengliton{
    private static Sengliton instance = null;
    private Sengliton(){}


    public static Sengliton getInstance() 
    {
        // double-checked locking
        if(instance == null)  // avoid locking if instance is already created
        {
            synchronized(Sengliton.class) // thread safety ---- Synronization --- only one thread can enter
            {
                if(instance == null) // ensure that only one thread creates the instance
                    instance = new Sengliton();
            }
        }
        return instance;
    }

}