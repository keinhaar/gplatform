package de.exware.gplatform;

import de.exware.gplatform.log.LogFactory;
import de.exware.gplatform.style.GPStyleSheet;
import de.exware.gplatform.timer.GPTimer;

/**
 * Entry Point for the concrete GPlatform implementations.
 * @author martin
 *
 */
abstract public class GPlatform
{
    public enum Browser {
        UNDEFINED, OPERA, EDGE, CHROME, SAFARI, FIREFOX, INTERNET_EXPLORER
    }
	
    public enum VirtualMachineProvider {
        UNDEFINED, GWT, TEAVM
    }
	
    private static GPlatform instance;
    
    protected GPlatform()
    {
        if(instance != null)
        {
            throw new RuntimeException("Duplicate initialization of GPlatform.");
        }
        instance = this;
        LogFactory.getLog(getClass()).debug("GPlatform initialized: " + instance.getClass().getName());
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

    /**
     * Return the GPWindow Wrapper around the browser window.
     * @return
     */
    abstract public GPWindow getWindow();

    /**
     * Return the single instance of the GPlatform.
     * @return
     */
    public static GPlatform getInstance()
    {
        return instance;
    }

    /**
     * @param font
     * @param text
     * @return the width in pixel of the given text when font is used.
     */
    abstract public double stringWidth(String font, String text);

    public abstract String getModuleBaseForStaticFiles();

    /**
     * @return the URL from which the app is loaded
     */
    public abstract String getModuleBaseURL();

    /**
     * 
     * @return
     */
    public abstract double getDevicePixelRatio();
    
    /**
     * Return the Stylesheet at index .
     * @param index
     * @return
     */
    public abstract GPStyleSheet getStyleSheet(int index);

    /**
     * Return the number of Stylesheets 
     * @return
     */
    public abstract int getStyleSheetCount();
    
    /**
     * Create a GPTimer to allow to run deferred commands.
     * @return
     */
    public abstract GPTimer createTimer();
    
    /**
     * Open a Browser popup -> window.alert().
     * @param text
     */
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
    
    /**
     * @return a GPStorage instance representing the local browser storage.
     */
    public abstract GPStorage getLocalStorage();

    /**
     * Clear any Text selection on the HTML Page.
     */
    public abstract void clearSelection();
    
    public abstract Browser getBrowser();
    
    public abstract VirtualMachineProvider getVirtualMachineProvider();
}
