
package libreta;

public class libreta {
    String color;
    String hoja_tipo;
    String marca;
    int cantidad_de_hojas;

    
    public libreta(){
    this.color="azul";
    this.hoja_tipo="raya";
    this.marca="scribe";
    this.cantidad_de_hojas= 100;
    }
    public libreta(String color, String hoja_tipo, String marca, int cantidad_de_hojas) {
        this.color = color;
        this.hoja_tipo = hoja_tipo;
        this.marca = marca;
        this.cantidad_de_hojas = cantidad_de_hojas;
    }
     public String getColor() {
        return color;
    }

    public String getHoja_tipo() {
        return hoja_tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidad_de_hojas() {
        return cantidad_de_hojas;
    }
   public void setColor(String color) {
        this.color = color;
    }

    public void setHoja_tipo(String hoja_tipo) {
        this.hoja_tipo = hoja_tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidad_de_hojas(int cantidad_de_hojas) {
        this.cantidad_de_hojas = cantidad_de_hojas;
    }   

    public boolean getprocesador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getmemoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
