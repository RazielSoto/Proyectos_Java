package domain;

public class Criptomoneda {

    private int id_Criptomoneda;
    private String nombre;
    private String valor_Actual;
    private int compra_1;
    private int compra_2;
    private int total;

    public Criptomoneda() {
    }

    public Criptomoneda(int id_Criptomoneda) {
        this.id_Criptomoneda = id_Criptomoneda;
    }

    public Criptomoneda(String nombre, String valor_Actual, int compra_1, int compra_2, int total) {
        this.nombre = nombre;
        this.valor_Actual = valor_Actual;
        this.compra_1 = compra_1;
        this.compra_2 = compra_2;
        this.total = total;
    }

    public Criptomoneda(int id_Criptomoneda, String nombre, String valor_Actual, int compra_1, int compra_2, int total) {
        this.id_Criptomoneda = id_Criptomoneda;
        this.nombre = nombre;
        this.valor_Actual = valor_Actual;
        this.compra_1 = compra_1;
        this.compra_2 = compra_2;
        this.total = total;
    }

    public int getId_Criptomoneda() {
        return id_Criptomoneda;
    }

    public void setId_Criptomoneda(int id_Criptomoneda) {
        this.id_Criptomoneda = id_Criptomoneda;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getValor_Actual(){
        return valor_Actual;
    }
    public void setValor_Actual(String valor_Actual){
        this.valor_Actual = valor_Actual;
    }
    public int getCompra_1(){
        return compra_1;
    }
    public void setCompra_1(int compra_1){
        this.compra_1 = compra_1;
    }
    public int getCompra_2(){
        return compra_2;
    }
    public void setCompra_2(int compra_2){
        this.compra_2 = compra_2;
    }
    public int getTotal(){
        return total;
    }
    public void setTotal(int total){
        this.total = total;
    }
    
    public String imprimir(){
        return "Criptomoneda:  "+"Id_Criptomoneda: "+id_Criptomoneda+"Nombre: "+nombre+"Valor_Actual: "+valor_Actual
                +"Compra_1: "+compra_1+"Compra_2: "+compra_2+"Total: "+total ;
    }
}
