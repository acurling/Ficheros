

package ficheros;

import java.io.*;
import javax.swing.JOptionPane;



public class usuarios {
    
    String nombre = ""; 
    String Clave = "";
    public void guardararchivo()
    {
        
        FileWriter  archivo = null; // Filwriter para la creacion del archivo
        PrintWriter pw = null;     // PrintWriter para salvar en el archivo
        
        
        try {
            archivo = new FileWriter("C:\\Proyecto\\usuarios\\" + nombre + ".txt" );
             pw = new PrintWriter(archivo);
                pw.println(nombre);
                pw.println(Clave);
        
             JOptionPane.showMessageDialog(null, "Archivo guardado");
        } catch (Exception e) {
           e.printStackTrace();
        } 
        finally
        {
            try {
                if(null != archivo)
                    archivo.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
    
    }
    
    
    public void LeerArchivo()
    {
        File archivo = null;
FileReader fr = null;
BufferedReader br = null;



try {
// Apertura del fichero y creacion de BufferedReader para poder
// hacer una lectura comoda (disponer del metodo readLine()).
archivo = new File ("C:\\/Proyecto/usuarios/" +  nombre + ".txt");
fr = new FileReader (archivo);
br = new BufferedReader(fr);



// Lectura del fichero
String linea;
while((linea=br.readLine())!=null)
 JOptionPane.showMessageDialog(null, linea);
}
catch(Exception e){
e.printStackTrace();
}finally{
// En el finally cerramos el fichero, para asegurarnos
// que se cierra tanto si todo va bien como si salta
// una excepcion.
try{
if( null != fr ){
fr.close();
}
}catch (Exception e2){
e2.printStackTrace();
}
}
    
    }
    
}
