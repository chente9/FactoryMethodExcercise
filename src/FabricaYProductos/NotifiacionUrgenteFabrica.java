package FabricaYProductos;


class NotificacionUrgenteFabrica implements NotificacionFabrica {

    @Override
    public NotificacionPorCorreo crearNotificacionPorCorreo() {
        return new NotificacionPorCorreo();
    }

    @Override
    public NotificacionPorSMS crearNotificacionPorSMS() {
        return new NotificacionPorSMS();
    }

    @Override
    public NotificacionPorApp crearNotificacionPorApp() {
        return new NotificacionPorApp();
    }
}
