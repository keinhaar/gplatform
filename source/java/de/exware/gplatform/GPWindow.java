package de.exware.gplatform;

public interface GPWindow
{
    int getClientWidth();

    int getClientHeight();
    
    public String getComputedStyleProperty(GPElement element, String propName);
}
