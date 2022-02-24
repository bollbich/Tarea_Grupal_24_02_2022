package fabricasimple;

import java.util.Optional;
import facturacion.vo.FacturaVO;
import facturacion.vo.PersonaVO;

public class FabricaPersona {
	
	public PersonaVO generaPersona(boolean hombre)
	{
		String [] nombreMasculino = new String[] {"Alberto","Mario","Luis","Hugo","Lucas"};
		
		String [] nombreFemenino = new String[] {"Abigail","Abril","Ada","Eva","Maria"};
		
		
		if(hombre)
		{
			return new PersonaVO((int)(Math.random()*50),nombreMasculino[(int) (Math.random()*4)] ,"Martin Gonzales", (int)(Math.random()*65));
		}
		else
		{
			return new PersonaVO((int)(Math.random()*50), nombreFemenino[(int) (Math.random()*4)],"Lobato pio", (int)(Math.random()*65));
		}		
	}
}
