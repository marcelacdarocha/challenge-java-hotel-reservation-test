import application.HotelService;

public class HotelReservation {

    private final HotelService hotelService = new HotelService();

    public String getCheapestHotel (String input) {

        return hotelService.buscarHotelMaisBarato(input);
    }
}
