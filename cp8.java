JFrame frame = new JFrame("Title");
//default is to do nothing, so this is necessary
frame.setDefaultClosOperation(JFrame.EIT_ON_CLOSE);
//default is upper left corner of screen
frame.setLocationRelativeTo(null); //centers window
//default is 0 so only decorations will be shown
frame.setSize(100, 100);
//won't see anything if you forget this
frame.setVisible(true);

JFrame frame1 = new JFrame("Frame 1");
JTextField tf1 = new JTextField("Type here...");
frame1.add(tf1);
