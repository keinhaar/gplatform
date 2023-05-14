package de.exware.gplatform.style;

public interface CSSRule
{

    int getInt(String name);

    void setPixel(String name, int value);

    String getColor(String name);

    String getProperty(String name);

    String getSelector() /*-{
        return this.selectorText;
    }-*/;

}
