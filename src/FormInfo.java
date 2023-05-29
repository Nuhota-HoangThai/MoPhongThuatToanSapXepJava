import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class FormInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInfo frame = new FormInfo();
					frame.setVisible(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormInfo() {
		setBounds(100, 100, 322, 257);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new TitledBorder(null, "Thông tin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

		JTextArea txtInfo = new JTextArea();
		txtInfo.setEditable(false);
		txtInfo.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInfo.setBackground(SystemColor.menu);
		txtInfo.setText(
				" Họ và tên: Nguyễn Hoàng Thái \n MSSV: B2012141 \n Lớp: DI2096A1 \n Email: thaib2012141@student.ctu.edu.vn \n HP: Niên luận cơ sở ngành KTPM \n Mã HP: CT239 \n GVDH: Trương Thị Thanh Tuyền \n MSCB: 1068 \n Học kỳ: 2 \n Năm học: 2022 - 2023 ");
		contentPane.add(txtInfo);
	}
}
