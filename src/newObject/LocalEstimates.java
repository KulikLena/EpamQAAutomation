package newObject;

import java.util.ArrayList;
import java.util.List;

import source.Calculation;
import source.Estimates;

public class LocalEstimates extends Estimates implements Calculation {
	
	@Override
	public List<Estimates> composition(List<Estimates> modules) {
		// формирование локальной сметы из списка модулей
		List<Estimates> list = new ArrayList<Estimates>(modules);
		return 	list;
	}

	@Override
	public double summation(List<Estimates> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// здесь происходит суммирование конкретных полей 
		}
		return sum;

	}

	@Override
	public double[] relativeWeight(List<Estimates> list) {
		double[] relativeWeights = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			// производится расчет удельного веса каждой локальной сметы
		}
		return relativeWeights;
	}

}
