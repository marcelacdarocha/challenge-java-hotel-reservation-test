package application;

import java.util.Collection;
import java.util.List;

public class FormatadorHelper {

    private FormatadorHelper() {

    }

    public static Collection<String> filtrarDatas(String input) {

        if (ValidadorCliente.verificarClienteRegular(input)) {

            return List.of(removerCliente(input, "Regular: ").split(","));
        }

        return List.of(removerCliente(input, "Rewards: ").split(","));
    }

    private static String removerCliente(String input, String cliente) {

        return input.replace(cliente, "");
    }

}
