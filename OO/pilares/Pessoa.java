/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {        
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    protected boolean validaCpf(String cpf) {
        return cpf.length() == 11;
    }

    protected String validaCodigo() {
        return "Class pessoa";
    }
}