
package lapiz;

public class lapiz {
     String color;
    String punta;
    String marca;
    int numero;

    
    public lapiz(){
    this.color="amarillo";
    this.punta="fina";
    this.marca="norma";
    this.numero= 2;
    }
    public lapiz(String color, String Punta, String marca, int Numero) {
        this.color = color;
        this.punta = Punta;
        this.marca = marca;
        this.numero =Numero ;
    }
     public String getColor() {
        return color;
    }

    public String getpunta() {
        return punta;
    }

    public String getMarca() {
        return marca;
    }

    public int getnumero() {
        return numero;
    }
   public void setColor(String color) {
        this.color = color;
    }

    public void setpunta( String Punta) {          
        this.punta = Punta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidad_de_hojas(int Numero) {
        this.numero = Numero;
    }   

    public boolean getprocesador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getmemoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
