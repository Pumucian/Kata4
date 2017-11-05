package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {

    public static void main(String[] args) throws IOException {
            String filename = "C:\\Users\\fali0\\Documents\\NetBeansProjects\\Kata4\\emailsfile.txt";
            List<Mail> mailList = MailListReader.read(filename);
            Histogram<String> histogram = MailHistogramBuilder.build(mailList);
            HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
            histoDisplay.execute();
    }
    
}
