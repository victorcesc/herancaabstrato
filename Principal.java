public class Principal {
    public static void main(String[] args){
        Professor prof = new Professor("victor","cesc",22,"doutor");
        prof.imprimeDados();
        //prof.estudar();
        Aluno a = new Aluno("Victor","cesc","1220015509",8);
        //a.imprimeDados();
        a.estudar();

        Pessoa vetP[] = new Pessoa[4];

        vetP[0] = new Aluno("Rafael","souza","23131112",9);
        vetP[1] = new Professor("emerson","mello",10,"doutor");
        vetP[2] = new Aluno("Andre","faraco","141232121",19);
        vetP[3] = new Aluno ("Richard","sagaz","29139132",10);
         for(int i=0;i<4;i++){
            vetP[i].imprimeDados();
            vetP[i].estudar();
             System.out.println("----------------------------");


        }



    }


}
