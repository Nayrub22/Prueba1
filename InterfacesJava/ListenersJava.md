# Eventos e Interfaces De Escucha Java

| **Interface** | **Descripcion** | **Metodos** |
| ------------- | ------------- |------------- |
| ActionListener | Eventos del usuario en la interfaz (Click en botón, seleccionar elemento de lista/ opción de menú | actionPerformed(ActionEvent e)  |
| KeyListener  | Entrada desde el teclado | keyPressed(KeyEvent e)<br> keyReleased(KeyEvent e) <br> keyTyped(KeyEvent e)|
| FocusListener | Se genera cuando un elemento gana o pierde el foco | focusGained(FocusEvent e) <br> focusLost(FocusEvent e) |
| MouseListener | Mover puntero del raton, o que el puntero entre/salga de un componente, presionar/liberar botón) | mouseClicked(MouseEvent e) <br> mouseEntered(MouseEvent e) <br >mouseExited(MouseEvent e) <br> mousePressed(MouseEvent e) <br >mouseReleased(MouseEvent e)|
| WindowListener | Activar/Desactivar ventana, cerrarla, minimizar, maximizar |windowActivated(WindowEvent) <br> windowClosed(WindowEvent)<br> windowClosing(WindowEvent) <br> windowDeactivated(WindowEvent)|
| AdjusmentListener | Invocado cuando el valor del ajustable ha cambiado.
 | adjustmentValueChanged(AdjustementEvent e)|
| ComponentListener | Cuando cambia el tamaño, la ubicación o la visibilidad del componente, se invoca el método correspondiente en el objeto de escucha |componentHidden(ComponentEvent e) <br> componentMoved(ComponentEvent e) <br> componentResized(ComponentEvent e) <br> componentShown(ComponentEvent e)|
| ContainerListener | Cuando el contenido del contenedor cambia porque se ha agregado o quitado un componente, se invoca el método correspondiente en el objeto de escucha | componentAdded(ContainerEvent e) <br >componentRemoved(ContainerEvent e) |
| ItemListener | Cuando se produce un evento de selección de elementos | itemStateChanged(ItemEvent e) |
| MouseMotionListener | Se genera un evento de movimiento del ratón cuando se mueve o arrastra el ratón | mouseDragged(MouseEvent e) <br> mouseMoved(MouseEvent e) |
| TextListener | Cambiar el valor de un campo de texto | textValueChanged(TextEvent e) |

