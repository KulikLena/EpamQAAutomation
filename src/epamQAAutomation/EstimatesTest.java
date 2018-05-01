package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

public class EstimatesTest {

	public static void main(String[] args) {
		// создаем объект
		Estimates object = new Estimates();
		object.setNameOfTheObject("Residential building N1");
		object.setPriceLevel("01.01.2018");

		// создаем локальные сметы из модудей
		List<Estimates> modules = new ArrayList<Estimates>();
		List<Estimates> locEs = new ArrayList<Estimates>();
		((Estimates) locEs).composition(modules);

		// создаем единственную сводную смету
		ConsolidatedEstimate consEst = ConsolidatedEstimate.getInstance();
		consEst.composition(locEs);
		
		//пересчитываем сводную смету в валюту
		try {
			consEst.currencyRecosting(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//рассчитываем удельный вес каждой локальной сметы в составе сводной 
		consEst.relativeWeight(locEs);
			
	}

}
