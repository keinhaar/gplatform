package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPImageElement extends GPElement
{
    void setSrc(String url);

    void setWidth(int iconWidth);

    void setHeight(int iconHeight);

}
