public class Alumno extends Persona
{
	private String matricula;
	private float promedio;

	public Alumno(String nombre, String edad, String noSS)
	{
		super(nombre, edad, noSS);
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula; 
	}

	public void setPromedio (float promedio)
	{
		this.promedio = promedio;
	}

	public String getMatricula()
	{
		return this.matricula;
	}

	public float getPromedio()
	{
		return this.promedio;
	}
}