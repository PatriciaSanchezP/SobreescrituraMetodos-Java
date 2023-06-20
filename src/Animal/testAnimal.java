package Animal;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un animal, en este momento usamos el método que imprime "hacer sonido", y cuando definimos que este animal es un gato, se sobreescribe el método y se cambia por "miau miau".
		
		Animal Gardfield = new Gato(); //Miau miau
		Gardfield.hacerSonido();
		
		Animal Godzilla = new Animal(); //Hacer sonido
		Godzilla.hacerSonido();


	}

}
