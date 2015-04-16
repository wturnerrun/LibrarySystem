package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ForgotPasswordPage extends JPanel
{
	private int userCategoryID;
	private String userID;
	private String userPass;

	private String userFirst;
	private String userLast;

	private JLabel userTypeLabel = new JLabel("USER TYPE");
	private JTextField userTypeText = new JTextField(30);
	private JLabel userIDLabel = new JLabel("User ID");
	private JTextField userIDText = new JTextField(30);

	private JLabel userFirstLabel = new JLabel("FIRST NAME");
	private JTextField userFirstText = new JTextField(30);
	private JLabel userLastLabel = new JLabel("LAST NAME");
	private JTextField userLastText = new JTextField(30);
	private JButton forgotPasswordSubmit = new JButton("CHANGE PASSWORD");


	private JButton backButton = new JButton("BACK");
	private JButton retrievePassword = new JButton("FORGOT PASSWORD");

<<<<<<< HEAD
	private JPanel forgotMenuBar = new JPanel(GridLayout(1,5);
	private JPanel forgotPanel = new JPanel(GridLayout(2,5));
=======
	private JPanel forgotMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel forgotPanel = new JPanel(new GridLayout(2,5));
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b



ForgotPasswordPage()
{
forgotMenuBar.add(backButton);
backButton.addActionListener(new ForgotPasswordListener());
<<<<<<< HEAD
changeMenuBar.add(retrievePassword);
retrievePassword.addActionListener
=======
forgotMenuBar.add(retrievePassword);
retrievePassword.addActionListener(new ForgotPasswordListener());
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b

forgotPanel.add(userTypeLabel);
forgotPanel.add(userTypeText);
forgotPanel.add(userIDLabel);
forgotPanel.add(userIDText);
forgotPanel.add(userFirstLabel);
forgotPanel.add(userFirstText);
forgotPanel.add(forgotPasswordSubmit);
forgotPasswordSubmit.addActionListener(new ForgotPasswordListener());

//Add Panels To Add User
this.setLayout(new BorderLayout());
this.add(forgotMenuBar,BorderLayout.NORTH);
this.add(forgotPanel,BorderLayout.SOUTH);


}
private class ForgotPasswordListener implements ActionListener
{
	public void actionPerformed(ActionEvent forgotPasswordButtonClicked)
	{
		if (forgotPasswordButtonClicked.getSource() == forgotPasswordSubmit)
		{
			if (userTypeText.getText().equals("student")||userTypeText.getText("Student"))
			{
				userID = userIDText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();
				userPass = "";
				Student studentForgot = new Student(userID,userPass);

				if (studentForgot.getID().equals(userIDText.getText())&&studentForgot.getFirstName().equals(userFirstText.getText())&&studentForgot.getLastName().equals(userLastText.getText()))
					{
						userPass = studentForgot.getPass();
						JOptionPane.showMessageDialog(null,"User ID: " + userID +"\n User Name: " + userFirst +" " + userLast + "\n Your Password: " + userPass );

					}


			}
			else if (userTypeText.getText().equals("faculty")||userTypeText.getText("Faculty"))
			{
				userID = userIDText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();
				userPass = "";
				Faculty facultyForgot = new Faculty(userID,userPass);

				if (facultyForgot.getID().equals(userIDText.getText())&& facultyForgot.getFirstName().equals(userFirstText.getText())&&facultyForgot.getLastName().equals(userLastText.getText()))
					{
						userPass = facultyForgot.getPass();
						JOptionPane.showMessageDialog(null,"User ID: " + userID +"\n User Name: " + userFirst +" " + userLast + "\n Your Password: " + userPass );

					}

			}
			else if (userTypeText.getText().equals("librarian")||userTypeText.getText("Librarian"))
			{
				userID = userIDText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();
				userPass = "";
				Librarian librarianForgot = new Librarian(userID,userPass);

				if (librarianForgot.getID().equals(userIDText.getText())&&librarianForgot.getFirstName().equals(userFirstText.getText())&&librarianForgot.getLastName().equals(userLastText.getText()))
					{
						userPass = librarianForgot.getPass();
						JOptionPane.showMessageDialog(null,"User ID: " + userID +"\n User Name: " + userFirst +" " + userLast + "\n Your Password: " + userPass );

					}

			}
			else if (userTypeText.getText().equals("admin")||userTypeText.getText("Admin"))
			{
				userID = userIDText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();
				userPass = "";
				Admin adminForgot = new Admin(userID,userPass);

				if (adminForgot.getID().equals(userIDText.getText())&&adminForgot.getFirstName().equals(userFirstText.getText())&&adminForgot.getLastName().equals(userLastText.getText()))
					{
						userPass = adminForgot.getPass();
						JOptionPane.showMessageDialog(null,"User ID: " + userID +"\n User Name: " + userFirst +" " + userLast + "\n Your Password: " + userPass );

					}

			}
		}
		else if (ChangePasswordButtonClicked.getSource() == backButton)
		{
			AdminPage userAdmin = new AdminPage();

			JFrame addNew = new JFrame(); // creates a new JFrame
			addNew.add(userAdmin); // add the panel to the frame
			addNew.setSize( 500,500 ); // set the desired size
			addNew.setVisible( true ); // show the frame
		}

	}
<<<<<<< HEAD
{
}
=======
}}
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b
