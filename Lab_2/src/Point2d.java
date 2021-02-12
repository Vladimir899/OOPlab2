// двумерный класс точки
public class Point2d {
	private double xCoord; // координата X
	private double yCoord; // координата Y
	// конструктор инициализации
	public Point2d(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	// конструктор по умолчанию
	public Point2d() {
		this(0, 0); // вызов конструктора с двумя параметрами
	}
	public double getX() {
		return xCoord; // получение координаты X
	}
	public double getY() {
		return yCoord; // получение координаты Y
	}
	public void setX(double val) {
		xCoord = val; // установка значения координаты X
	}
	public void setY(double val) {
		yCoord = val; // установка значения координаты Y
	}
	// функция сравнения точек
	public boolean compare(Point2d p1) {
	    if ((p1.xCoord == xCoord) && (p1.yCoord == yCoord)) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
}