/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 *
 * @author Familia
 */
public class HistorialVentas {
    private String nombreVendedor;
    private String marcaCarro;
    private String modeloCarro;
    private String nombreComprador;

    public HistorialVentas(String nombreVendedor, String marcaCarro, String modeloCarro, String nombreComprador) {
        this.nombreVendedor = nombreVendedor;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.nombreComprador= nombreComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
    
}
