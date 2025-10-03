public class Coche {
    private int Llantas;
    private float TamanoC;
    private int Acientos;
    private float Kmtraje;

    public Coche(int Llantas, float TamanoC, int Acientos, float Kmtraje){
        this.Llantas=Llantas;
        this. TamanoC = TamanoC;
        this.Acientos = Acientos;
        this.Kmtraje = Kmtraje;
    }

    public Coche(){}

    public int getLlantas(){
        return Llantas;
    }

    public void setLlantas(int Llantas){
        this.Llantas = Llantas;
    }

    public float getTamano(){
        return TamanoC;
    }

    public void setTamano(float Tamanoc){
        this. TamanoC = TamanoC;

    }

    public int getAcientos(){
        return Acientos;
    }

    public void setAcientos(int Acientos){
        this.Acientos = Acientos;
    }

    public float getKmtraje(){
        return Kmtraje;
    }

    public void getKmtraje(float Kmtraje){ 
        this.Kmtraje = (float) Kmtraje;
    }

}