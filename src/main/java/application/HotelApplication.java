package application;

import java.util.Scanner;

public class HotelApplication {

    private static final HotelService hotelService = new HotelService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(
            "[Regular/Rewards]"
            + "\nInforme o tipo de cliente: ");
        var cliente = scanner.next();

        System.out.println(
            "Formato dd/mm/yyyy(week) -> 16Mar2009(mon)"
            + "\nInforme as datas separando-as por virgulas: ");
        var datas = scanner.next();

        var nomeHotel = hotelService.buscarHotelMaisBarato(formatarInput(cliente, datas));

        System.out.println(nomeHotel);
    }

    private static String formatarInput(String cliente, String datas) {

        return String.format("%s: %s", cliente.toUpperCase(), datas);
    }


}
