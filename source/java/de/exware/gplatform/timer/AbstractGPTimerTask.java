package de.exware.gplatform.timer;

public abstract class AbstractGPTimerTask
    implements GPTimerTask
{
    private boolean canceled;
    
    @Override
    public void cancel()    
    {
        canceled = true;
    }

    @Override
    public boolean isCanceled()
    {
        return canceled;
    }
}
