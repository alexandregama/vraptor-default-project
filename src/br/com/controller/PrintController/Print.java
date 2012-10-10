package br.com.controller.PrintController;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class Print {

	@Path("print")
	public String print() {
		return "VRaptor Default Project is Working! =)";
	}
	
}
