package de.exware.gplatform.style;

import de.exware.gplatform.GPlatform;

public interface GPStyleSheet
{
    CSSRule getCSSRule(String selector);

    String getHref();

    /**
     * Allow to enable this stylesheet.
     * Be aware, that Stylesheets can only be enabled if they are preferred or alternative.
     * This Method will not have any effect on normal Stylesheets.
     * @param enabled
     */
    public void setEnabled(boolean enabled);
    
    /**
     * Returns a Stylesheet whos href ends with the given name.
     * @param name
     * @return
     */
    public static GPStyleSheet getStyleSheet(String name)
    {
        GPStyleSheet sheet = null;
        for(int i=GPlatform.getInstance().getStyleSheetCount()-1;i>=0;i--)
        {
            GPStyleSheet st = GPlatform.getInstance().getStyleSheet(i);
            if(st.getHref().endsWith(name))
            {
                sheet = st;
                break;
            }
        }
        return sheet;
    }

    public static String getColor(String selector, String property)
    {
        String col = null;
        CSSRule rule = null;
        for(int i=GPlatform.getInstance().getStyleSheetCount()-1;col == null && i>=0;i--)
        {            
            try
            {
                GPStyleSheet st = GPlatform.getInstance().getStyleSheet(i);
                rule = st.getCSSRule(selector);
                if(rule != null)
                {
                    col = rule.getColor(property);
                    if(col != null)
                    {
                        break;
                    }
                }
            }
            catch(Exception ex)
            {
//                ex.printStackTrace();
            }
        }
        return col;
    }

    public static String getProperty(String selector, String property)
    {
        String prop = null;
        CSSRule rule = null;
        for(int i=GPlatform.getInstance().getStyleSheetCount()-1;prop == null && i>=0;i--)
        {
            try
            {
                GPStyleSheet st = GPlatform.getInstance().getStyleSheet(i);
                rule = st.getCSSRule(selector);
                if(rule != null)
                {
//                    String href = st.getHref();
                    prop = rule.getProperty(property);
                    if(prop != null)
                    {
                        break;
                    }
                }
            }
            catch(Exception ex)
            {
            }
        }
        return prop;
    }

    public static Integer getInt(String selector, String property)
    {
        Integer prop = null;
        CSSRule rule = null;
        for(int i=GPlatform.getInstance().getStyleSheetCount()-1;prop == null && i>=0;i--)
        {
            try
            {
                GPStyleSheet st = GPlatform.getInstance().getStyleSheet(i);
//                String href = st.getHref();
                rule = st.getCSSRule(selector);
                if(rule != null)
                {
                    prop = rule.getInt(property);
                    if(prop != null)
                    {
                        break;
                    }
                }
            }
            catch(Exception ex)
            {
            }
        }
        return prop;
    }

    public static void setPixel(String selector, String property, int value)
    {
        Integer prop = null;
        CSSRule rule = null;
        for(int i=GPlatform.getInstance().getStyleSheetCount()-1;prop == null && i>=0;i--)
        {
            try
            {
                GPStyleSheet st = GPlatform.getInstance().getStyleSheet(i);
//                String href = st.getHref();
                rule = st.getCSSRule(selector);
                if(rule != null)
                {
                    prop = rule.getInt(property);
                    if(prop != null)
                    {
                        rule.setPixel(property, value);
                    }
                }
            }
            catch(Exception ex)
            {
            }
        }
    }

}
