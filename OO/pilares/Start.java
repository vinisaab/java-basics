/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String cpf = "11111111111";
        String ra = "123456789900";


        if (aluno.validaCpf(cpf)) {
            aluno.setNome("vini");
            aluno.setRg("123456789");
            aluno.setCpf(cpf);
            aluno.setRa(ra);
        } else {
            System.out.println("Dados inválidos, revisar");
        }
    }
    
}