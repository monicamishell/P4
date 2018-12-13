public class Jubilado extends Persona
{
	private String noJubilado;
	private String rFC;

	public Jubilado (String nombre, String edad, String noSS)
	{
		super(nombre, edad, noSS);
	}

	public void setNoJubilado(String noJubilado)
	{
		this.noJubilado = noJubilado; 
	}

	public void setRFC (String rFC)
	{
		this.rFC= rFC;
	}

	public String getNoJubilado()
	{
		return this.noJubilado;
	}

	public String getRFC()
	{
		return this.rFC;
	}
}
