package designPatterns.structural.facade;

import java.sql.Connection;

public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName = "Employee";

        Connection connection = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, connection);

        Connection connection1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, connection);

        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
    }
}
