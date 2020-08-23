package modeloEstructuraDatos;

import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;



public class cargarDatos {

    private FileReader archivoPrincipal;
    private CSVReader lectorPrincipal;

    private FileReader archivoSecundario;
    private CSVReader lectorSecundario;

    public cargarDatos(String pRutaPrincipal, String pRutaSecundaria) {
        try {

            archivoPrincipal = new FileReader(pRutaPrincipal);
            archivoSecundario = new FileReader(pRutaSecundaria);
            lectorSecundario = new CSVReader (archivoSecundario);
            lectorPrincipal = new CSVReader (archivoPrincipal);
            String [] nextline;

            while((nextline = lectorPrincipal.readNext())!=null) {
                if(nextline != null) {
                    System.out.println(Arrays.deepToString(nextline));
                }
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}