package Segelverein;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

/**
 * The controller class of the assignment 'Segelverein'.
 * It is used to connect model and view, as well as to encapsulate the data from each other.
 *
 * In the future this class will check the ActionEvent e via the actionPerformed method, via which the controller will be
 *      connected to the view part of this application.
 * @author Raphael Simsek 4CHITM
 * @version 2015-03-17
 */
public class SegelController implements Observer, ActionListener{
    private SegelModel model;
    private SegelView view;
    private SegelTest test;
    private Connection currentCon;

    public SegelController(SegelModel model, SegelView view) throws SQLException{
        this.model=model;
        this.view=view;

        this.view.setVisible(true); //You only set the window visible, once all of the content is loaded to it
    }


    /**
     * Content coming soon
     * @param e Actionevent used to read any hits of a button in the later coming GUI
     */
    public void actionPerformed(ActionEvent ae){

    }

    /**
     * Observer, which shall control the JTable, to observe any changes to it, to then refresh it
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {

    }
    public SegelController getSegelController(){
        return this;
    }
}
