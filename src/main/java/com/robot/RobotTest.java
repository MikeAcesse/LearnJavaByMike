package com.robot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/17 11:33
 * https://www.cnblogs.com/java-of-hnj/p/5993017.html
 */
public class RobotTest {
	public static void main(String[] args) throws IOException, AWTException, UnsupportedFlavorException {
//		Robot robot = new Robot();
//		//设置Robot产生一个动作后的休眠时间，否则执行过快
//		robot.setAutoDelay(1000);
//		//获取屏幕分辨率
//		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println("屏幕尺寸："+d);
//		//以屏幕的尺寸创建矩形
//		Rectangle screenRect = new Rectangle(d);
//		//截图（截取整个屏幕图片）
//		BufferedImage bufferedImage = robot.createScreenCapture(screenRect);
//		//保存截图
//		File file  = new File("D:\\bat\\pics\\screenRect.png");
//		ImageIO.write(bufferedImage,"png",file);
//
//		//移动鼠标
//		robot.mouseMove(500,500);
//		//点击鼠标
//		System.out.println("单击");
//		robot.mousePress(InputEvent.BUTTON1_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_MASK);
//
//		//鼠标右键
//		System.out.println("右击");
//		robot.mousePress(InputEvent.BUTTON3_MASK);
//		robot.mouseRelease(InputEvent.BUTTON3_MASK);
//
//		//按下ESC,退出右键状态
//		System.out.println("按下ESC");
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
//
//		//滚动鼠标滚轴
//		System.out.println("滚轴");
//		robot.mouseWheel(5);
//		//按下alt+tab（切换桌面窗口）
//		robot.keyPress(KeyEvent.VK_ALT);
//		for (int i = 1; i <=5; i++) {
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//
//		}
//		robot.keyRelease(KeyEvent.VK_ALT);

		String fileName = "C:\\Users\\c0645\\Downloads\\user_ex.csv";
		StringSelection selection = new StringSelection(fileName);
		Clipboard clipboard =Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection,null);
		// 获取剪切板中的内容（文本数据）
		Transferable trandata2 = clipboard.getContents(null);
		if(trandata2 !=null && trandata2.isDataFlavorSupported(DataFlavor.stringFlavor)){
			String value = (String)trandata2.getTransferData(DataFlavor.stringFlavor);
			System.out.println("value = "+value);
		}
		try {
			//新建一个Robot类的对象
			Robot robot = new Robot();
			robot.setAutoDelay(2000);
			//按下Ctrl+V
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			//释放Ctrl+V
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			//点击回车
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
