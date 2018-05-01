package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

/* ѕредметна€ область - сметна€ документаци€. ѕринимаем упрощенную модель составлени€ сметной документации,
 * котора€ заключаетс€ в следующем : сметы на объект (Estimates) состо€т из сводного сметного расчета 
 * (Consolidated Estimate) и локальных смет (Local estimates). ¬ свою очередь сводный сметный расчет состоит 
 * из локальных смет, а локальные сметы состо€т из модулей (Modules)
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

	// геттеры и сеттеры
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

	// формирование сметы (сводной или локальной) в виде списка элемнтов (локальных
	// смет или модулей)
	public List<Estimates> composition(List<Estimates> items) {
		return null;
	}

	// пересчет результата из белорусских рублей в валюту
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
