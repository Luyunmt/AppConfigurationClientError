import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import com.azure.data.appconfiguration.ConfigurationClient;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.data.appconfiguration.credentials.ConfigurationClientCredentials;
import com.azure.data.appconfiguration.models.ConfigurationSetting;

public class Test {
    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
     String connectionString="Your AppConfiguration connectString";
    ConfigurationClient client = new ConfigurationClientBuilder()
    .credential(new ConfigurationClientCredentials(connectionString))
    .buildClient();
    ConfigurationSetting setting =client.setSetting("sql1","123");
    ConfigurationSetting setting1=client.getSetting("sql1");
    System.out.println(setting1.key() + "\n"+setting1.value());
 }
}