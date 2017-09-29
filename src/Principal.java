import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando o BDSimulado
		
				BDSimulado bds= new BDSimulado();
				
				//Instanciando a lista de InfoPessais, Empresa e InfoRestante
				ArrayList<InfoPessoais> infoPessoais = bds.getInfoPessoais();
				ArrayList<Empresa> empresa = bds.getEmpresa();	
				ArrayList<InfoRestante> InfoRestante = bds.getInfoRestante();
				
				
				
				
	}

}