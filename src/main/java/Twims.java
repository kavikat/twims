import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
/**/
import java.util.*;
/**
 * Created by kt on 12/23/15.
 */
public class Twims {
    public static void main(String[] args) throws TwilioRestException {

        Scanner sc = new Scanner(System.in);
        /* Account SID & AUTH Token values require a twilio account */
        System.out.print("ACCOUNT SID: ");
        String tid = sc.next();
        System.out.print("AUTH TOKEN: ");
        String token = sc.next();
        /* Messaging phone number provided by twilio */
        System.out.print("Messaging Phone Number: ");
        String mpn = sc.next();
        System.out.print("Recepient's #: ");
        String rnum = sc.next();
        System.out.print("Message : ");
        String msg = sc.next();

        TwilioRestClient client = new TwilioRestClient(tid, token);

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Body", msg));
        params.add(new BasicNameValuePair("To", rnum));
        params.add(new BasicNameValuePair("From", mpn));

        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = messageFactory.create(params);
        System.out.println(message.getSid());
    }//main
}//twims
