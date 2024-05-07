package Notificacioes;

 class NotificacionFactory {
     public Notificacion crearNotificacion (String tipo) {
         switch (tipo) {
             case "email":
                 return new EmailNotificacion();

             case "SMS":
                 return new SMSMensaje();
             case "App":
                 return new AppNotificacion();
             default:
                 throw new IllegalArgumentException("Tipo de notificacion no válido: " + tipo);
         }
     }
}
