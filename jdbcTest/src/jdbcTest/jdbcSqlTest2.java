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
		JFreeChart barChart = ChartFactory.createBarChart(chartTitle, "��������", "2030������", createDataset(), PlotOrientation.VERTICAL, true, true, false);//��ǥ�� x��� y���� �̸� ����
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367)); // ũ�⼳��
		setContentPane(chartPanel);
	}
	private CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		Connection conn =null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			String query =//����� ���������� 2030 ���� ����
			"SELECT * FROM"
					+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3) AS \"��������\", COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'��',5))||'%' THEN 1 END) AS \"2030������\" "
					+ "FROM CUSTOMER "
					+ "WHERE ADDRESS1 LIKE '���� %' "
							+ "AND GENDER='F' "
							+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
							+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
					+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3)) "
					+ "ORDER BY \"2030������\"";
			
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);//���� ��ü ����
			rs = pstm.executeQuery();//����
			
			while(rs.next()) {
				System.out.println("����� �������� : " + rs.getString("��������"));
				System.out.println("2030������ : " + rs.getInt("2030������"));
				dataset.addValue(rs.getInt("2030������"), rs.getString("��������"), rs.getString("��������"));
				//��ǥ�� 2030�������� ���� ����, ����׷��� "��������", ����׷����� �� "��������"
			}
				
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return dataset;
	}
	
	public static void main(String args[]){
		jdbcSqlTest2 chart = new jdbcSqlTest2("2030������", "���� ��� 2030���������� ���� ����?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
	}

}
