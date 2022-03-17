import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class MachineList {

    private static final List<MachineModel> machineList = new ArrayList<>();

    public static MachineModel addMachine(MachineModel machineModel) {
        machineModel.setSequenceNumber((long) machineList.size() + 1);
        machineList.add(machineModel);
        return machineModel;
    }
}
