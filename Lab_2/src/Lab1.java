import java.util.Scanner;
// ������� �����, � ������� �������� � �������� �����
public class Lab1 {
    public static void main(String[] args) {
        // ������ � ������� � ���������� ������������1
        Point3d[] points = new Point3d[3];
        // ��� ���������� ������
        Scanner scanner = new Scanner(System.in);
        String value;
        double coord;
        int len = 3; // ���-�� �����
        // ��� �� ����� � ��������� ���������� �����
        for(int i = 0; i<len; i++){
            points[i] = new Point3d();
            // x
            System.out.printf("������� ���������� X %d-� �����: ", i+1);
            value = scanner.nextLine();
            coord = Double.valueOf(value);
            points[i].setX(coord);
            // y
            System.out.printf("������� ���������� Y %d-� �����: ", i+1);
            value = scanner.nextLine();
            coord = Double.valueOf(value);
            points[i].setY(coord);
            // z
            System.out.printf("������� ���������� Z %d-� �����: ", i+1);
            value = scanner.nextLine();
            coord = Double.valueOf(value);
            points[i].setZ(coord);
        }
        // ���������� ����� �� ��������� ����� �����
        // ��������� ��������� �����. ���������� �������, ��� ��� �� �����
        boolean eql = false;
        // ��������� ��� ����� �� ���������
        if (points[0].compare(points[1])) {
            eql = true;
            System.out.printf("������! ����� 1 � ������������ (%f;%f;%f) � ����� 2 � ������������ (%f;%f;%f) �����",
                    points[0].getX(), points[0].getY(), points[0].getZ(), points[1].getX(), points[1].getY(), points[1].getZ());
        }
        if (points[1].compare(points[2])) {
            eql = true;
            System.out.printf("������! ����� 2 � ������������ (%f;%f;%f) � ����� 3 � ������������ (%f;%f;%f) �����",
                    points[1].getX(), points[1].getY(), points[1].getZ(), points[2].getX(), points[2].getY(), points[2].getZ());
        }
        if (points[2].compare(points[0])) {
            eql = true;
            System.out.printf("������! ����� 3 � ������������ (%f;%f;%f) � ����� 1 � ������������ (%f;%f;%f) �����",
                    points[2].getX(), points[2].getY(), points[2].getZ(), points[0].getX(), points[0].getY(), points[0].getZ());
        }
        // ���� � ��� ��� �� ���� �����, �� ������ ���� ����� - ������� ������� ������������
        if (eql == false){
            System.out.printf("������� ������������, ������������� ����� ������� ����� %f", Point3d.computeArea(points[0], points[1], points[2]));
        }
    }
}