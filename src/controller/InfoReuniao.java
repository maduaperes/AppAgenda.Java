package controller;

public class InfoReuniao {
    private int idfkCont, idfkReuniao;

    //Construtor
    public InfoReuniao(int idfkReuniao, int idfkCont) {
        this.idfkReuniao = idfkReuniao;
        this.idfkCont = idfkCont;
    }

    public int getIdfkCont() {
        return idfkCont;
    }

    public void setIdfkCont(int idfkCont) {
        this.idfkCont = idfkCont;
    }

    public int getIdfkReuniao() {
        return idfkReuniao;
    }

    public void setIdfkReuniao(int idfkReuniao) {
        this.idfkReuniao = idfkReuniao;
    }
}
