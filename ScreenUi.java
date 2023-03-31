import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ScreenUi extends JPanel {
    int ibean =100;
    int icup=10 ;
    int iwater =1000;
    int imilk =1000;
    int cash =100  ;

    public ScreenUi() {
        
        JFrame frame1 = new JFrame("Coffee Machine");
          
        JLabel menu = new JLabel("                        Coffee menu        ");
        menu.setFont(new Font("Arial", Font.ITALIC, 80)); 

        JTextField textf = new JTextField(); // field
        textf.setPreferredSize(new Dimension(10,30));
        textf.setFont(new Font("", Font.ITALIC, 20));
         
        JLabel staff = new JLabel(""); //staffUI
        staff.setBackground(Color.BLUE);
        staff.setPreferredSize(new Dimension(140,140));

        JLabel background = new JLabel() ;
        ImageIcon imageIconn = new ImageIcon(new ImageIcon("C:\\CoffeeMachine\\cafe.jpg").getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
        background.setSize(1920,1080);
        background.setIcon(imageIconn);

       
        JButton btn = new JButton("Espresso") ;
        btn.setForeground(Color.black);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setPreferredSize(new Dimension(250,250)); // button size
        btn.setFont(new Font("", Font.ITALIC, 40)); // set font+ text size
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:\\CoffeeMachine\\esp.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); // image size
        btn.setIcon(imageIcon1);
        btn.setHorizontalTextPosition(JButton.CENTER); // location of text
        btn.setVerticalTextPosition(JButton.BOTTOM);//location text
       

        JButton btn1 = new JButton("Latte") ;
        btn1.setPreferredSize(new Dimension(250,250)); // button size
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setFont(new Font("", Font.ITALIC, 40)); // set font+ text size
        ImageIcon latte = new ImageIcon(new ImageIcon("C:\\CoffeeMachine\\latte.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); // image size
        btn1.setIcon(latte);
        btn1.setHorizontalTextPosition(JButton.CENTER); // location of text
        btn1.setVerticalTextPosition(JButton.BOTTOM);//location text
      

        JButton btn2 = new JButton("Cappucino") ;
        btn2.setPreferredSize(new Dimension(250,250)); // button size
        btn2.setFont(new Font("", Font.ITALIC, 40)); // set font+ text size
        btn2.setForeground(Color.black);
        btn2.setBackground(Color.LIGHT_GRAY);
        ImageIcon cappu = new ImageIcon(new ImageIcon("C:\\CoffeeMachine\\cappu.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); // image size
        btn2.setIcon(cappu);
        btn2.setHorizontalTextPosition(JButton.CENTER); // location of text
        btn2.setVerticalTextPosition(JButton.BOTTOM);//location text
       

        JButton take = new JButton("money"); // take money
        take.setPreferredSize(new Dimension(120,50));
     
        JButton milk = new JButton("milk 1000ml"); //fill milk
        milk.setPreferredSize(new Dimension(120,50));
      
        JButton cup = new JButton("cup 10pieces"); // fill cup
        cup.setPreferredSize(new Dimension(120,50));

        JButton bean = new JButton("bean 100g"); // fill bean
        bean.setPreferredSize(new Dimension(120,50));

        JButton water = new JButton("water 1000ml"); //fill water
        water.setPreferredSize(new Dimension(120,50));

        JButton check = new JButton("remaining"); //check
        check.setPreferredSize(new Dimension(120,50));


        Container c = frame1.getContentPane();
        c.setBackground(Color.lightGray);        
        c.add(staff,BorderLayout.EAST);
        c.add(background);
        background.setLayout(new FlowLayout());
        c.add(menu,BorderLayout.NORTH);
        c.add(staff,BorderLayout.EAST);
        c.add(textf,BorderLayout.SOUTH);
        background.add(btn);
        background.add(btn1);
        background.add(btn2);
        staff.setLayout(new FlowLayout());
        staff.add(take);
        staff.add(check);
        staff.add(milk);
        staff.add(water);
        staff.add(bean);
        staff.add(cup);

        frame1.setSize(1920, 1080);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(canMakeCoffee(16,0,250)==true)
                {
ibean -=16 ;
 imilk -=0;
 iwater -=250 ;
 icup-=1;
 cash += 4 ;
                    textf.setText("I have enough resources, making you a coffee!");
                 } else {

                    textf.setText("Sorry, not enough resources!");}} });



        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(canMakeCoffee(20,75,350)==true)
                {
                    ibean -=20 ;
                    imilk -=75;
                    iwater -=350 ;
                    icup-=1;
                    cash += 7 ;
                    textf.setText("I have enough resources, making you a coffee!");
                } else {
                    textf.setText("Sorry, not enough resources!");}} });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            { if(canMakeCoffee(12,100,200)==true)
                {
                    ibean -=12 ;
                    imilk -=100;
                    iwater -=200 ;
                    icup-=1;
                    cash += 6 ;
                    textf.setText("I have enough resources, making you a coffee!");
                } else {
                    textf.setText("Sorry, not enough resources!");
                }}});

        milk.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        imilk += 1000 ;
        textf.setText("fill milk 1000 ml");}});


        bean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ibean += 100 ;
                textf.setText("fill beans 100 g");}  });

        water.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iwater += 1000 ;
                textf.setText("fill water 1000 ml");}});

        cup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                icup += 10 ;
                textf.setText("fill cups 10 piece");} });

        take.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textf.setText("took"+cash +"baht");
                cash =0 ; } });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textf.setText(" milk"+imilk +" ml "+"  water"+iwater+" ml"+"  bean"+ibean +" g "+"  cup"+icup +" piece"); } });
   }

    public boolean canMakeCoffee(int beansNeeded, int milkNeeded, int waterNeeded) {
        return ibean >= beansNeeded && imilk >= milkNeeded && iwater >= waterNeeded && icup >=1;    }

    public static void main(String[] args)    {

        ScreenUi coffeeMachineUi = new ScreenUi();

    }
}