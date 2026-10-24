package Interfaces;
interface notificationServices {
    void sendEmailNotification(String email, String message);
    void subscribeToNotifications(String email);
}
