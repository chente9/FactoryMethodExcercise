package FabricaYProductos;



public interface NotificacionFabrica {
    NotificacionPorCorreo crearNotificacionPorCorreo();

    NotificacionPorSMS crearNotificacionPorSMS();

    NotificacionPorApp crearNotificacionPorApp();
}
