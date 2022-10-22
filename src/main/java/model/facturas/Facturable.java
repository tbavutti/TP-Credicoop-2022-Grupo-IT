package model.facturas;

import model.compra.Compra;

public interface Facturable {
    public String generarFactura(Compra compra);
}
