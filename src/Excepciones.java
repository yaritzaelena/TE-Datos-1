import sun.font.TrueTypeFont;

public class Excepciones {
    Excepciones(){
    }
    public void Valida(String C1, String C2) throws ExcPersonalizada {
        if (!C1.equals(C2)){
            throw new ExcPersonalizada("Las contraseñas no coinciden, inténtelo nuevamente.");
        }
        if (C1.length()<8){
            throw new ExcPersonalizada("Estimado usuario, por su seguridad le solicitamos que alargue su contraseña.");
        }
    }
}
