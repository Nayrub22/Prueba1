# Eventos e Interfaces De Escucha 

| **Interface** | **Metodos** |
| ------------- | ------------- |
| ActionListener  | actionPerformed(ActionEvent e)  |
| KeyListener  | keyPressed(KeyEvent e)<br> keyReleased(KeyEvent e) <br> keyTyped(KeyEvent e)|
| FocusListener | focusGained(FocusEvent e) <br> focusLost(FocusEvent e) |
| MouseListener | mouseClicked(MouseEvent e) <br> mouseEntered(MouseEvent e) <br >mouseExited(MouseEvent e) <br> mousePressed(MouseEvent e) <br >mouseReleased(MouseEvent e)|
| WindowListener |windowActivated(WindowEvent) <br> windowClosed(WindowEvent)<br> windowClosing(WindowEvent) <br> windowDeactivated(WindowEvent)|
| AdjusmentListener | adjustmentValueChanged(AdjustementEvent e)|
| ComponentListener |componentHidden(ComponentEvent e) <br> componentMoved(ComponentEvent e) <br> componentResized(ComponentEvent e) <br> componentShown(ComponentEvent e)|
| ContainerListener | componentAdded(ContainerEvent e) <br >componentRemoved(ContainerEvent e) |
| ItemListener | itemStateChanged(ItemEvent e) |
| MouseMotionListener | mouseDragged(MouseEvent e) <br> mouseMoved(MouseEvent e) |
| TextListener | textValueChanged(TextEvent e) |