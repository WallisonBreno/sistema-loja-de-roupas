package br.sistemalojaroupas.view.factories;


import br.sistemalojaroupas.model.entities.Customer;
import br.sistemalojaroupas.view.registration.Register_And_Edit_Customer;
import br.sistemalojaroupas.view.factories.Contracts.CustomerDialogFactory;
import javax.swing.JDialog;
import java.awt.Frame;


public class EditCustomerFactory implements CustomerDialogFactory {
    @Override
    public JDialog createDialog(Frame parent, boolean modal, Customer customer) {
        return new Register_And_Edit_Customer(parent, modal, customer);
    }
}