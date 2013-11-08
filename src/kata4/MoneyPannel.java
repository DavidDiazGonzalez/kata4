
package kata4;

import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MoneyPannel extends JPanel{

    public MoneyPannel() {
    this.add(createTextField());
    this.add(new CurrencyPanel());
    }

    private JTextField createTextField() {
        JTextField textField = new JTextField(10);
        return textField;
    }
   
}
