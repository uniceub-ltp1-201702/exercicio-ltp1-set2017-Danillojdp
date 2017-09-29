import java.time.LocalDate;
import java.util.ArrayList;

public class InfoPessoais {
	//Atributos
	private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String cidade;
    private String UF;
    private Empresa empresa;
    private ArrayList<InfoRestante> InfoRestante;
    
    //Metodo Construtor
    
	public InfoPessoais(String nome, LocalDate dataNascimento, String sexo, String cidade, String uF) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		UF = uF;
		this.InfoRestante = new ArrayList<InfoRestante>();
	}
    
    
	// Metodo Get e Set 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public ArrayList<InfoRestante> getInfoRestante() {
		return InfoRestante;
	}


	public void setInfoRestante(ArrayList<InfoRestante> InfoRestante) {
		this.InfoRestante = InfoRestante;
	}

	

	public void addRestoInfoPessoais(InfoRestante mamae) {
		// TODO Auto-generated method stub
		
	}
	
	
    // Data de Nascimento
	public String getDataComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
			   dataNascimento.getMonthValue() + "/" +
				dataNascimento.getYear();
	}

   
    
}