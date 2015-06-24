import java.util.Properties;

public class AppInfo {

    static {
	Properties props = new Properties();
	try {
	    props.load(AppInfo.class.getResourceAsStream("/version.properties"));
	    System.out.println(props);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static void main(String args[]) {
	AppInfo a = new AppInfo();
    }
}
