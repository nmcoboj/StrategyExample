package l.pkg3.pkg2.macasjardel;

public class DescuentoJovenes implements IDescuentosEstrategia {

    double compraFinal;
    double descuento;

    @Override
    public double total(Cliente cliente, double totalCompra) {
        compraFinal = totalCompra;
        int contador = 0;
        String sPalabra = cliente.getNombre();
        for (int x = 0; x < sPalabra.length(); x++) {
            if ((sPalabra.charAt(x) == 'a') || (sPalabra.charAt(x) == 'e')
                    || (sPalabra.charAt(x) == 'i') || (sPalabra.charAt(x) == 'o')
                    || (sPalabra.charAt(x) == 'u')) {
                contador++;
            }
        }
        compraFinal = compraFinal - (compraFinal * 0.05 * contador);

        if ((cliente.getEdad() <= 16) && (cliente.getEdad() >= 12)) {
            compraFinal = compraFinal - (compraFinal * 0.02);
        }
        return compraFinal;
    }

    @Override
    public double descuento(Cliente cliente, double totalCompra) {
        descuento = 0;
        compraFinal = totalCompra;
        int contador = 0;
        String sPalabra = cliente.getNombre();
        for (int x = 0; x < sPalabra.length(); x++) {
            if ((sPalabra.charAt(x) == 'a') || (sPalabra.charAt(x) == 'e')
                    || (sPalabra.charAt(x) == 'i') || (sPalabra.charAt(x) == 'o')
                    || (sPalabra.charAt(x) == 'u')) {
                contador++;
            }
        }
        compraFinal = compraFinal - (compraFinal * 0.05 * contador);
        descuento = descuento + (0.05 * contador);
        if ((cliente.getEdad() <= 16) && (cliente.getEdad() >= 12)) {
            compraFinal = compraFinal - (compraFinal * 0.02);
            descuento = descuento + 0.02;
        }
        return descuento;
    }

}
