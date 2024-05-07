package FabricaYProductos;

public class MainFabricaProductos {
    public static void main(String[] args) {
        NotificacionFabrica notificacionUrgente = new NotificacionUrgenteFabrica();

        NotificacionPorCorreo correoUrgente = notificacionUrgente.crearNotificacionPorCorreo();
        NotificacionPorSMS smsUrgente = notificacionUrgente.crearNotificacionPorSMS();
        NotificacionPorApp appUrgente = notificacionUrgente.crearNotificacionPorApp();

        correoUrgente.enviarMensaje("Mensaje urgente por correo electrónico");
        smsUrgente.enviarMensaje("Mensaje urgente por mensaje de texto");
        appUrgente.enviarMensaje("Mensaje a través de una aplicación");

        NotificacionFabrica notificacionRegular = new NotificacionRegularFabrica();

        NotificacionPorCorreo correoRegular = notificacionRegular.crearNotificacionPorCorreo();
        NotificacionPorSMS smsRegular = notificacionRegular.crearNotificacionPorSMS();
        NotificacionPorApp appRegular = notificacionRegular.crearNotificacionPorApp();

        correoRegular.enviarMensaje("Mensaje regular por correo electrónico");
        smsRegular.enviarMensaje("Mensaje regular por mensaje de texto");
        appRegular.enviarMensaje("Mensaje a través de una aplicación");
    }
}