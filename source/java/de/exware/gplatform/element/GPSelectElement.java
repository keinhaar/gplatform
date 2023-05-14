package de.exware.gplatform.element;

import de.exware.gplatform.GPElement;

public interface GPSelectElement extends GPElement
{

    int getSelectedIndex();

    void setSelectedIndex(int i);

    void clear();

    void add(GPOptionElement opt);

    void setDisabled(boolean b);
}
