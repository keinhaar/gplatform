package de.exware.gplatform;

import de.exware.gplatform.element.GPCanvasElement;
import de.exware.gplatform.element.GPImageElement;
import de.exware.gplatform.element.GPInputElement;
import de.exware.gplatform.element.GPOptionElement;
import de.exware.gplatform.element.GPRangeElement;
import de.exware.gplatform.element.GPSelectElement;
import de.exware.gplatform.element.GPTextAreaElement;

public interface GPDocument
{
    public GPElement getElementById(String elementId);
    
    public GPElement createElement(String tagName);
    
    public default GPElement createDivElement()
    {
        return createElement("div");
    }

    public GPCanvasElement createCanvasElement();

    public GPElement getBody();

    public GPImageElement createImageElement();

    public GPInputElement createCheckInputElement();

    public GPSelectElement createSelectElement();

    public GPOptionElement createOptionElement();

    public GPInputElement createRadioInputElement(String string);

    public GPTextAreaElement createTextAreaElement();

    public GPInputElement createTextInputElement();

    public GPInputElement createPasswordInputElement();

    public GPRangeElement createRangeElement();
}
