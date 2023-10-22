package dataeHoraAtual;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraAtual {

	public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Formatter para a data (dd/mm/aaaa)
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataHoraAtual.format(formatterData);

        // Formatter para a hora (mm:ss)
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = dataHoraAtual.format(formatterHora);

        // Combinando os resultados
        String dataHoraFormatada = dataFormatada + " : " + horaFormatada;

        System.out.println("Data e Hora Formatadas: " + dataHoraFormatada);
    }
}
