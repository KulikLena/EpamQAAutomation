package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

/* ���������� ������� - ������� ������������. ��������� ���������� ������ ����������� ������� ������������,
 * ������� ����������� � ��������� : ����� �� ������ (Estimates) ������� �� �������� �������� ������� 
 * (Consolidated Estimate) � ��������� ���� (Local estimates). � ���� ������� ������� ������� ������ ������� 
 * �� ��������� ����, � ��������� ����� ������� �� ������� (Modules)
 *  */

public class Estimates implements Calculation {
	private String nameOfTheObject;
	private String priceLevel;
	final String mainCurrency = "Belarussian rubles";
	final String standartUnit = "USD";
	final double exchangeRate = 2.02;

	public Estimates() {
		nameOfTheObject = "";
		priceLevel = "01.01.2001";
	}

	// ������� � �������
	public String getNameOfTheObject() {
		return nameOfTheObject;
	}

	public void setNameOfTheObject(String nameOfTheObject) {
		this.nameOfTheObject = nameOfTheObject;
	}

	public String getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(String priceLevel) {
		this.priceLevel = priceLevel;
	}

	// ������������ ����� (������� ��� ���������) � ���� ������ �������� (���������
	// ���� ��� �������)
	public List<Estimates> composition(List<Estimates> items) {
		return null;
	}

	// �������� ���������� �� ����������� ������ � ������
	public double currencyRecosting(Estimates ob) throws Exception {
		List<Estimates> list = new ArrayList<Estimates>();
		List<Estimates> result = ob.composition(list);
		double cost = summation(list);
		double costInStandartUnit = cost / ob.exchangeRate;
		return costInStandartUnit;
	}

	@Override
	public double summation (List<Estimates> list) {

		return 0;
	}

	@Override
	public double[] relativeWeight(List<Estimates> list) {

		return null;
	}

}
