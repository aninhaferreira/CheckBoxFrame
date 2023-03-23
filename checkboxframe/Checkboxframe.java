
package checkboxframe;
import java.awt.FlowLayout;
import java.awt. Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Checkboxframe extends JFrame{

private JTextField textField;
private JCheckBox boldJCheckBox;
private JCheckBox italicJCheckBox;


public Checkboxframe()
{
super( "CheckBox Test");
setLayout( new FlowLayout());

textField = new JTextField("Watch the font style change, 20" );

textField.setFont(new Font("Serif", Font.PLAIN,14));
add (textField );
BoldJCheckBox = new JCheckBox("Bold");
italicJCheckBox = new JCheckBox("italic");
add(boldJCheckBox);
add(italicJCheckBox);

CheckBoxHandler handler = new CheckBoxHandler();
}
private class CheckBoxHandler implements ItemListener
{
public void intemStateChanged(ItemEvent event)
{
Font font = null;
if(boldJCheckBox.isSelected()&& italicJCheckBox.isSelected())
font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
else if(boldJCheckBox.isSelected() )
font = new Font("Serif", Font.BOLD, 14);
else if(italicJCheckBox.isSelected() )
font = new Font("Serif", Font.ITALIC, 14);
else
font = new Font("Serif", Font.PLAIN, 14);

textField.setFont( font);
}

}
}
    

