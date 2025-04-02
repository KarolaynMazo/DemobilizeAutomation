package co.com.demoblaze.enums;

public enum Mensaje {
    MSG_ERR_BUSQUEDA("La categoria o el producto en busqueda no son validos");

    String mensaje;

    private Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
