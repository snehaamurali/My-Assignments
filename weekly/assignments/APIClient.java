package weekly.assignments;

public class APIClient {
	

	    // Overloaded Method 1 – accepts one argument
	    public void sendRequest(String endpoint) {
	        System.out.println("Sending GET request to endpoint: " + endpoint);
	    }

	    // Overloaded Method 2 – accepts three arguments
	    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	        System.out.println("Sending POST request to endpoint: " + endpoint);
	        System.out.println("Request Body: " + requestBody);
	        System.out.println("Request Success Status: " + requestStatus);
	    }

	    public static void main(String[] args) {

	        // Create object of APIClient
	        APIClient client = new APIClient();

	        // Call the first method (1 parameter)
	        client.sendRequest("/users");

	        // Call the overloaded method (3 parameters)
	        client.sendRequest("/login", "{username:'test', password:'123'}", true);
	    }
	}


