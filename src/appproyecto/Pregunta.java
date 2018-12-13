
package appproyecto;

public class Pregunta {
    
    private String [] respuestas= new String [3];
    private int numPregunta;
    private String pregunta;
    private int respCorrecta;
    private boolean alterna;

    public Pregunta(int numPregunta, String pregunta, String [] a, int respCorrecta ) {
        this.numPregunta = numPregunta;
        this.pregunta = pregunta;
        this.respuestas = a;
        this.respCorrecta = respCorrecta;
        this.alterna=true;
    }

    public int getNum() {
        return getNumPregunta();
    }

    public void setNum(int num) {
        this.setNumPregunta(num);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.setRespuestas(respuestas);
    }

    public boolean getAlterna() {
        return alterna;
    }

    public void setAlterna(boolean alterna) {
        this.alterna = alterna;
    }

    public int getNumPregunta() {
        return numPregunta;
    }

    public void setNumPregunta(int numPregunta) {
        this.numPregunta = numPregunta;
    }

    public int getRespCorrecta() {
        return respCorrecta;
    }

    public void setRespCorrecta(int respCorrecta) {
        this.respCorrecta = respCorrecta;
    }

    
    
}
