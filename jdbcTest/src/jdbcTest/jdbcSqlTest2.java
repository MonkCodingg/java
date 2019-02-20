package jdbcTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import javafx.scene.chart.BarChart;


public class jdbcSqlTest2 extends ApplicationFrame {
	
	public jdbcSqlTest2(String applicationTitle, String chartTitle) {
		super(applicationTitle);
		JFreeChart barChart = ChartFactory.createBarChart(chartTitle, "행정구역", "2030여성수", createDataset(), PlotOrientation.VERTICAL, true, true, false);//도표의 x축과 y축의 이름 설정
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367)); // 크기설정
		setContentPane(chartPanel);
	}
	private CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		Connection conn =null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			String query =//서울시 행정구역별 2030 여성 고객수
			"SELECT * FROM"
					+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3) AS \"행정구역\", COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'구',5))||'%' THEN 1 END) AS \"2030여성수\" "
					+ "FROM CUSTOMER "
					+ "WHERE ADDRESS1 LIKE '서울 %' "
							+ "AND GENDER='F' "
							+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
							+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
					+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3)) "
					+ "ORDER BY \"2030여성수\"";
			
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);//전송 객체 생성
			rs = pstm.executeQuery();//전송
			
			while(rs.next()) {
				System.out.println("서울시 행정구역 : " + rs.getString("행정구역"));
				System.out.println("2030여성수 : " + rs.getInt("2030여성수"));
				dataset.addValue(rs.getInt("2030여성수"), rs.getString("행정구역"), rs.getString("행정구역"));
				//도표에 2030여성수의 값을 대입, 막대그래프 "행정구역", 막대그래프의 값 "행정구역"
			}
				
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return dataset;
	}
	
	public static void main(String args[]){
		jdbcSqlTest2 chart = new jdbcSqlTest2("2030여성수", "서울 어디가 2030여성고객수가 가장 많나?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
	}

}
