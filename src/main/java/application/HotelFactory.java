package application;

import java.util.Collection;
import java.util.List;
import model.Hotel;
import model.TaxaDiaDeSemana;
import model.TaxaFimDeSemana;

public class HotelFactory {

    private HotelFactory() {

    }

    public static Collection<Hotel> criarHoteis() {

        return List.of(
            criarHotel("Lakewood", 3, 110, 80, 90, 80),
            criarHotel("Bridgewood", 4, 160, 110, 60, 50),
            criarHotel("Ridgewood", 5, 220, 100, 150, 40));
    }

    private static Hotel criarHotel(
        String nome,
        Integer classificacao,
        Integer taxaDiaDeSemanaRegular,
        Integer taxaDiaDeSemanaReward,
        Integer taxaFimDeSemanaRegular,
        Integer taxaFimDeSemanaReward) {

        return new Hotel(
            nome,
            classificacao,
            new TaxaDiaDeSemana(taxaDiaDeSemanaRegular, taxaDiaDeSemanaReward),
            new TaxaFimDeSemana(taxaFimDeSemanaRegular, taxaFimDeSemanaReward));
    }

}
