package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyAccount extends JPanel
{
//Profile Frames
private JFrame studentFrame= new JFrame();
private JFrame facultyFrame= new JFrame();
private JFrame librarianFrame= new JFrame();
private JFrame adminFrame = new JFrame();

//Variables Passed In To Verify Users
private String userID;
private String userPass;
private int userCategoryID;

 //User Objects of Entities
 Student student=new Student(userID,userPass);
 Admin admin = new Admin(userID,userPass);
 Faculty faculty= new Faculty(userID,userPass);
 Librarian librarian = new Librarian(userID,userPass);


//Media Objects of Entities
Book book = new Book();
Cd cd= new Cd();
Movie movie = new Movie();

//Login Variables
private JButton loginButton = new JButton("LOGIN");
private JPanel loginPanel = new JPanel();
private JTextField loginIDText = new JTextField(15);
private JPasswordField passwordText = new JPasswordField(15);
private JLabel userLabel = new JLabel("LOGIN ID: ");
private JLabel passLabel = new JLabel("PASSWORD: ");

MyAccount(){

    loginPanel.add(userLabel);
    loginPanel.add(loginIDText);
    loginPanel.add(passLabel);
    loginPanel.add(passwordText);
    loginPanel.add(loginButton);
    loginButton.addActionListener(new LoginListener());
    loginPanel.add(category);
    this.add(loginPanel);


}
private class LoginListener implements ActionListener
{
	public void actionPerformed(ActionEvent loginClicked)
	{
		{
		            userID = loginIDText.getText();
		            userPass = passwordText.getText();

				  if(student.isLoggedin())
		            {
						StudentPage studentProfile=new StudentPage();

						studentFrame.add(studentProfile); //Add the student Page Panel
						studentFrame.setSize( 955,500 ); // Set studentFrame Size
						studentFrame.setLocation(0,100);
						studentFrame.setVisible( true ); // Show studentFrame

					}
				  else if(faculty.isLoggedin())
					{
						FacultyPage facultyProfile=new FacultyPage();

						facultyFrame.add(facultyProfile); //Add the Faculty Page Panel
<<<<<<< HEAD
						facultyFrame.setSize( 950,750 ); // Set facultyFrame Size
=======
						facultyFrame.setSize( 955,500 ); // Set facultyFrame Size
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b
						facultyFrame.setLocation(0,100);
						facultyFrame.setVisible( true ); // Show facultyFrame

					}
				  else if(librarian.isLoggedin())
					{
						LibrarianPage librarianProfile=new LibrarianPage();

						librarianFrame.add(librarianProfile); //Add the librarian Page Panel
<<<<<<< HEAD
						librarianFrame.setSize( 950,750 ); // Set librarianFrame Size
=======
						librarianFrame.setSize( 955,500 ); // Set librarianFrame Size
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b
						librarianFrame.setLocation(0,100);
						librarianFrame.setVisible( true ); // Show librarianFrame

					}
				  else if(admin.isLoggedin())
					{
						AdminPage adminProfile=new AdminPage();

						adminFrame.add(adminProfile); //Add the Admin Page Panel
<<<<<<< HEAD
						adminFrame.setSize( 950,750 ); // Set adminFrame Size
=======
						adminFrame.setSize( 955,500 ); // Set adminFrame Size
>>>>>>> aafbd36bac81292fa68cfbad1cc9e2ef5ef9ff9b
						adminFrame.setLocation(0,100);
						adminFrame.setVisible( true ); // Show adminFrame
					}


				  else
		            {
				JOptionPane.showMessageDialog(null,"Invalid LoginID or Password");
		                loginIDText.setText("");
		                passwordText.setText("");
		                loginIDText.requestFocus();
		            }

        }
	}
}



}





