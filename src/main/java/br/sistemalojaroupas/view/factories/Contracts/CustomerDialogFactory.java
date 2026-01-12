package br.sistemalojaroupas.view.factories.Contracts;
import br.sistemalojaroupas.model.entities.Customer;
import javax.swing.JDialog;
import java.awt.Frame;

public interface CustomerDialogFactory {
    JDialog createDialog(Frame parent, boolean modal, Customer customer);
}