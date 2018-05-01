package epamQAAutomation;

import java.util.List;

public interface Calculation {
	//интерфейс, декларирующий, что каждый подвид сметной документации умеет вычислять 
	// общую сумму средств и удельный вес каждого элемента (главы или модуля), из которого состоит
	public double summation(List<Estimates> list);
	public double[] relativeWeight (List<Estimates> list);
}
