package model;

public class Feedback {
    
    private int id;
    private int numServico;
    private int nota;
    private String comentario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumServico() {
        return numServico;
    }

    public void setNumServico(int numServico) {
        this.numServico = numServico;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}