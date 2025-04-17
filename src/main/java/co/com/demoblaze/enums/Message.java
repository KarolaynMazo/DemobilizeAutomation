package co.com.demoblaze.enums;

public enum Message {
    MSG_ERR_BUSthatDA("The category or product you are looking for is not valid.");

    String mensaje;

    private Message(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
