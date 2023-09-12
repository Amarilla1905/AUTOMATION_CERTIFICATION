package co.com.bancolombia.certification.utils.reader;

import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static co.com.bancolombia.certification.models.enums.ManagementCSV.COLUMN_ID;

public class PropsCsv {

    private PropsCsv() { }

    public static List<Map<String, String>> getDataCsv(String nombreCSV, String columnId) throws IOException {
        TestDataSource testData = new CSVTestDataSource("src/test/resources/datadriven/" + nombreCSV + ".csv", ';');
        return convertirDataCsvLista(testData, columnId);
    }

    public static List<Map<String, String>> convertirDataCsvLista(TestDataSource dataPrueba, String columnId) {
        List<Map<String, String>> dataCargada = dataPrueba.getData();
        if ("".equals(columnId)) {
            return dataCargada;
        }
        String[] arrayDatosParaFiltrar = columnId.split(",");
        return filtrarDataCSV(arrayDatosParaFiltrar, dataCargada);
    }

    public static List<Map<String, String>> filtrarDataCSV(String[] array, List<Map<String, String>> dataCargada) {
        return dataCargada.stream().filter(fila -> inArray(array, fila.get(COLUMN_ID.getManagementTypeData()))).collect(Collectors.toList());
    }

    public static boolean inArray(String[] arr, String item) {
        if (arr.length > 0) {
            for (String n : arr) {
                if (item.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Map<String, String> getDataCsvMap(String nombreCSV, String columnId) throws IOException {
        return getDataCsv(nombreCSV, columnId).get(0);
    }
}