package librarysystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class AdvancedSearchPage extends JPanel
{

//Advanced Search Entity Variables
Book advancedBook = new Book();
Cd advancedCD = new Cd();
Movie advancedMovie = new Movie();


private JPanel advancedSearchTitleFields = new JPanel(new GridLayout(1,3));
private JPanel advancedSearchAuthorFields = new JPanel();
private JPanel advancedSearchISBNFields = new JPanel();
 

private JLabel mediaTitle = new JLabel("Title");
private JLabel mediaAuthor = new JLabel("Author");
private JLabel mediaISBN = new JLabel("ISBN");

private JTextField titleText = new JTextField();
private JTextField authorText = new JTextField();
private JTextField isbnText = new JTextField();

private JButton titleSearch = new JButton("SEARCH");
private JButton authorSearch = new JButton("SEARCH");
private JButton isbnSearch = new JButton("SEARCH");




}
AdvancedSearchPage()
{
advancedSearchTitleFields.add(mediaTitle);
advancedSearchTitleFields.add(titleText);
advancedSearchTitleFields.add(titleSearch);


advancedSearchAuthorFields.add(mediaAuthor);
advancedSearchAuthorFields.add(authorText);
advancedSearchAuthorFields.add(authorSearch);

advancedSearchISBNFields.add(mediaISBN);
advancedSearchISBNFields.add(isbnText);
advancedSearchISBNFields.add(isbnSearch);

this.setLayout(new BorderLayout());
this.add(advancedSearchTitleFields,BorderLayout.NORTH);
this.add(advancedSearchAuthorFields,BorderLayout.CENTER);
this.add(advancedSearchISBNFields,BorderLayout.SOUTH);

}
private class AdvancedSearchListener implements ActionListener
{
public void actionPerformed(ActionEvent advancedSearchClicked)
{
	if (advancedSearchClicked.getSource()==titleSearch)
	{
		if (mediaTitle ==advancedBook.getBook()) ;
		{
		
		}
	}
	else if (advancedSearchClicked.getSource()==authorSearch)
	{
	}
	else if (advancedSearchClicked.getSource()==isbnSearch)
	{
	}
}
}

}