package de.exware.gplatform.log;

import java.util.Date;

/**
 * Simple default logger, to log to console.
 */
public class DefaultLog implements Log
{
    private int level;
    private String name;
    
    public DefaultLog(String name)
    {
        this.name = name;
    }

    @Override
    public void log(int level, String str, Throwable t)
    {
        if((this.level & level) > 0)
        {
            String message = "" + new Date() + " " + getLevelName(level) + " [" + getName() + "] " + str; 
            System.out.println(message);
            if(t != null)
            {
                t.printStackTrace(System.out);
            }
        }
    }
    
    @Override
    public void addLevel(int level)
    {
        this.level = this.level | level; 
    }

    protected int getLevel()
    {
        return level;
    }

    private String getLevelName(long level)
    {
        String name = "unknown";
        if(level == Log.DEBUG)
        {
            name = "DEBUG";
        }
        else if(level == Log.WARNING)
        {
            name = "WARN ";
        }
        else if(level == Log.ERROR)
        {
            name = "ERROR";
        }
        else if(level == Log.INFO)
        {
            name = "INFO ";
        }
        else if(level == Log.FATAL_ERROR)
        {
            name = "FATAL";
        }
        return name;
    }

    protected String getName()
    {
        return name;
    }

}
