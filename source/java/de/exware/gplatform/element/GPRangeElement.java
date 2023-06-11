package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPRangeElement extends GPElement
{
    default public void setMinimum(int min)
    {
        setPropertyInt("min", min);
    }

    default public void setMaximum(int max)
    {
        setPropertyInt("max", max);
    }

    default public void setValue(int value)
    {
        setPropertyInt("value", value);
    }

    default public int getValueInt()
    {
        
        return getPropertyInt("value");
    }

    default public int getMaximum()
    {
        return getPropertyInt("max");
    }

    default public int getMinimum()
    {
        return getPropertyInt("min");
    }
}
