package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    
    public static void main(String[] args) throws IOException {
        Kata4 a = new Kata4();
        a.execute();
    }

    private void execute() throws IOException{
        input();
        process();
        output();
    }
            
    private void input() throws IOException{
        String filename = "C:\\Users\\fali0\\Documents\\NetBeansProjects\\Kata4\\emailsfile.txt";
        mailList = MailListReader.read(filename);        
    }
            
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    } 
            
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();        
    }
            
    
    
}
