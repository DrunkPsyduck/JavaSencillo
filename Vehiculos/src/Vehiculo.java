public abstract class Vehiculo {

    protected String matricula;
    protected int potencia;

    protected Modelo modelo;
    protected double precioAlquiler;
    protected String tipo; //combustible


    public Vehiculo() {
        matricula = "0000bbb";
        potencia = 520;
        precioAlquiler = 120;
        tipo = "Gasolina";
        modelo = new Modelo();

    }

    public Vehiculo(String matricula, int potencia, Modelo modelo, double precioAlquiler, String tipo) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.modelo = modelo;
        this.precioAlquiler = precioAlquiler;
        this.tipo = tipo;
    }



    //public abstract void informacionVehiculo(String matricula, int potencia, double precio, Modelo modelo, String tipo);


    @Override
    public String  toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", modelo=" + modelo +
                ", precioAlquiler=" + precioAlquiler +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
