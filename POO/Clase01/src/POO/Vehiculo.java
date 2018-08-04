
package POO;


public class Vehiculo {

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the NumeroPuertas
     */
    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    /**
     * @param NumeroPuertas the NumeroPuertas to set
     */
    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    private String color;
    private String marca;
    private double precio;
    private int NumeroPuertas;
       
}
