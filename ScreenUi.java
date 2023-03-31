import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ScreenUi {

    public ScreenUi() {


        JFrame frame1 = new JFrame("Coffee");

        JLabel menu = new JLabel("        Coffee menu");
        menu.setFont(new Font("Courier New", Font.BOLD, 60));


        JLabel background = new JLabel() ;
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("D:\\piccoffee\\oo.jpg").getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
        background.setSize(800,900);
        background.setIcon(imageIcon);


        JLabel staff = new JLabel(""); 
        staff.setForeground(Color.lightGray);
        staff.setPreferredSize(new Dimension(140,140));


        JButton take = new JButton("Take"); 
        take.setPreferredSize(new Dimension(120,45));
        take.setBackground(new Color(153, 255, 153));

        JButton fill = new JButton("Fill"); 
        fill.setPreferredSize(new Dimension(120,45));
        fill.setBackground(new Color(153, 255, 153));

        JButton out = new JButton("Exit"); 
        out.setPreferredSize(new Dimension(120,45));
        out.setBackground(new Color(153, 255, 153));

        JButton check = new JButton("Remaining"); 
        check.setPreferredSize(new Dimension(120,45));
        check.setBackground(new Color(153, 255, 153));

        JTextField textf = new JTextField(); 
        textf.setPreferredSize(new Dimension(10,30));
        textf.setFont(new Font("Courier New", Font.BOLD, 20));
        textf.setHorizontalAlignment(JTextField.CENTER);
        textf.setBackground(new Color(153, 255, 246));


        JButton btn = new JButton("Latte") ;
        btn.setPreferredSize(new Dimension(250,250)); 
        btn.setFont(new Font("", Font.BOLD, 30)); 
        btn.setForeground(Color.black);
        btn.setBackground(Color.white);
        ImageIcon latte = new ImageIcon(new ImageIcon("D:\\piccoffee\\la.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
        btn.setIcon(latte);
        btn.setHorizontalTextPosition(JButton.CENTER); 
        btn.setVerticalTextPosition(JButton.TOP);


        JButton btn1 = new JButton("Cappucino") ;
        btn1.setPreferredSize(new Dimension(250,250)); 
        btn1.setFont(new Font("", Font.BOLD, 30)); 
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.white);
        ImageIcon cappucino = new ImageIcon(new ImageIcon("D:\\piccoffee\\Ca.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
        btn1.setIcon(cappucino);
        btn1.setHorizontalTextPosition(JButton.CENTER); 
        btn1.setVerticalTextPosition(JButton.TOP);



        JButton btn2 = new JButton("Espresso") ;
        btn2.setPreferredSize(new Dimension(250,250)); 
        btn2.setFont(new Font("", Font.BOLD, 30)); 
        btn2.setForeground(Color.black);
        btn2.setBackground(Color.white);
        ImageIcon esspresso = new ImageIcon(new ImageIcon("D:\\piccoffee\\Es.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
        btn2.setIcon(esspresso);
        btn2.setHorizontalTextPosition(JButton.CENTER); 
        btn2.setVerticalTextPosition(JButton.TOP);


        Container f = frame1.getContentPane();
        f.setBackground(Color.white);
        f.add(background);
       
        f.add(menu,BorderLayout.NORTH);
        f.add(staff,BorderLayout.WEST);
        f.add(textf,BorderLayout.SOUTH);
        background.add(btn);
        background.add(btn1);
        background.add(btn2);
        background.setLayout(new FlowLayout());
        staff.add(fill);
        staff.add(take);
        staff.add(check);
        staff.add(out);
        staff.setLayout(new FlowLayout());
        frame1.setSize(800, 900);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(canMakeCoffee(16,0,250)==true)
                {
                    coffeeBeans -=20 ;
                    milk -=75;
                    water -=350 ;
                    cups-=1;
                    money += 7 ;
                    textf.setText("I have enough stuff, making you a Latte!");
                } else {

                    textf.setText("Sorry, not enough resources!");}} });



        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(canMakeCoffee(20,75,350)==true)
                {
                    coffeeBeans -=12 ;
                    milk -=100;
                    water -=200 ;
                    cups-=1;
                    money += 6 ;
                    textf.setText("I have enough stuff, making you a Cappucino!");
                } else {
                    textf.setText("Sorry, not enough stuff!");}} });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(canMakeCoffee(12,100,200)==true)
                {
                    coffeeBeans -=16 ;
                    milk -=0;
                    water -=250 ;
                    cups-=1;
                    money += 4 ;
                    textf.setText("I have enough stuff, making you a Espresso!");
                } else {
                    textf.setText("Sorry, not enough stuff!");
                }}});

        fill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milk += 1000 ;
                coffeeBeans += 100 ;
                water += 1000;
                cups += 10;
                textf.setText("fill all");}});

        out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(money);}});

        take.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textf.setText("took "+money +" dollar.");
                money =0 ; } });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textf.setText(" milk"+milk +" milliliter "+"  water"+water+" milliliter "+"  bean"+coffeeBeans +" gram "+"  cup"+cups +" piece"); } });
        textf.setFont(new Font("Courier New", Font.BOLD, 15));
    }


    int coffeeBeans  =100;
    int cups   =10;
    int water  =1000;
    int milk  =1000;
    int money   =100;



    public boolean canMakeCoffee(int neededbeans, int neededmilk, int neededwater) {
        return coffeeBeans >= neededbeans && milk >= neededmilk && water >= neededwater && cups >=1;
    }

    public static void main(String[] args)    {

        ScreenUi screenUi = new ScreenUi();

    }
}