package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

/*Предметная модель - сметная документация на строительство объекта, состоящая из сводной сметы (ConsolidatedEstimate)
 * локальных смет (LocalEstimates) и модулей (Modules). Сводная смета (единственная на объект) состоит из списка локальных смет.
 * Локальные сметы, в свою очередь, состоят из модулей. 
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

	// метод, формирующий смету
	public List<Estimates> composition(List<Estimates> items) {
		return null;
	}

	// метод, производящий пересчет суммарного результата по каждой смете в условные
	// единицы
	public double currencyRecosting(Estimates ob, boolean t) throws MyException {
		if (t) {
			List<Estimates> list = new ArrayList<Estimates>();
			List<Estimates> result = ob.composition(list);
			double cost = summation(list);
			double costInStandartUnit = cost / ob.exchangeRate;
			System.out.println("Произведен пересчет в условные единицы");
			return costInStandartUnit;
		} else
			throw new MyException("Exception");

	}

	// метод интерфейса Calculation
	@Override
	public double summation(List<Estimates> list) {

		return 0;
	}

	// метод интерфейса Calculation
	@Override
	public double[] relativeWeight(List<Estimates> list) {

		return null;
	}

}
