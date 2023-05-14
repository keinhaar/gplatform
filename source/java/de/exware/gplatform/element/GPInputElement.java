package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPInputElement extends GPElement
{
    String getValue();

    void setValue(String text);

    boolean isChecked();

    void setChecked(boolean sel);

    void setDisabled(boolean b);

    void setDefaultChecked(boolean sel);

    void setSize(int length);

    int getSize();
}
