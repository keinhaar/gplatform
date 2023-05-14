package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPTextAreaElement extends GPElement
{

    void setCols(int columns);

    void setRows(int rows);

    void setDisabled(boolean b);

    String getValue();

    void setValue(String text);

    int getCols();

    int getRows();
}
