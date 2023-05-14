package de.exware.gplatform.element;

public interface GPContext2d
{
    void setTransform(double i, double j, double k, double l, double m, double n);

    void save();

    void translate(double d, double e);

    void moveTo(double x1, double y1);

    void lineTo(int x2, int y2);

    void stroke();

    void restore();

    void rect(int x, int y, int width, int height);

    void beginPath();

    void bezierCurveTo(double x, double d, double e, double y, double xm, double y2);

    void fill();

    void fillRect(int x, int y, int width, int height);

    void fillText(String text, int x, int y);

    void setStrokeColor(String hexColor);

    void setFillColor(String hexColor);

    void rotate(double i);

    void scale(double x, double y);

    void setFont(String cssFontDescription);

    public void drawImage(GPImageElement imageElement, double x, double y);

    void drawImage(GPImageElement imageElement, double x, double y, double w, double h);

    public void drawImage(GPImageElement imageElement, double srcX, double srcY, double srcH, double srcW, double x, double y, double w, double h);
}
