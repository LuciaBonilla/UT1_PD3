public final class MainMaquinaB {
    /**
     * Prueba básica de las clases {@link Perro} y {@link Gato}
     * @param args
     */
    public static void main(String[] args) {
        Gato gato = new Gato("Michi");
        System.out.println("El gato se llama Hercules? " + gato.respondeA("Hercules"));
        gato.maullar();
        System.out.println("El gato se llama " + gato.getNombre());

        Perro perro = new Perro("Hercules");
        System.out.println("El perro se llama Hercules? " + perro.respondeA("Hercules"));
        perro.ladrar();
        System.out.println("El perro se llama " + perro.getNombre());

        gato.caminar();
        gato.correr();
        gato.saltar();
    }
}