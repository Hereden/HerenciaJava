
public class Perro extends Animal {
	String raza="";
	String color="";
	float peso=0;
	
	public String ladrar() {
		return "Guaf";
	}
	
	@Override
	public String comer() {
		return "Comiendo croquetas";
	}
}
