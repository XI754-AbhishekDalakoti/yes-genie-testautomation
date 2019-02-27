import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utility.HBaseClient;
import utility.ImportHbaseData;

public class CreateDataTest  implements JavaSamplerClient  {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateDataTest.class);


    public static void createTest(String tableName) throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable(tableName);
    }


    public static Boolean updateData(String tableName, String rowKey, String field, String value) throws Exception {

        Boolean output = true;
        try {
            ImportHbaseData.createConnection();
            ImportHbaseData.updateRowkeyHbase(tableName, rowKey, field, value);
        } catch (Exception e) {
            output = false;
        }
        return output;
    }

    public void setupTest(JavaSamplerContext javaSamplerContext) {
    }
    
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        String var1 = javaSamplerContext.getParameter("var1");
        String var2 = javaSamplerContext.getParameter("var2");
        String var3 = javaSamplerContext.getParameter("var3");
        String var4 = javaSamplerContext.getParameter("var4");
        SampleResult result = new SampleResult();
        result.sampleStart();
        result.setSampleLabel("Test Sample");
        // Test Code
        CreateDataTest createDataTest = new CreateDataTest();
        try {
			if(createDataTest.updateData(var1,var2,var3,var4)) {
			    result.sampleEnd();
			    result.setResponseCode("200");
			    result.setResponseMessage("OK");
			    result.setSuccessful(true);
			} else {
			    result.sampleEnd();
			    result.setResponseCode("500");
			    result.setResponseMessage("NOK");
			    result.setSuccessful(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        return result;
    }
    public void teardownTest(JavaSamplerContext javaSamplerContext) {
    }
    public Arguments getDefaultParameters() {
        Arguments defaultParameters = new Arguments();
        defaultParameters.addArgument("var1","genie_recomendations");
        defaultParameters.addArgument("var2","998003452_143");
        defaultParameters.addArgument("var3","status");
        defaultParameters.addArgument("var4","open");
        return defaultParameters;
    }
}






