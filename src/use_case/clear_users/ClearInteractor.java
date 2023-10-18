package use_case.clear_users;

// TODO Complete me


import use_case.signup.SignupOutputData;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary userPresenter;
    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
        ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }
    @Override
    public void execute(ClearInputData clearInputData) {
        ClearOutputData clearOutputData = new ClearOutputData(this.clearUserDataAccessObject.get());
        this.clearUserDataAccessObject.delete();
        userPresenter.prepareSuccessView(clearOutputData);
    }

}
