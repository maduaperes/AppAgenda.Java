package controller;

public class Reuniao {
    private String dataReuniao, horaReuniao, link;

    public Reuniao(String dataReuniao, String horaReuniao, String link) {
        this.dataReuniao = dataReuniao;
        this.horaReuniao = horaReuniao;
        this.link = link;
    }

    //Getters
    public String getDataReuniao() {return dataReuniao;}
    public String getHoraReuniao() {return horaReuniao;}
    public String getLink() {return link;}

    public void cadastroSucesso() {
        System.out.print("Reunião agendada com sucesso!");
    }
    public void cadastroErro() {
        System.out.print("Erro ao agendar reunião!");
    }
}
