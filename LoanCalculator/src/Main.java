import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        /*int a = 100;
        int m = 360;
        double y = 0.049;*/
        /*LoanCalculator loanCalculator = new LoanCalculator(a, m, y);
        loanCalculator.avgInterest();
        loanCalculator.avgCaption();
        loanCalculator.print();*/
        JFrame window= new JFrame();
        window.setLayout(new FlowLayout());

        window.setSize(600,400);
        window.setTitle("贷款计算器");

        JLabel labelAmount = new JLabel("贷款总额");
        JLabel labelPeriod = new JLabel("贷款期数");
        JLabel labelInterest = new JLabel("贷款年利率");

        JTextField textAmount = new JTextField();
        JTextField textPeriod = new JTextField();
        JTextField textInterest = new JTextField();
        textAmount.setColumns(10);
        textPeriod.setColumns(10);
        textInterest.setColumns(10);

        JRadioButton radioAvgCaption = new JRadioButton("等额本金");
        JRadioButton radioAvgInterest = new JRadioButton("等额本息");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioAvgCaption);
        buttonGroup.add(radioAvgInterest);

        JLabel labelTotalInterest = new JLabel("总利息");
        JTextField textTotalInterest = new JTextField();
        textTotalInterest.setColumns(20);

        JButton button = new JButton("计算");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //读取输入
                int amount = Integer.parseInt(textAmount.getText()) ;
                int period = Integer.parseInt(textPeriod.getText()) ;
                double yearInterest = Double.parseDouble(textInterest.getText());
                //计算
                LoanCalculator loanCalculator = new LoanCalculator(amount, period, yearInterest);
                double result=0.0;
                if(radioAvgCaption.isSelected()) {
                    result = loanCalculator.avgCaption();
                }else {
                    result = loanCalculator.avgInterest();
                }
                //输出
                textTotalInterest.setText(String.valueOf(result));
            }
        });


        window.add(labelAmount);
        window.add(textAmount);
        window.add(labelPeriod);
        window.add(textPeriod);
        window.add(labelInterest);
        window.add(textInterest);
        window.add(radioAvgCaption);
        window.add(radioAvgInterest);
        window.add(labelTotalInterest);
        window.add(textTotalInterest);
        window.add(button);

        window.setVisible(true);
    }
}
