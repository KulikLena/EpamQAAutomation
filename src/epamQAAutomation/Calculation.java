package epamQAAutomation;

import java.util.List;

public interface Calculation {
	//���������, �������������, ��� ������ ������ ������� ������������ ����� ��������� 
	// ����� ����� ������� � �������� ��� ������� �������� (����� ��� ������), �� �������� �������
	public double summation(List<Estimates> list);
	public double[] relativeWeight (List<Estimates> list);
}
