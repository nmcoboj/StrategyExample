package l.pkg3.pkg2.macasjardel;


public interface IDescuentosEstrategia {
    
    double total(Cliente cliente, double totalCompra);
    double descuento(Cliente cliente, double totalCompra);
    
}
