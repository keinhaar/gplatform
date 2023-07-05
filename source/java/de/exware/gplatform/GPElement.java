package de.exware.gplatform;

import java.util.List;

import de.exware.gplatform.event.GPEvent;
import de.exware.gplatform.event.GPEventListener;

public interface GPElement
{
    public List<GPElement> getChildElements();

    public void setClassName(String classname);

    public void addClassName(String classname);

    public void removeClassName(String classname);

    public GPStyle getStyle();
    
    /**
     * Create a copy of the current Element
     * @param deep
     * @return
     */
    public GPElement cloneNode(boolean deep);

    public int getOffsetWidth();
    
    public int getOffsetHeight();
    
    public void removeChild(GPElement child);

    public void appendChild(GPElement child);

    /**
     * Get the absolute left position relative to the document.
     * @return
     */
    public int getAbsoluteLeft();

    /**
     * Get the absolute top position relative to the document.
     * @return
     */
    public int getAbsoluteTop();

    public void removeFromParent();

    abstract public void enabledEvents(GPEvent.Type ... eventTypes);

    abstract public GPEvent.Type[] getEnabledEvents();

    public void setEventListener(GPEventListener eventListener);

    public GPElement getParentElement();

    public String getClassName();

    public void removeAllChildren();

    public String getInnerText();

    public void setInnerHTML(String text);

    public void insertFirst(GPElement element);

    public String getInnerHTML();

    public void insertAfter(GPElement before, GPElement after);

    public void setTabIndex(int i);

    public void replaceChild(GPElement newChild, GPElement oldChild);

    public GPElement getChild(int i);

    public void setInnerText(String str);
    
    public void setAttribute(String name, String value);

    public String getPropertyString(String name);

    public int getPropertyInt(String name);

    public Object getPropertyObject(String name);
    
    public void setPropertyInt(String name, int value);
    
    public void focus();

    public int getClientWidth();
}
