package stackoverflowAnswers.formfactor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scan {
    static class ScanFile1 extends Thread {
        String result1 = "00";

        public String getResult() {
            return result1;
        }

        public void setResult(String result1) {
            this.result1 = result1;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }

                System.out.println("CUCAN!");


                try {
                    BufferedReader iu = new BufferedReader(new FileReader("lala.txt"));
                    String ki;
                    ki = iu.readLine();
                    iu.close();
                    String x = ki;
                    setResult(x);

                    System.out.println("x=" + x);
                    System.out.println("result = " + result1);

                } catch (FileNotFoundException fnfe) {

                    String x = "0";
                } catch (IOException ex) {
                    Logger.getLogger(FormFactor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
