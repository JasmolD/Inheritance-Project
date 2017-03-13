
/**
 * Write a description of class Jotaro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//import java.awt.event.*;
//import javax.swing.*;
//import sun.audio.*;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
/*import java.awt.Desktop;
import java.io.file;
import java.io.IOException;
import java.util.*;*/
public class Jotaro extends JojoStandUsers
{   // instance variables - replace the example below with your own
    int damage;
    public Jotaro(int hp, int atk)
    {
        super(hp, 100);//sends hp to the JoJo class
        damage = atk;
        damage=100;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("The enemy is hurt, they give you a menacing glance");
        super.takeDamage(dmg);
        System.out.println("Za enemy's remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Star Platinum");
        System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
        /*AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        try{
            BGM= new AudioStream(new FileInputStream("Ora.wav"));
            MD= BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }catch (IOException error)
        {
            System.out.println("File not found");
        }
        MGP.start(Loop);*/
        
        /*String bip = "bip.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        AudioPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();*/
        target.takeDamage(damage);

    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public int getAttackValue()
    {
        return damage;
    }
}
