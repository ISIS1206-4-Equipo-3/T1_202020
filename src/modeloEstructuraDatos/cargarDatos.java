package modeloEstructuraDatos;

import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;



public class cargarDatos <T extends Comparable<T>>{

    private FileReader archivoPrincipal;
    private CSVReader lectorPrincipal;

    private FileReader archivoSecundario;
    private CSVReader lectorSecundario;

    private Object[] informaciónPrincipal;
    
    public cargarDatos(String pRutaPrincipal, String pRutaSecundaria) {
        try {

            archivoPrincipal = new FileReader(pRutaPrincipal);
            archivoSecundario = new FileReader(pRutaSecundaria);
            lectorSecundario = new CSVReader (archivoSecundario);
            lectorPrincipal = new CSVReader (archivoPrincipal);
            String [] nextline;
            ArregloDinamico arregloConDatos = new ArregloDinamico<Comparable<T>>(1000);
         
            while((nextline = lectorPrincipal.readNext())!=null) {
                if(nextline != null) {
                	arregloConDatos.agregar(nextline);
                	++contadorDatos;
                    System.out.println(Arrays.deepToString(nextline));
                }
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}