package de.exware.gplatform.log;

public class LogFactory
{
    private static LogFactory instance = new LogFactory();
    private int defaultLogLevel = Log.DEBUG;
    
    /**
     * Subclasses will automatically be set as instance by calling their constructor.
     */
    public LogFactory()
    {
        instance = this;
    }
    
    public static Log getLog(Class clazz)
    {
        return getLog(clazz.getName());
    }

    public static Log getLog(String name)
    {
        Log log = instance.createLog(name);
        log.addLevel(instance.defaultLogLevel);
        return log;
    }

    protected Log createLog(String name)
    {
        return new DefaultLog(name);
    }
}
