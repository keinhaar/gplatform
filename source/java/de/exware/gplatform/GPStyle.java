package de.exware.gplatform;

public interface GPStyle
{
    public void setProperty(String name, String value);
    public String getProperty(String name);
    
    public default void setBackgroundColor(String col)
    {
        setProperty("backgroundColor", col);
    }

    public default String getBackgroundColor()
    {
        return getProperty("backgroundColor");
    }

    public default String getColor()
    {
        return getProperty("color");
    }
    
    public default void setColor(String color)
    {
        setProperty("color", color);
    }

    public default void setBorderColor(String color)
    {
        setProperty("borderColor", color);
    }
    
    public default void setBorderStyle(String style)
    {
        setProperty("borderStyle", style);
    }
    
    public default void setBorderWidth(int width)
    {
        setProperty("borderWidth", width + "px");
    }
    
    public default void clearWidth()
    {
        setProperty("width", "");
    }
    
    public default void clearHeight()
    {
        setProperty("height", "");
    }
    
    public default void setPosition(String position)
    {
        setProperty("position", position);
    }

    public default void setDisplay(String display)
    {
        setProperty("display", display);
    }

    public default void setVisibility(String visibility)
    {
        setProperty("visibility", visibility);
    }
    
    /**
     * Set left location in pixel.
     * @param left
     */
    public default void setLeft(int left)
    {
        setProperty("left", left + "px");
    }
    
    /**
     * Set top location in pixel.
     * @param top
     */
    public default void setTop(int top)
    {
        setProperty("top", top + "px");
    }

    /**
     * Set width in pixel.
     * @param width
     */
    public default void setWidth(double width)
    {
        setProperty("width", width + "px");
    }
    
    /**
     * Set height in pixel.
     * @param height
     */
    public default void setHeight(double height)
    {
        setProperty("height", height + "px");
    }

    public default int getLeft()
    {
        return getPixelValue(getProperty("left"));
    }

    public default int getTop()
    {
        return getPixelValue(getProperty("top"));
    }

    /**
     * Converts the given CSS pixel value into an integer
     * @param value
     * @return
     */
    public default int getPixelValue(String value)
    {
        String str = value;
        str = str.replace("px", "");
        int val = 0;
        try
        {
            val = Integer.parseInt(str);
        }
        catch(NumberFormatException ex)
        {
            
        }
        return val;
    }
    
    public default void setFontWeight(String weight)
    {
        setProperty("fontWeight", weight);
    }
    
    public default void setFontSize(float size)
    {
        setProperty("fontSize", size + "px");
    }

    public default void clearColor()
    {
        setProperty("color", "");
    }
    
    public default void setZIndex(int i)
    {
        setProperty("zIndex", "" + i);
    }
    
    public default void setTextAlign(String textAlign)
    {
        setProperty("textAlign", textAlign);
    }
    
    public default void setWidthInPercent(double width)
    {
        setProperty("width", width + "pct");
    }
    
    public default void setHeightInPercent(double height)
    {
        setProperty("height", height + "pct");
    }
    
    public default void setPadding(int padding)
    {
        setProperty("padding", padding + "px");
    }

    public default void setOverflow(String overflow)
    {
        setProperty("overflow", overflow);
    }
    
    public default void setPaddingLeft(int paddingLeft)
    {
        setProperty("paddingLeft", paddingLeft + "px");
    }
}
