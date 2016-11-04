package kata4;

import java.io.File;

public class Kata4 {
    public static void main(String[] args) {
        File file = new File ("c:\\pub");
        print(file.listFiles(),"");
    }
    
    private static void print (File[] files, String indent){
        if (files == null) return;
        for (File file : files){
            System.out.println(indent +(file.isDirectory()? "+" : "-") + file.getName());
            if(!file.isDirectory() || file.isHidden()) continue;
            print (file.listFiles(), indent + " ");
        }
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
