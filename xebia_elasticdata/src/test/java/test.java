import org.testng.annotations.Test;

public class test{

    @Test
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir")+ "/src/test/resources/elastic.xls";
        System.out.println("Current dir using System:" +currentDir);
    }
}
