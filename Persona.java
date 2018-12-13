public class Persona
{
	String nombre;
	String edad;
	String noSS;

	public Persona (String nombre, String edad, String noSS)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.noSS = noSS;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public String getEdad()
	{
		return this.edad;
	}

	public String getNoSS()
	{
		return this.noSS;
	}


}