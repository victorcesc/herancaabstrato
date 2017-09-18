public class Professor extends Pessoa{
    protected int horasAula;
    protected String formacao;

    public Professor(String nome,String sobrenome,int horasAula,String formacao) {
        super(nome,sobrenome);
        this.horasAula = horasAula;
        this.formacao = formacao;
    }
    public void imprimeDados(){
        System.out.println("Professor: "+nome+" "+sobrenome);
        System.out.println("Horas de Aula :"+horasAula);
        System.out.println("Formacao :"+formacao);

    }

    public void estudar(){
        System.out.println("Professor estudando...");
        System.out.println("Professor termina de estudar.");


    }


}
