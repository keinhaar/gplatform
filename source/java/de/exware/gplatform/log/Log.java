package de.exware.gplatform.log;

public interface Log
{
    public static final int FATAL_ERROR = 1;
    public static final int ERROR = 1 << 1;
    public static final int WARNING = 1 << 2;
    public static final int DEBUG = 1 << 3;
    public static final int INFO = 1 << 4;

    default public void log(int level, String str)
    {
        log(level, str, null);
    }

    public void log(int level, String str, Throwable t);
    
    default public void debug(String str)
    {
        debug(str, null);
    }

    default public void debug(String str, Throwable t)
    {
        log(DEBUG, str, t);
    }

    default public void warn(String str)
    {
        warn(str, null);
    }

    default public void warn(String str, Throwable t)
    {
        log(WARNING, str, t);
    }
    
    default public void error(String str)
    {
        error(str, null);
    }

    default public void error(String str, Throwable t)
    {
        log(ERROR, str, t);
    }

    default public void fatal(String str)
    {
        fatal(str, null);
    }

    default public void fatal(String str, Throwable t)
    {
        log(FATAL_ERROR, str, t);
    }

    default public void info(String str)
    {
        info(str, null);
    }

    default public void info(String str, Throwable t)
    {
        log(INFO, str, t);
    }
    
    public void addLevel(int level);
}
