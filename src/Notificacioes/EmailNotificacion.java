package Notificacioes;

public class EmailNotificacion implements Notificacion{
    public void enviarMensaje (String mensaje) {
        System.out.println("Enviar mensaje por correo electrónico");
    }
}

