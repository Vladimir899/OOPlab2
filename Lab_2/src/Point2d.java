// ��������� ����� �����
public class Point2d {
	private double xCoord; // ���������� X
	private double yCoord; // ���������� Y
	// ����������� �������������
	public Point2d(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	// ����������� �� ���������
	public Point2d() {
		this(0, 0); // ����� ������������ � ����� �����������
	}
	public double getX() {
		return xCoord; // ��������� ���������� X
	}
	public double getY() {
		return yCoord; // ��������� ���������� Y
	}
	public void setX(double val) {
		xCoord = val; // ��������� �������� ���������� X
	}
	public void setY(double val) {
		yCoord = val; // ��������� �������� ���������� Y
	}
	// ������� ��������� �����
	public boolean compare(Point2d p1) {
	    if ((p1.xCoord == xCoord) && (p1.yCoord == yCoord)) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
}