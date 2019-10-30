
package kata4_main;

import java.util.List;
import kata4_model.Histogram;
import kata4_model.Mail;
import kata4_view.HistogramDisplay;
import kata4_view.MailHistogramBuilder;
import kata4_view.MailListReader;


public class kata4 {
    
    public static void main(String[] args){
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
    }
    
}
