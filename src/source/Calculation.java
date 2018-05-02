package source;

import java.util.List;

public interface Calculation {
	/*Объеты классов, которые имплементируют данный интерфейс, имеют методы вычисления общей суммы и определения удельного веса
	 * входящих в него смет или модулей*/ 
	
	public double summation(List<Estimates> list);
	public double[] relativeWeight (List<Estimates> list);
}
