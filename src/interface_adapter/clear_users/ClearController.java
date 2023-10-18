package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearInteractor;
    public ClearController(ClearInputBoundary clearInteractor) {
        this.clearInteractor = clearInteractor;
    }


    public void execute() {
        ClearInputData clearInputData = new ClearInputData();

        clearInteractor.execute(clearInputData);
    }
}
