package application;

import java.util.Collection;

public class ValidadorHotel {

    private ValidadorHotel() {

    }

    public static boolean verificarDatas(Collection<String> datas) {

        return datas
            .stream()
            .anyMatch(ValidadorHotel::verificaEnquandramentoTaxaFimDeSemana);
    }

    private static boolean verificaEnquandramentoTaxaFimDeSemana(String data) {

        return data.contains("sat") || data.contains("sun");
    }

}
