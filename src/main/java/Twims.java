import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;/*
* */
import java.util.*;
/**
 * Created by kt on 12/23/15.
 */
public class Twims {

    private String tid, token;

    public Twims(String newID, String newToken){

        tid = newID;
        token = newToken;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Twilio ID#: ");
        String tid = sc.next();
        System.out.print("Token: ");
        String token = sc.next();

        Twims newMsg = new Twims(tid, token);
        /*TODO create connection*/
         /*TODO parse message*/
        TwilioRestClient client = new TwilioRestClient(tid, token);

        System.out.println("TID: "+newMsg.getTid());
        System.out.println("Token: "+newMsg.getToken());
        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = messageFactory.create(params);
        System.out.println(message.getSid());
    }//main

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
