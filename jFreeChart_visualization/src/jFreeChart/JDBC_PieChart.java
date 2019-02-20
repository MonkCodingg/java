package jFreeChart;

import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class JDBC_PieChart extends JFrame {

	private static final long serialVersionUID = 1L;

	public JDBC_PieChart(String title) throws ClassNotFoundException, SQLException, IOException {
		super(title);

		// Create dataset
		PieDataset dataset = createDataset();

		// Create chart
		JFreeChart chart = ChartFactory.createPieChart("����� ���������� \n 2030������ �����", dataset, true, true, false);
		chart.getTitle().setFont(new Font("����", Font.BOLD, 16));
		chart.getLegend().setItemFont(new Font("����", Font.PLAIN, 13));

		// Format Label
		PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} : ({2})",
				new DecimalFormat("0"), new DecimalFormat("0%"));

		PiePlot pPlot = (PiePlot) chart.getPlot();
		pPlot.setLabelFont(new Font("����", Font.PLAIN, 13));
		pPlot.setLabelGenerator(labelGenerator);

		// Create Panel
		ChartPanel panel = new ChartPanel(chart);
		setContentPane(panel);
	}

	public PieDataset createDataset() throws ClassNotFoundException, SQLException, IOException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("���� ����");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		String url = "jdbc:oracle:thin:@192.168.26.72:1521/DCSWCDB";
		// ��������:oracle:����̹�Ÿ��:@ȣ��Ʈ:��Ʈ��ȣ:SID
		// url�� DBMS�縶�� �ٸ���.
		String user = "DCSW15";
		String password = "CD15";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("DB�����");
		Statement stmt = conn.createStatement();

		// 4. SQL�� �ۼ�
		String sql = "SELECT * FROM"
				+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3) AS \"��������\", "
				+ "COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'��',5))||'%' THEN 1 END) AS \"2030������\" "
				+ "FROM CUSTOMER " 
				+ "WHERE ADDRESS1 LIKE '���� %' " 
				+ "AND GENDER='F' "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
				+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3)) " 
				+ "ORDER BY \"2030������\"";

		// 5. sql���� DB�� ����(����)
		ResultSet rset = stmt.executeQuery(sql); // ��� ���̺� ��ȯ

		DefaultPieDataset dataset = new DefaultPieDataset();
		while (rset.next()) {
			dataset.setValue(rset.getString("��������"), rset.getInt("2030������"));
		}
		rset.close();
		stmt.close();
		conn.close();

		return dataset;

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JDBC_PieChart example;
			try {
				example = new JDBC_PieChart("JDBC �ð�ȭ 2");
				example.setSize(800, 400);
				example.setLocationRelativeTo(null);
				example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				example.setVisible(true);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			}

		});
	}

}
