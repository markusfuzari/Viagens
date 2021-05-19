package br.com.fuzari.viagens.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import androidx.annotation.NonNull;

public class DataUtil {


    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String formataData(LocalDate data, String formato) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formato);
        return data.format(dateTimeFormatter);
    }

    @NonNull
    public static String periodoEmTexto(int dias) {
        LocalDate dataIda = LocalDate.now();
        LocalDate dataVolta = LocalDate.now().plusDays(dias);
        String dataFormatadaIda = formataData(dataIda, DIA_E_MES);
        String dataFormatadaVolta = formataData(dataVolta,DIA_E_MES);
        return dataFormatadaIda+" - "+dataFormatadaVolta+" de "+dataIda.getYear();
    }

}
