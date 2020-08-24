package modeloEstructuraDatos;

import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class cargarDatos <T extends Comparable<T>>{

    private FileReader archivoPrincipal;
    private CSVReader lectorPrincipal;

    private FileReader archivoSecundario;
    private CSVReader lectorSecundario;

    private Object[] informacionPrincipal;
    
    public cargarDatos(String pRutaPrincipal, String pRutaSecundaria) {
        try {

            archivoPrincipal = new FileReader(pRutaPrincipal);
            archivoSecundario = new FileReader(pRutaSecundaria);
            lectorSecundario = new CSVReader (archivoSecundario);
            lectorPrincipal = new CSVReader (archivoPrincipal);
            String [] nextline;
            ArregloDinamico arregloConDatos = new ArregloDinamico<T>(2);
            
            while((nextline = lectorPrincipal.readNext())!=null) {
                if(nextline != null) {
                	ArregloDinamico individual = new ArregloDinamico<T>(5);
                	for(int i = 0; i<nextline.length;i++) {
                		try {
                			int num = Integer.parseInt(nextline[i]);
                			individual.agregar(num);
                		}catch(Exception e){
                			individual.agregar(nextline[i]);
                		}
                	}
                    System.out.println(Arrays.deepToString(nextline));
                }
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}