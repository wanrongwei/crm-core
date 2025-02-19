package com.asiainfo.crm.cm.ln.common.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class cmLnFile {

	private static final Log log = LogFactory.getLog(cmLnFile.class);

	// 测试
	public static void main(String[] args) throws Exception {

		getTest();
		// 测试
		/*
		 * public static void main(String[] args) throws Exception {
		 * FileOutputStream fos = new FileOutputStream("c:\\test.xls");
		 * HSSFWorkbook wb = new HSSFWorkbook();
		 * HSSFSheet s = wb.createSheet();
		 * wb.setSheetName(0, "first sheet");
		 * HSSFRow row = s.createRow(0);
		 * short len=0;
		 * HSSFCell cell = row.createCell(len);
		 * cell.setCellValue("Hello! This message is generated from POI.");
		 * wb.write(fos);
		 * fos.close();
		 * HttpServletResponse response=Response;
		 * OutputStream os = response.getOutputStream();// 取得输出流
		 * WritableWorkbook wbook = Workbook.createWorkbook(os); // 建立excel文件
		 * String tmptitle = ""; // 标题
		 * WritableSheet wsheet = wbook.createSheet(tmptitle, 0); // sheet名称
		 * // 开始生成主体内容
		 * wsheet.addCell(new Label(0, 0, "编号"));
		 * wsheet.addCell(new Label(1, 0, "状态"));
		 * wsheet.setColumnView(1,26);//设置宽度
		 * wsheet.addCell(new Label(2, 0,"名称"));
		 * for (int i = 0; i < 2; i++) {
		 * wsheet.addCell(new Label(0, i + 1,"1000"));
		 * wsheet.addCell(new Label(1, i + 1, "U"));
		 * wsheet.addCell(new Label(2, i + 1,"客户"));
		 * }
		 * // 主体内容生成结束
		 * wbook.write(); // 写入文件
		 * wbook.close();
		 * os.close(); // 关闭流
		 * try {
		 * FileOutputStream out = new FileOutputStream("c:\\test.xls");
		 * HSSFWorkbook wb = new HSSFWorkbook();
		 * HSSFSheet s = wb.createSheet();
		 * wb.setSheetName(0, "树形结构");
		 * HSSFRow row = null;
		 * for (int i = 0; i < 2; i++) {
		 * row = s.createRow(i);
		 * row.createCell(Short.valueOf("0")).setCellValue("仿佛反而");
		 * row.createCell(Short.valueOf("1")).setCellValue("中国开发阶段所开发的");
		 * row.createCell(Short.valueOf("2")).setCellValue("然而");
		 * }
		 * wb.write(out);
		 * out.close();
		 * } catch (Exception e) {
		 * }finally{
		 * }
		 * }
		 */

	}

	private static void getTest() throws Exception {
		// 查询task参数表，如果表中配置有数据，则取配置表中的日期
		String fileName = "c://test.csv";
		BufferedWriter bw = null;
		FileOutputStream fs = null;
		OutputStreamWriter osw = null;
		try {
			fs = new FileOutputStream(new File(fileName));
			osw = new OutputStreamWriter(fs, "GBK");
			bw = new BufferedWriter(osw);
			bw.write("Group ID,\tStatus,\tGroup Name");
			bw.newLine();
			for (int i = 1; i <= 10; i++) {
				bw.write("100" + ",\t" + "U" + ",\t" + "China Mobile");
				bw.newLine();
			}
			bw.flush();
		} catch (Exception ex) {
			log.info(ex.getMessage(), ex);
		} finally {
			if (fs != null) {
				try {
					fs.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (osw != null) {
				try {
					osw.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}

	private static void getShetFile() throws IOException {
		FileOutputStream fos = null;
		HSSFWorkbook wb = null;
		try {
			fos = new FileOutputStream("c:\\test.xls");
			wb = new HSSFWorkbook();
			HSSFSheet s = wb.createSheet();
			wb.setSheetName(0, "first sheet");
			HSSFRow row = s.createRow(0);
			short len = 0;
			HSSFCell cell = row.createCell(len);
			cell.setCellValue("Hello! This message is generated from POI.");
			wb.write(fos);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}

	}

	private static void getFile() throws Exception {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("c:\\test.csv");
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet s = wb.createSheet();
			wb.setSheetName(0, "Tree structure");
			HSSFRow row = null;
			for (int i = 0; i < 2; i++) {
				row = s.createRow(i);
				row.createCell(Short.valueOf("0")).setCellValue("If instead");
				row.createCell(Short.valueOf("1")).setCellValue("China developed the development phase");
				row.createCell(Short.valueOf("2")).setCellValue("However");
			}
			wb.write(out);

		} catch (Exception e) {
			log.info(e.getMessage(), e);
		} finally {
			if (out != null) {
				try {
					out.flush();
					out.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}

}
