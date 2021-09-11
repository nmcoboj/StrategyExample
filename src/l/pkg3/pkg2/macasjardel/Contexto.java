package l.pkg3.pkg2.macasjardel;

public class Contexto {

    private IDescuentosEstrategia estrategia;

    public Contexto(IDescuentosEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double total(Cliente cliente, double compra) {
        double total = estrategia.total(cliente, compra);
        return total;
    }

    public double descuento(Cliente cliente, double compra) {
        double descuento = estrategia.descuento(cliente, compra);
        return descuento;
    }

}
