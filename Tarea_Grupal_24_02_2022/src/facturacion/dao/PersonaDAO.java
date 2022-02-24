package facturacion.dao;

import java.util.ArrayList;
import java.util.List;

import fabricasimple.FabricaPersona;
import facturacion.dto.PersonaDTO;
import facturacion.vo.PersonaVO;

public class PersonaDAO{

List <PersonaVO>listaPersonaVO = new ArrayList<PersonaVO>();

static final boolean HOMBRE = true;

static final boolean MUJER = true;

	
	public boolean Delete(PersonaDTO factura)
	{
		listaPersonaVO.remove(factura);
		return true;
	}
	
	public List <PersonaVO> Listar()
	{
		return listaPersonaVO;
	}

	
	public PersonaDAO() {

		FabricaPersona fabrica = new FabricaPersona();
		
		listaPersonaVO.add(fabrica.generaPersona(HOMBRE));
		listaPersonaVO.add(fabrica.generaPersona(MUJER));
		listaPersonaVO.add(fabrica.generaPersona(MUJER));
		listaPersonaVO.add(fabrica.generaPersona(HOMBRE));
		listaPersonaVO.add(fabrica.generaPersona(HOMBRE));
		listaPersonaVO.add(fabrica.generaPersona(MUJER));
		listaPersonaVO.add(fabrica.generaPersona(HOMBRE));
		listaPersonaVO.add(fabrica.generaPersona(MUJER));
		
	}
}
