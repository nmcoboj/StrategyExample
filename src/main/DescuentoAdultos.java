package l.pkg3.pkg2.macasjardel;

public class DescuentoAdultos implements IDescuentosEstrategia {

    double compraFinal;
    double descuento;

    
    
    @Override
    public double total(Cliente adulto, double totalCompra) {
        compraFinal = totalCompra;
        compraFinal = compraFinal - (compraFinal * 0.10);
        if (totalCompra > 300) {
            compraFinal = -(compraFinal * 0.03);
       }
        if ("Septiembre".equals(adulto.getMes())) {
            compraFinal = compraFinal - 5;
        }
        return compraFinal;
    }

    @Override
    public double descuento(Cliente adulto, double totalCompra) {
        descuento = 0;
        compraFinal = totalCompra;
        compraFinal = compraFinal - (compraFinal * 0.10);
        descuento = descuento + 0.10;
        if (totalCompra > 300) {
            compraFinal = -(compraFinal * 0.03);
            descuento = descuento + 0.03;
        }
        if ("Septiembre".equals(adulto.getMes())) {
            compraFinal = compraFinal - 5;
        }
        return descuento;
    }

}
