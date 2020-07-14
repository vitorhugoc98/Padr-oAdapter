
package padraoadapter;

public class Cliente {

    public static void main(String[] args) {
        AdapteeConectorHDMI conectorHDMI00 = new AdapteeConectorHDMI();
        AdapterVGAParaHDMI novaConexao = new AdapterVGAParaHDMI(conectorHDMI00); 
        novaConexao.conectarNoVGA();
    }
    
}
