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
		ChartFrame frame1 = new ChartFrame("서울 2030대 여성 고객 분포", chart);
		frame1.setSize(800, 400);
		frame1.setVisible(true);

	}

	public JFreeChart getChart() throws ClassNotFoundException, SQLException, IOException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("연결 성공");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		String url = "jdbc:oracle:thin:@192.168.26.72:1521/DCSWCDB";
		// 프로토콜:oracle:드라이버타입:@호스트:포트번호:SID
		// url은 DBMS사마다 다르다.
		String user = "DCSW15";
		String password = "CD15";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결됨");
		Statement stmt = conn.createStatement();

		// 4. SQL문 작성
		String sql = "SELECT * FROM"
				+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3) AS \"행정구역\", "
				+ "COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'구',5))||'%' THEN 1 END) AS \"2030여성수\" "
				+ "FROM CUSTOMER " 
				+ "WHERE ADDRESS1 LIKE '서울 %' " 
				+ "AND GENDER='F' "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
				+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3)) " 
				+ "ORDER BY \"2030여성수\"";

		// 5. sql문을 DB에 전송(실행)
		ResultSet rset = stmt.executeQuery(sql); // 결과 테이블 반환

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		while (rset.next()) {
			dataset.addValue(rset.getInt("2030여성수"), rset.getString("행정구역"), rset.getString("행정구역"));
		}

		rset.close();
		stmt.close();
		conn.close();

		final BarRenderer renderer = new BarRenderer();

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
		final ItemLabelPosition p_center = new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER);

		Font font = new Font("굴림", Font.BOLD, 8);
		Font axisFont = new Font("굴림", Font.PLAIN, 8);

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
		plot.getRangeAxis().setLabel("명");
		plot.getRangeAxis().setRange(3000, 16000);
		plot.getDomainAxis().setLabelFont(new Font("굴림", Font.BOLD, 8));
		plot.getDomainAxis().setTickLabelFont(new Font("굴림", Font.PLAIN, 8));

		final JFreeChart chart = new JFreeChart(plot);

		return chart;
	}
}
