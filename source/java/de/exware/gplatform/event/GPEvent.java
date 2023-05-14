package de.exware.gplatform.event;

import java.util.List;

public interface GPEvent
{
    public Type getType();

    public enum Type
    {
        ONMOUSEOVER
        , ONMOUSEOUT
        , ONCLICK
        , ONCONTEXTMENU
        , ONDBLCLICK
        , ONMOUSEDOWN
        , ONMOUSEUP
        , ONMOUSEMOVE
        , ONMOUSEWHEEL
        , ONTOUCHSTART
        , ONTOUCHMOVE
        , ONTOUCHEND
        , ONKEYDOWN
        , ONKEYUP
        , ONKEYPRESS
        , ONFOCUS
        , ONCHANGE
        , ONLOAD
        , ONERROR
    }

    public enum Button
    {
        BUTTON_LEFT
        , BUTTON_MIDDLE
        , BUTTON_RIGHT
    }

    public void preventDefault();

    public void stopPropagation();

    public boolean getShiftKey();

    public boolean getAltKey();

    public boolean getCtrlKey();

    public int getClientX();

    public int getClientY();

    public Button getButton();

    public int getKeyCode();

    public int getCharCode();

    public int getMouseWheelVelocityY();

    public List<GPTouch> getTouches();

    public List<GPTouch> getChangedTouches();
    
}
