/*
import java.nio.file.Files;
import java.nio.file.Paths;

public class CorrectFormat {

    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("Sheet1.json")));
            System.out.println("content is " + content);
            content =content.replaceAll("\"row[0-9]+", "");
            System.out.println("content after replace is " + content);
            String[] ar = content.split(",\":");
            System.out.println("array is");
            for (int i=0;i<ar.length;i++){
                ar[i] =ar[i].replaceAll("\\{\":", "");
                ar[i] =ar[i].replaceAll("\\}\\}", "}");

                //Logic for json to string conversion
                ar[i] =ar[i].replaceAll("\"", "\\\"");
                System.out.println(ar[i]);



            }



        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}*/
