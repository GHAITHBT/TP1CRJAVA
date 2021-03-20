package TP1CR;
import javax.swing.*;
/**
 *
 * @author GHAITH
 */
public class Essai1 extends JFrame{
    private JButton [] boutons;
    public Essai1(){
     JPanel p2=new JPanel();
    JButton haut=new JButton("haut");
    JButton bas=new JButton("bas");
    p2.add(haut);
    setSize(400,190);
    setTitle("Essai1");
    boutons=new JButton[10];
     for(int i=0;i<boutons.length;i++)
     boutons[i]=new JButton("Bouton"+i);
        for(int i=0;i<boutons.length;i++)
            p2.add(boutons[i]);
            add(p2);
            add(haut,"North");
            add(bas,"South");                      
    }
public static void main(String args[])
{Essai1 f = new Essai1();
f.setVisible(true);}
}
