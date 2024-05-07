package FabricaYProductos;

interface Notificacion {
    void enviarMensaje (String mensaje);
}

class NotificacionPorCorreo implements Notificacion {
    public void enviarMensaje (String mensaje) {
        System.out.println("Enviar mensaje por correo electrónico " + mensaje);
    }
}

class NotificacionPorSMS implements Notificacion {
    public void enviarMensaje (String mensaje) {
        System.out.println("Enviar correo por mesaje de texto" + mensaje);
    }
}

class NotificacionPorApp implements Notificacion {
    public void enviarMensaje (String mensaje) {
        System.out.println("Enviando mensaje por aplicacion" + mensaje);
    }
}