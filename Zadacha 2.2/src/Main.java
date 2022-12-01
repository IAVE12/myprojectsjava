import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> readyChapters = new TreeMap<>(readFIle("Chapter.txt"));
        Map<String, String> sortedMap = readyChapters.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((chapter1,chapter2)->Integer.compare(chapter1.hashCode(),chapter2.hashCode())))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        printResult(sortedMap);
    }public static HashMap<String, String> readFIle(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            HashMap<String, String> chapters = new HashMap<String,String>();
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] cols = line.split(" ");
                if(cols[0].equals("Chapter"))
                {
                    String nextChapter = line;
                    String nextNameOfTheChapter = sc.nextLine();
                    chapters.put(nextNameOfTheChapter, nextChapter);

                }
            }
            return chapters;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!2");
            return null;
        }
    }
    public static void printResult(Map<String,String> readyChapters) {
        try {
            String fileName= "result.txt";
            Files.write(Paths.get(fileName),
                    readyChapters.entrySet().stream().map(k->k.getValue()+"-"+k.getKey()).collect(Collectors.toList()));
        } catch( IOException e){
            System.out.println("Файл не найден!");
        }
    }
}