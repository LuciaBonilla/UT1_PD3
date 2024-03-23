public class Gato implements Mamifero {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void maullar() {
        System.out.println("miau");
    }
    public boolean respondeA(String unNombre) {
        return false; //Nunca responde.
    }

    public void caminar() {
        System.out.println("El gato camina...");
    }

    public void correr() {
        System.out.println("El gato corre...");
    }

    public void saltar() {
        System.out.println("El gato salta...");
    }
}