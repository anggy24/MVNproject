package id.ac.pcr.apps;
import javax.swing.*;
public class App 
{
    public static void main( String[] args ){
        AppTest ap = new AppTest();
        
        String a,b;
        a = "Nilai";
        System.out.println(a);
        JOptionPane.showMessageDialog(null, a+" = "+ap.getC());
    }
}
