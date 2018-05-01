package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

public class EstimatesTest {

	public static void main(String[] args) {
		// ������� ������
		Estimates object = new Estimates();
		object.setNameOfTheObject("Residential building N1");
		object.setPriceLevel("01.01.2018");

		// ������� ��������� ����� �� �������
		List<Estimates> modules = new ArrayList<Estimates>();
		List<Estimates> locEs = new ArrayList<Estimates>();
		((Estimates) locEs).composition(modules);

		// ������� ������������ ������� �����
		ConsolidatedEstimate consEst = ConsolidatedEstimate.getInstance();
		consEst.composition(locEs);
		
		//������������� ������� ����� � ������
		try {
			consEst.currencyRecosting(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//������������ �������� ��� ������ ��������� ����� � ������� ������� 
		consEst.relativeWeight(locEs);
			
	}

}
