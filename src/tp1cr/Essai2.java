package TP1CR;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author GHAITH
 */
public class Essai2 extends JFrame{
    private JButton [] boutons;
    public Essai2()
    {JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JButton haut=new JButton("Haut");
    JButton bas=new JButton("Bas");
    JButton bouton0=new JButton("Bouton0");
    JButton bouton5=new JButton("Bouton5");
    setSize(360,210);
    setTitle("Essai2");
    boutons=new JButton[5];
    p2.add(haut);
    p3.add(bas);
p1.setLayout(new GridLayout(5,1));
p1.add(p2);
p1.add(bouton0);
p1.add(p4);
p1.add(bouton5);
p1.add(p3);
  for(int i=0;i<boutons.length;i++)
     boutons[i]=new JButton("Bouton"+i);
  for(int i=0;i<boutons.length;i++)
            p4.add(boutons[1]);
            p4.add(boutons[2]);
            p4.add(boutons[3]);
            p4.add(boutons[4]);
            add(p1);                   
    }
public static void main(String args[])
{Essai2 f = new Essai2();
f.setVisible(true);}
}
