import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.VerticalAlignment;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;

import java.awt.*;
import java.sql.*;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;

public class DynamicReport {
    public DynamicReport() {
        build();
    }
    private void build()
    {
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldCenteredStyle = stl.style(boldStyle).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
        StyleBuilder centerStyle = stl.style().setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
        StyleBuilder fontStyle = stl.style().setFontName("Times New Roman").setFontSize(12);
        StyleBuilder columnStyle = stl.style(centerStyle).setBorder(stl.pen1Point());
        StyleBuilder titleStyle = stl.style(centerStyle).setFontName("Times New Roman").setFontSize(26).
                setForegroundColor(Color.red);

        try {
            report()
                    .columns(
                            col.column("ID","ID",type.integerType()).setStyle(fontStyle).setStyle(columnStyle),
                            col.column("Country","Country",type.stringType()).setStyle(fontStyle).setStyle(columnStyle),
                            col.column("Data","HData",type.stringType()).setStyle(fontStyle).setStyle(columnStyle),
                            col.column("Name","HName",type.stringType()).setStyle(fontStyle).setStyle(columnStyle))
                            .setColumnTitleStyle(columnStyle)
                            .title(cmp.text("Holidays").setStyle(boldCenteredStyle).setStyle(titleStyle)) // shows report title
                            .pageFooter(cmp.pageXofY())// shows number of page at page footer
                            .setDataSource(createDataSource()) // set datasource
                            .show();

        }
        catch (DRException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    private JRDataSource createDataSource() throws ClassNotFoundException, SQLException {
        DRDataSource dataSource = new DRDataSource("ID","Country","HData","HName");
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jasper?useUnicode=true" +
                        "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root", "MikoBoy");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT ID, Country, HData, HName FROM holydays where year(HData) = '2021'");
        while (resultSet.next())
        {
            dataSource.add(resultSet.getInt("ID"),resultSet.getString("Country"),
                    resultSet.getString("HData"),resultSet.getString("HName"));
        }
        return dataSource;
    }

    public static void main(String[] args) throws DRException, SQLException, ClassNotFoundException {
        new DynamicReport();
    }
}
