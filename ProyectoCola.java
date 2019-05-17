
import javax.swing.JOptionPane;


/**
 *
 * @author ALEJANDRA TREJO
 */
public class ProyectoCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0, elemento=0;
        cola colita= new cola();
        do{
            try{ 
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1. Insertar un elemnto en la cola\n"
                + "2. eliminar un elemento de la cola\n"
                +"3. La cola esta vacia?\n"
                + "4. Elemento Ubicado en el inicio de la cola\n"
                +"5 Tamaño de la cola\n"
                +"6. salir", "menu de opciones de una cola", JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1: elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "ingresa el elemento a insertar ", "insertando en la cola", JOptionPane.QUESTION_MESSAGE));
                    colita.insertar(elemento);
 
                    
                       break;
                    case 2:
                       if (!colita.estavacia()){
                           JOptionPane.showMessageDialog(null,"elemento elimiado es:"+colita.quitar(),
                                   "eliminando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);}
                           else {
                                   JOptionPane.showMessageDialog(null, "la cola esta vacia",
                                           "cola vacia",JOptionPane.INFORMATION_MESSAGE);
                          break; }
                          case 3: 
                              if(colita.estavacia())
                                  JOptionPane.showMessageDialog(null, "la cola esta vacia",
                                           "cola vacia",JOptionPane.INFORMATION_MESSAGE);
                              else JOptionPane.showMessageDialog(null, "la cola no esta vacia",
                                           "cola no vacia",JOptionPane.INFORMATION_MESSAGE);
                          break;
                          case 4:
                              if(!colita.estavacia()){
                              JOptionPane.showMessageDialog(null, "elemento ubicado al inicio de la cola es"+colita.inicio,
                                           "cola vacia",JOptionPane.INFORMATION_MESSAGE);}
                              else {
                                  JOptionPane.showMessageDialog(null, "la cola esta vacia",
                                           "cola vacia",JOptionPane.INFORMATION_MESSAGE);
                              }
                       
                         break;
                         case 5:
                             JOptionPane.showMessageDialog(null, "el tamaño de la cola es:"+colita.tamaño,
                                           "cola vacia",JOptionPane.INFORMATION_MESSAGE);
                             break;
                         case 6:
                             JOptionPane.showMessageDialog(null, "programa finalizado",
                                           "fin",JOptionPane.INFORMATION_MESSAGE);
                             break;
                         default:JOptionPane.showMessageDialog(null, "opcion incorrecta",
                                           "vuelva a ingresar correctamente",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "error"  + n.getMessage());
            }
        }while(opcion!=6);
    }
    
}
