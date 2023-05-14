package de.exware.gplatform;

import de.exware.gplatform.style.GPStyleSheet;
import de.exware.gplatform.timer.GPTimer;

/**
 * Entry Point for the concrete GPlatform implementations.
 * @author martin
 *
 */
abstract public class GPlatform
{
    private static GPlatform instance;
    
    protected GPlatform()
    {
        if(instance != null)
        {
            throw new RuntimeException("Duplicate initialization of GPlatform.");
        }
        instance = this;
    }
    
    /**
     * Shortcut for GPlatform.getInstance().getDocument().
     */
    public static GPDocument getDoc()
    {
        return instance.getDocument();
    }

    /**
     * Shortcut for GPlatform.getInstance().getWindow().
     */
    public static GPWindow getWin()
    {
        return instance.getWindow();
    }

    /**
     * Returns an instance of the webpage documment.
     * @return
     */
    abstract public GPDocument getDocument();

    abstract public GPWindow getWindow();

    public static GPlatform getInstance()
    {
        return instance;
    }

    abstract public double stringWidth(String font, String text);

    public abstract String getModuleBaseForStaticFiles();

    public abstract String getModuleBaseURL();

    public abstract double getDevicePixelRatio();
    
    public abstract GPStyleSheet getStyleSheet(int index);

    public abstract int getStyleSheetCount();
    
    public abstract GPTimer createTimer();
    
    public abstract void alert(String text);
    
    /**
     * Load some data from the Server with a simple GET request. This is async and should return a text representation
     * of the data (plain text, JSON, XML, BASE64..., but no binary data).
     * @param url The URL answered by the server.
     * @param callback The callback gets notified when tha data is available.
     */
    public abstract void loadData(String url, Callback callback);
    
    public interface Callback
    {
    	public void onSuccess(int statuscode, String fileData);
    	public void onError(Throwable t);
    }
    
    public abstract GPStorage getLocalStorage();
}
