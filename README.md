# guerrilla-mail-client
Guerrilla Mail Java Client

Java client for creating and accessing a Guerilla Mailbox.

To create a new mailbox:
```
io.littleblackdog.guerrillamailclient.Mailbox mailbox = new Mailbox();
```

To get the address of the mailbox:
```
String emailAddress = mailbox.getAddress();
```

To check the maibox:
```
List<io.littleblackdog.guerrillamailclient.models.Mail> = mailbox.checkEmail();
```
