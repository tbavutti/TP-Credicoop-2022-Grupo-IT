package model.facturas;

import model.compra.Compra;

public class GeneradorDeFacturasElectronicas {
    private Facturable facturador;

    public String generarFacturaElectronica(Compra compra){
        return this.facturador.generarFactura(compra);
    }

}
