package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPCanvasElement extends GPElement
{

    void setWidth(int width);

    void setHeight(int height);

    GPContext2d getContext2d();
}
