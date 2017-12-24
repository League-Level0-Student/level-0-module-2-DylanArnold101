package methods;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String c = JOptionPane.showInputDialog("What is you test score?");
	int t = Integer.parseInt(c);
	if(t>=98) {JOptionPane.showMessageDialog(null, "you got an a+ ");}
	else if(t>=94&&t<98) {JOptionPane.showMessageDialog(null, "you got an a ");}
	else if(t>=90&&t<94) {JOptionPane.showMessageDialog(null, "you got an a- ");}
	else if(t>=88&&t<90) {JOptionPane.showMessageDialog(null, "Wow you got a b+");}
	else if(t>=84&&t<88) {JOptionPane.showMessageDialog(null,"you got a b");}
	else if(t>=80&&t<84) {JOptionPane.showMessageDialog(null, "you got a b- ");}
	else if(t>=78&&t<80 ) {JOptionPane.showMessageDialog(null, "you got a c+  ");}
	else if(t>=74&&t<78 ) {JOptionPane.showMessageDialog(null, "you got a c ");}	
	else if(t>=70&&t<74 ) {JOptionPane.showMessageDialog(null, "you got a c- ");}
	else if(t>=68&&t<70 ) {JOptionPane.showMessageDialog(null, "you got a d+ ");}
	else if(t>=64&&t<68 ) {JOptionPane.showMessageDialog(null, "you got a d ");}
	else if(t>=60&&t<64 ) {JOptionPane.showMessageDialog(null, "you got a d-");}
	else if(t<=60 ) {JOptionPane.showMessageDialog(null, "you got an f ");}



















}
}
