package Notificacioes;

public class AppMain {
    public static void main (String [] args) {
        NotificacionFactory notificacion = new NotificacionFactory();

        Notificacion email = notificacion.crearNotificacion("email");
        email.enviarMensaje("Hola este es un mensaje de prueba por correo electronico");

        Notificacion SMS = notificacion.crearNotificacion("SMS");
        SMS.enviarMensaje("Hola, este es una mensaje de prueba a través de SMS");

        Notificacion app = notificacion.crearNotificacion("App");
        app.enviarMensaje("Hola, este es un mensaje de prueba a través de App" );
    }
}
