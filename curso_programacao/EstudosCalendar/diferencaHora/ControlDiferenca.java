package diferencaHora;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ControlDiferenca {
	private List<LocalDate> dates = new ArrayList<>();
	
	public ControlDiferenca(List<LocalDate> dates) {
		this.dates = dates;
	}
	
	public ControlDiferenca() {
		
	}
	
	public void addData(LocalDate date) {
		dates.add(date);
	}
	
	public void removeDate(LocalDate date) {
		dates.remove(date);
	}
	
	public long getDiferenca() {
		if(dates.size() < 2) {
			//Não é possivel Calcular diferença com menos de duas datas
			return -1;
		}
		
		LocalDate dataInicial = dates.get(0);
		LocalDate dataFinal = dates.get(1);
		
		//Calcula a diferença em dias entra a primeira e a segunda data
		long diferencaDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
		return diferencaDias;
		
		
		
	}

}
