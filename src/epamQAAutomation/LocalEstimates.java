package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

public class LocalEstimates extends Estimates implements Calculation {
	
	@Override
	public List<Estimates> composition(List<Estimates> modules) {
		// формируем локальные сметы из модулей
		List<Estimates> list = new ArrayList<Estimates>();
		return 	list;
	}

	@Override
	public double summation(List<Estimates> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// производим суммирование по каждому модулю из списка
		}
		return sum;

	}

	@Override
	public double[] relativeWeight(List<Estimates> list) {
		double[] relativeWeights = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			// вычисляем удельный вес каждого модуля
		}
		return relativeWeights;
	}

}
