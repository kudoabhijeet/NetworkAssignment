import java.io.*;
import java.util.*;

class MainDriver {
    public static void main(String[] args) {
        String command = "netsh interface ipv4 set address name=\"Wi-Fi\" static 192.168.3.8 255.255.255.0 192.168.3.1";

		try {
			Process process = Runtime.getRuntime().exec(command);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}