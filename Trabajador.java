public class Trabajador extends Persona
{
	private String noEmpleado;
	private String rFC;

	public Trabajador(String nombre, String edad, String noSS)
	{
		super(nombre, edad, noSS);
	}

	public void setNoEmpleado(String noEmpleado)
	{
		this.noEmpleado = noEmpleado; 
	}

	public void setRFC (String rFC)
	{
		this.rFC= rFC;
	}

	public String getNoEmpleado()
	{
		return this.noEmpleado;
	}

	public String getRFC()
	{
		return this.rFC;
	}


}