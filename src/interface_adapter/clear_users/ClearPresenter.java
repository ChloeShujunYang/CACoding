package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.login.LoginViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {

    @Override
    public void prepareSuccessView(ClearOutputData user) {

        JOptionPane.showMessageDialog(null, user.returnUsernames());

    }


}
