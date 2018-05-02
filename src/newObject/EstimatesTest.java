package newObject;

import java.util.ArrayList;
import java.util.List;

import source.Estimates;
import source.MyException;

public class EstimatesTest {

	public static void main(String[] args) {
		// создаем объект строительства
		Estimates object = new Estimates();
		object.setNameOfTheObject("Residential building N1");
		object.setPriceLevel("01.01.2018");
		System.out.println("Объект "+object.getNameOfTheObject()+" создан. Уровень цен на "+object.getPriceLevel());

		// предполагаем, что у нас есть список готовых модулей
		List<Estimates> modules = new ArrayList<Estimates>();
		// создаем 6 локальных смет 
		List<Estimates> locEs = new ArrayList<Estimates>();
		locEs.add(new LocalEstimates());
		locEs.get(0).composition(modules);
		locEs.get(0).relativeWeight(modules);
		System.out.println("Рассчитан удельный вес модулей первой локальной сметы");
		locEs.get(0).summation(modules);
		System.out.println("Проиведено суммирование по модулям");
		locEs.add(new LocalEstimates());
		locEs.get(1).composition(modules);
		locEs.add(new LocalEstimates());
		locEs.get(2).composition(modules);
		locEs.add(new LocalEstimates());
		locEs.get(3).composition(modules);
		locEs.add(new LocalEstimates());
		locEs.get(4).composition(modules);
		locEs.add(new LocalEstimates());
		locEs.get(5).composition(modules);
		System.out.println("Локальные сметы созданы");
		
		// создаем единственную сводную смету
		ConsolidatedEstimate consEst = ConsolidatedEstimate.getInstance();
		consEst.composition(locEs);
		System.out.println("Сводная смета создана");
		
		//производим пересчет сводной сметы в валюту
		try {
			consEst.currencyRecosting(object, false);
		} catch (MyException e) {
			System.out.println(e.message);
		}
		
		//рассчитываем удельный вес локальных смет в составе сводной
		consEst.relativeWeight(locEs);
		System.out.println("Рассчитан удельный вес локальных смет в составе сводной сметы");
			
	}

}
