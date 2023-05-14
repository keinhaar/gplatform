package de.exware.gplatform.timer;

import de.exware.gplatform.GPlatform;

public interface GPTimer
{
    public void schedule(GPTimerTask task, int delay);

    public void scheduleRepeating(GPTimerTask task, int delay, int interval);
    
    public void cancel();
    
    public static GPTimer createInstance()
    {
        return GPlatform.getInstance().createTimer();
    }
}
