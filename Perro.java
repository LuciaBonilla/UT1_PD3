public class Perro implements Mamifero {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void ladrar() {
        System.out.println("wof");
    }
    public boolean respondeA(String unNombre) {
        return this.nombre.equals(unNombre);
    }

    public void caminar() {
        System.out.println("El perro camina...");
    }

    public void correr() {
        System.out.println("El perro corre...");
    }

    public void saltar() {
        System.out.println("El perro salta...");
    }
}