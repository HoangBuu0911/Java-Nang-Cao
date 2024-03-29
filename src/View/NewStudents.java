package View;

import javax.swing.*;

public class NewStudents {
    private JPanel rootPanel;
    private JTextField txtFullName;
    private JComboBox cbGender;
    private JTextField txtBirthYear;

    String[] Gender = {"Male", "female"};

    public JPanel getRootPanel()
    {
        for (int i = 0; i < Gender.length; i++) {
            cbGender.addItem(Gender[i]);
        }
        return rootPanel;
    }

    public String getFullName(){
        if(txtFullName.getText().equals("")){
            return null;
        }
        else {
            return txtFullName.getText();
        }

    }

    public String getGender(){
        if(cbGender.getSelectedItem().toString().equals("")){
            return "";
        }
        else {
            return cbGender.getSelectedItem().toString();
        }

    }
}
