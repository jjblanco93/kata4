package kata4;

import java.io.File;

public class Kata4 {
    public static void main(String[] args) {
        File file = new File ("c:\\");
        print(file.listFiles(),"");
    }
}
    /*public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        new HistogramDisplay(histogram).execute();
    }*/
