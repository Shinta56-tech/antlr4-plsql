package app;

import java.awt.FileDialog;
import java.awt.Frame;

public class AntlrTestRigGui {

	/*
	 * テキストファイルを選択して解析ツリーを表示する
	 */
	public static void main(String[] args) throws Exception {
		
		/*
		 * テキストファイル選択ダイアログ
		 */
		
		// 選択ダイアログを生成→表示
		FileDialog fileDialog = new FileDialog(new Frame());
		fileDialog.setTitle("PLSQLファイルを解析");
		fileDialog.setVisible(true);
		
		// 選択ファイル絶対パスを取得する
		String selectFilePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		
		/*
		 * 解析ツリー表示
		 */
		
		String[] argsTestRig = {"parser.PlSql", "sql_script", selectFilePath, "-gui"};
		org.antlr.v4.gui.TestRig.main(argsTestRig);
	}

}
