package tayduong.com.demosendemail;

import com.resend.Resend;
import com.resend.core.exception.ResendException;
import com.resend.services.emails.model.CreateEmailOptions;
import com.resend.services.emails.model.CreateEmailResponse;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String email) {
        Resend resend = new Resend("re_....");

        CreateEmailOptions createEmailOptions = CreateEmailOptions.builder()
                .from("Andy <ngocanhnguyen@tayduong.works>")
                .to(email)
                .subject("It's a test email")
                .html("<h1>It's a test email</h1>")
                .build();

        try {
            CreateEmailResponse createEmailResponse = resend.emails().send(createEmailOptions);
            createEmailResponse.getId();
        } catch (ResendException e) {
            e.printStackTrace();
        }

    }
}
