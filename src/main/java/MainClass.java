import javax.inject.Inject;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        Client client = ClientBuilder.newClient();
        Random randomNumber = new Random();
        Long incrementSequenceNumber = 1L;
        while(true) {
            Thread.sleep(5000);
            System.out.println(client.target("http://localhost:8080/api/scope/test/")
                    .path("items/MachineModel")
                    .request(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Basic dGVzdDp0ZXN0dGVzdA==")
                    .post(Entity.entity(new MachineModel(LocalDateTime.now().toString(), (long) randomNumber.nextInt(10) + 1, (long) randomNumber.nextInt(10) + 1,  (long) randomNumber.nextInt(10) + 1, incrementSequenceNumber), MediaType.APPLICATION_JSON))
                    .getStatus());
            incrementSequenceNumber++;
        }
    }
}
