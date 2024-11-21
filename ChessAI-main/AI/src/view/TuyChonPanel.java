package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.DuLieuCoVua;
public class TuyChonPanel extends JFrame implements ActionListener{

     JRadioButton btTrang;
     JRadioButton btden;
     JButton ok;
     JButton cancel;
     final static int TRANG = 0;
     final static int DEN = 1;
     Main CoVua;

    public TuyChonPanel(Main covua){
        super("옵션");
        this.CoVua = covua;
        JPanel mainPane = new JPanel(new BorderLayout());
        mainPane.add(chonQuanCotheomau(),BorderLayout.NORTH);
        mainPane.add(taonutchon(),BorderLayout.SOUTH);
        mainPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setContentPane(mainPane);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ok.addActionListener(this);
        cancel.addActionListener(this);
    }
    public JPanel chonQuanCotheomau(){
        JPanel chonQuanCoTheoMau = new JPanel(new GridLayout(1,2));
        btTrang = new JRadioButton("흰색 체스를 두다",true);
        btden = new JRadioButton("검은색 체스를 두다");
        ButtonGroup group = new ButtonGroup();
        group.add(btTrang);
        group.add(btden);
        chonQuanCoTheoMau.add(btTrang);
        chonQuanCoTheoMau.add(btden);
        chonQuanCoTheoMau.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(5,5,5,5),
                BorderFactory.createTitledBorder("말의 색상을 선택 ")));
        return chonQuanCoTheoMau;
    }
    public JPanel taonutchon(){
        JPanel buttonPane = new JPanel(new BorderLayout());
        JPanel pane = new JPanel(new GridLayout(1,2,5,0));
        pane.add(ok = new JButton("게임 시작"));
        pane.add(cancel = new JButton("취소"));
        buttonPane.add(pane,BorderLayout.EAST);
        buttonPane.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(5,5,5,5),
                BorderFactory.createTitledBorder("당신은 무엇을 하고 싶습니까?")));
        return buttonPane;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ok){
            CoVua.trangThai = DuLieuCoVua.DAKETTHUC;
            CoVua.init();           
        }
        setVisible(false);
    }
}
