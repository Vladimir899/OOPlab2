
public class Point3d {
	private double xCoord; // координата X
    private double yCoord; // координата Y
    private double zCoord; // координата Z
    // конструктор инициализации
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // конструктор по умолчанию
    public Point3d () {
    	this(0, 0, 0); // вызов конструктора с трем€ параметрами
    }
    public double getX () {
        return xCoord; // получение координаты X
    }
    public double getY () {
        return yCoord; // получение координаты Y
    }
    public double getZ () {
        return zCoord; // получение координаты Z
    }
    public void setX (double val) {
        xCoord = val; // установка значени€ координаты X
    }
    public void setY (double val) {
        yCoord = val; // установка значени€ координаты Y
    }
    public void setZ (double val) {
        zCoord = val; // установка значени€ координаты Z
    }
    // функци€ сравнени€ точек
    public boolean compare (Point3d p1) {
        if ((p1.xCoord == xCoord) && (p1.yCoord == yCoord) && (p1.zCoord == zCoord)) {
            return true;
        }
        else {
            return false;
        }
    }
    // функци€ определени€ рассто€ний между точками
    public double distanceTo (Point3d p1) {
       return Math.round (Math.sqrt(Math.pow(p1.xCoord-xCoord,2) + Math.pow(p1.yCoord-yCoord,2) + Math.pow(p1.zCoord-zCoord,2)) * 100) / 100D;
    }
    // функци€ определени€ площади треугольника при помощи формулы √ерона
    public static double computeArea (Point3d p1, Point3d p2, Point3d p3) {
        // объ€вили стороны треугольника и полупериметр
        double a, b, c, p;
        // рассчитали стороны треугольника и полупериметр
        a = p1.distanceTo(p2);
        b = p2.distanceTo(p3);
        c = p3.distanceTo(p1);
        p = (a + b + c) / 2;
        return Math.sqrt (p * (p-a) * (p-b) * (p-c));
    }
}