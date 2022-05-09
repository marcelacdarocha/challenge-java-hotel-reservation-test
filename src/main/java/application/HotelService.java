package application;

import java.util.Collection;
import java.util.Comparator;
import model.Hotel;

public class HotelService {

    private static final Collection<Hotel> HOTEIS = HotelFactory.criarHoteis();
    private static final String HOTEL_NAO_ENCONTRADO = "Não foi possível encontrar um hotel";


    public String buscarHotelMaisBarato(String input) {

        var datas = FormatadorHelper.filtrarDatas(input);

        if (ValidadorCliente.verificarClienteRegular(input)) {

            return buscarHotelParaClienteRegular(datas);
        }

        return buscarHotelParaClienteRewards(datas);
    }

    private String buscarHotelParaClienteRewards(Collection<String> datas) {

        if (ValidadorHotel.verificarDatas(datas)) {

            return HOTEIS
                .stream()
                .min(Comparator.comparing(hotel -> hotel.getTaxaFimDeSemana().getValorReward()))
                .map(Hotel::getNome)
                .orElse(HOTEL_NAO_ENCONTRADO);
        }

        return HOTEIS
            .stream()
            .min(Comparator.comparing(hotel -> hotel.getTaxaDiaDeSemana().getValorReward()))
            .map(Hotel::getNome)
            .orElse(HOTEL_NAO_ENCONTRADO);
    }

    private String buscarHotelParaClienteRegular(Collection<String> datas) {

        if (ValidadorHotel.verificarDatas(datas)) {

            return HOTEIS
                .stream()
                .min(Comparator.comparing(hotel -> hotel.getTaxaFimDeSemana().getValorRegular()))
                .map(Hotel::getNome)
                .orElse(HOTEL_NAO_ENCONTRADO);
        }

        return HOTEIS
            .stream()
            .min(Comparator.comparing(hotel -> hotel.getTaxaDiaDeSemana().getValorRegular()))
            .map(Hotel::getNome)
            .orElse(HOTEL_NAO_ENCONTRADO);
    }
}
