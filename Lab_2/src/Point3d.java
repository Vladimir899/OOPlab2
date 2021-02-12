
public class Point3d {
	private double xCoord; // ���������� X
    private double yCoord; // ���������� Y
    private double zCoord; // ���������� Z
    // ����������� �������������
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // ����������� �� ���������
    public Point3d () {
    	this(0, 0, 0); // ����� ������������ � ����� �����������
    }
    public double getX () {
        return xCoord; // ��������� ���������� X
    }
    public double getY () {
        return yCoord; // ��������� ���������� Y
    }
    public double getZ () {
        return zCoord; // ��������� ���������� Z
    }
    public void setX (double val) {
        xCoord = val; // ��������� �������� ���������� X
    }
    public void setY (double val) {
        yCoord = val; // ��������� �������� ���������� Y
    }
    public void setZ (double val) {
        zCoord = val; // ��������� �������� ���������� Z
    }
    // ������� ��������� �����
    public boolean compare (Point3d p1) {
        if ((p1.xCoord == xCoord) && (p1.yCoord == yCoord) && (p1.zCoord == zCoord)) {
            return true;
        }
        else {
            return false;
        }
    }
    // ������� ����������� ���������� ����� �������
    public double distanceTo (Point3d p1) {
       return Math.round (Math.sqrt(Math.pow(p1.xCoord-xCoord,2) + Math.pow(p1.yCoord-yCoord,2) + Math.pow(p1.zCoord-zCoord,2)) * 100) / 100D;
    }
    // ������� ����������� ������� ������������ ��� ������ ������� ������
    public static double computeArea (Point3d p1, Point3d p2, Point3d p3) {
        // �������� ������� ������������ � ������������
        double a, b, c, p;
        // ���������� ������� ������������ � ������������
        a = p1.distanceTo(p2);
        b = p2.distanceTo(p3);
        c = p3.distanceTo(p1);
        p = (a + b + c) / 2;
        return Math.sqrt (p * (p-a) * (p-b) * (p-c));
    }
}