package anoBisexto;

import java.time.LocalDate;

public class ControlBisexto {
	
	public ControlBisexto() {
		
	}
	
	public boolean getAnoBisexto(LocalDate data) {
		return data.isLeapYear();
	}

}
