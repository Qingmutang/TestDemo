package tony.test.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		// 获取数据
		List<Map<String, String>> list = null;

		// excel标题
		String[] title = { "名称", "性别", "年龄", "学校", "班级" };

		// excel文件名
		String fileName = "学生信息表" + System.currentTimeMillis() + ".xls";

        //sheet名
		String sheetName = "学生信息表";
		
		String[][] content = {{"1","2","3"},{"a","b"},{"c"}};

		HSSFWorkbook wb = ExcelUtils.getHSSFWorkbook(sheetName, title, content, null);
       
		try {
			String path = "/Users/dasouche/Documents/aa.xls";
			File file = new File(path);
			
			FileOutputStream outputStream = new FileOutputStream(file);
			wb.write(outputStream); 
			outputStream.flush();
			outputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
