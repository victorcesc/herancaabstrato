public class Aluno extends Pessoa{
    protected String matricula;
    protected int aulasSemanais;

    public Aluno(String nome, String sobrenome, String matricula, int aulasSemanais) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.aulasSemanais = aulasSemanais;
    }
    public void imprimeDados(){
        System.out.println("Aluno: "+nome+" "+sobrenome);
        System.out.println("Matricula :"+matricula);
        System.out.println("Aulas Semanais :"+aulasSemanais);

    }


    public void estudar(){
        System.out.println(nome+" estudando...");
        System.out.println(nome+" termina de estudar.");
    }



}
