package jFreeChart;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

public class JDBC_BarChart {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		JDBC_BarChart demo = new JDBC_BarChart();
		JFreeChart chart = demo.getChart();
		ChartFrame frame1 = new ChartFrame("���� 2030�� ���� �� ����", chart);
		frame1.setSize(800, 400);
		frame1.setVisible(true);

	}

	public JFreeChart getChart() throws ClassNotFoundException, SQLException, IOException {

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

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		while (rset.next()) {
			dataset.addValue(rset.getInt("2030������"), rset.getString("��������"), rset.getString("��������"));
		}

		rset.close();
		stmt.close();
		conn.close();

		final BarRenderer renderer = new BarRenderer();

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
		final ItemLabelPosition p_center = new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER);

		Font font = new Font("����", Font.BOLD, 8);
		Font axisFont = new Font("����", Font.PLAIN, 8);

		renderer.setBaseItemLabelGenerator(generator);
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBasePositiveItemLabelPosition(p_center);
		renderer.setBaseItemLabelFont(font);
		renderer.setSeriesPaint(0, new Color(100, 200, 255));

		final CategoryPlot plot = new CategoryPlot();

		plot.setDataset(dataset);
		plot.setRenderer(renderer);

		plot.setOrientation(PlotOrientation.VERTICAL);
		plot.setRangeGridlinesVisible(true);
		plot.setDomainGridlinesVisible(true);
		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
		plot.setDomainAxis(new CategoryAxis());
		plot.getDomainAxis().setTickLabelFont(axisFont);
		plot.setRangeGridlinePaint(Color.gray);

		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
		plot.setRangeAxis(new NumberAxis());
		plot.getRangeAxis().setLabel("��");
		plot.getRangeAxis().setRange(3000, 16000);
		plot.getDomainAxis().setLabelFont(new Font("����", Font.BOLD, 8));
		plot.getDomainAxis().setTickLabelFont(new Font("����", Font.PLAIN, 8));

		final JFreeChart chart = new JFreeChart(plot);

		return chart;
	}
}
