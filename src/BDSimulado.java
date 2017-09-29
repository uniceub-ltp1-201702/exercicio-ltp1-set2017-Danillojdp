import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	
	//Atributos
	
	private ArrayList<InfoPessoais> infoPessoais;
	private ArrayList<Empresa> empresa;
	private ArrayList<InfoRestante> InfoRestante;
	
	public BDSimulado(){
		
		//Instanciando as listas
		this.infoPessoais = new ArrayList<InfoPessoais>();
		this.empresa = new ArrayList<Empresa>();
	
		
		
		//Criando informações Pessoais
		// LocalDate.of(Ano , Mês , Dia);
		
		InfoPessoais I1= new InfoPessoais("Damara", LocalDate.of(1996, 3, 14), "Feminino", "Brasilia", "DF");
		InfoPessoais I2= new InfoPessoais("Jorge", LocalDate.of(1996, 3, 17), "Masculino", "Coromandel", "MG");
		InfoPessoais I3= new InfoPessoais("Isadhora", LocalDate.of(2000, 6, 23), "Feminino", "Coromandel", "MG");
		InfoPessoais I4= new InfoPessoais("Alane", LocalDate.of(1995, 06, 15), "Feminino", "Santarem",  "MT");
		InfoPessoais I5= new InfoPessoais("Danillo",LocalDate.of(1997, 2, 21), "Masculino", "Brasilia", "DF");
		InfoPessoais I6= new InfoPessoais("Vanessa", LocalDate.of(1993, 2, 26), "Vanessa", "Brasilia", "DF");
		InfoPessoais I7= new InfoPessoais("Jose", LocalDate.of(1976, 5, 11), "Masculino", "Goiania",  "GO");
		InfoPessoais I8= new InfoPessoais("Joana", LocalDate.of(1994, 3, 6), "Feminino", "Goiania",  "GO");
		InfoPessoais I9= new InfoPessoais("Hellen", LocalDate.of(1999, 8, 18), "Feminino", "Brasilia", "DF");
		InfoPessoais I10= new InfoPessoais("Maria", LocalDate.of(1999, 1, 21), "Feminino", "Rio de Janeiro", "RJ");
		
		InfoRestante r1 = new InfoRestante("email", "Danillojdp@gmail.com");
		InfoRestante r2 = new InfoRestante("fixo", "30112225");
		
				
		
		I1.addRestoInfoPessoais(r1);
		I1.addRestoInfoPessoais(r2);
		
		// Add
				this.infoPessoais.add(I1);
				this.infoPessoais.add(I2);
				this.infoPessoais.add(I3);
				this.infoPessoais.add(I4);
				this.infoPessoais.add(I5);
				this.infoPessoais.add(I6);
				this.infoPessoais.add(I7);
				this.infoPessoais.add(I8);
				this.infoPessoais.add(I9);
				this.infoPessoais.add(I10);
		
	}

	public ArrayList<InfoPessoais> getInfoPessoais() {
		return infoPessoais;
	}

	public ArrayList<Empresa> getEmpresa() {
		return empresa;
	}

	public ArrayList<InfoRestante> getInfoRestante() {
		return InfoRestante;
	}
	
}