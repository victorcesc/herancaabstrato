public class Principal {
    public static void main(String[] args){
        Professor prof = new Professor("victor","cesc",22,"doutor");
        prof.imprimeDados();
        prof.estudar();
        Aluno a = new Aluno("victor","cesc","1220015509",8);
        a.imprimeDados();
        a.estudar();


    }


}
