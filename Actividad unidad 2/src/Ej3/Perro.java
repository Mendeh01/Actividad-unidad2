package Ej3;

class Perro extends Animal {
    // firma diferente
    @Override
    public void sonido() {
        System.out.println("El perro ladra.");
    }
}//el método no coincide con la firma del padre.
