import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//클래스내에 클래스이벤트로 구현
public class InnerClassListener extends JFrame {
    //생성자
    public InnerClassListener() {
        //윈도우 설정
        setTitle("이벤트 작업");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);

        //작업지 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //객체추가
        JButton btn = new JButton("Action");
        c.add(btn);
        btn.addActionListener(new MuActionListener());

        setVisible(true);
    }
    //InnerClassListener 클래스안에 이벤트 클래스를 구성
    private class MuActionListener implements ActionListener{
        @Override//추상메소드의 내용을 변경
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("Action")){
                b.setText("액션");
            }else {
                b.setText("Action");
            }
            //InnerClassListener(윈도우창).this(멤버,InnerClassListener)에 setTitle(제목을 변경)
            InnerClassListener.this.setTitle(b.getText());
        }


    }
    //시작
    public static void main(String[] args) {
        new InnerClassListener();
    }
}