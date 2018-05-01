package epamQAAutomation;

import java.util.ArrayList;
import java.util.List;

public final class ConsolidatedEstimate extends Estimates implements Calculation {

	private static ConsolidatedEstimate instance = null;

	private ConsolidatedEstimate() {
	}

	public static synchronized ConsolidatedEstimate getInstance() {
		if (instance == null)
			instance = new ConsolidatedEstimate();
		return instance;
	}

	@Override
	public List<Estimates> composition(List<Estimates> items) {
		// формируем сводную смету из списка локальных смет
		List<Estimates> list = new ArrayList<Estimates>();
		return list;
	}

	@Override
	public double summation(List<Estimates> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// производим суммирование по каждой локальной смете из списка
		}
		return sum;
	}

	@Override
	public double[] relativeWeight(List<Estimates> list) {
		double[] relativeWeights = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			// вычисляем удельный вес каждой локальной сметы
		}
		return relativeWeights;
	}

}
