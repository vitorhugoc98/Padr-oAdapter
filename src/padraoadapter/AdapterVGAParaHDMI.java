package padraoadapter;
public class AdapterVGAParaHDMI extends TargetConectorVGA{
    
    private AdapteeConectorHDMI conectorHDMI; 
    
    public AdapterVGAParaHDMI(AdapteeConectorHDMI conectorHDMI){
        this.conectorHDMI = conectorHDMI;
    }
    public void conectarNoVGA(){
        conectorHDMI.conectarHDMI();
    }
    
}
