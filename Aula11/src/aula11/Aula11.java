package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante pv = new Visitante();
        pv.setNome("Juvenal");
        pv.setIdade(22);
        pv.setSexo("M");
        
        Aluno pa = new Aluno();
        pa.setNome("Cláudio");
        pa.setMatricula(1111);
        pa.setCurso("Informática");
        pa.setIdade(16);
        pa.setSexo("M");
        pa.pagarMensalidade();
        
        Bolsista pab = new Bolsista();
        pab.setMatricula(2222);
        pab.setNome("Jubileu");
        pab.setBolsa(12.5f);
        pab.setSexo("M");
        pab.pagarMensalidade();
    }
}
