package org.section30.design_pattern.creation.factory;
interface Notification{
    void notice();
}

class Email implements Notification{
    @Override
    public void notice() {
        System.out.println(" Email Notification sent ");
    }
}
class SMS implements Notification{

    @Override
    public void notice() {
        System.out.println("SMS Notification sent");
    }
}
class NoticeFactory{
    public Notification getNotification(String typeNotice){
        if(typeNotice == null){
            return  null;
        }
        if(typeNotice.equalsIgnoreCase("mail")){
            return new Email();
        } else if (typeNotice.equalsIgnoreCase("sms")) {
            return new SMS();
        }return null;
    }
}
public class FactoryNotificationEx {
    public static void main(String[] args) {
        NoticeFactory noticeFactory = new NoticeFactory();
        Notification email= noticeFactory.getNotification("mail");
        email.notice();//op: Email Notification sent
        Notification sms = noticeFactory.getNotification("sms");
        sms.notice();//op: SMS Notification sent
    }
}
