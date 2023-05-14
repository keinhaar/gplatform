package de.exware.gplatform.timer;

public interface GPTimerTask
{
    public void execute();
    
    public void cancel();

    public boolean isCanceled();
}
