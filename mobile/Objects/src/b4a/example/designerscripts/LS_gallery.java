package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gallery{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 4;BA.debugLine="Panel2.SetLeftAndRight(0,100%x)"[gallery/320x480,scale=1]
views.get("panel2").vw.setLeft((int)(0d));
views.get("panel2").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 5;BA.debugLine="Panel2.SetTopAndBottom(0,100%y)"[gallery/320x480,scale=1]
views.get("panel2").vw.setTop((int)(0d));
views.get("panel2").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 8;BA.debugLine="Panel3.SetLeftAndRight(0,100%x)"[gallery/320x480,scale=1]
views.get("panel3").vw.setLeft((int)(0d));
views.get("panel3").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 9;BA.debugLine="Panel3.SetTopAndBottom(0,10%y)"[gallery/320x480,scale=1]
views.get("panel3").vw.setTop((int)(0d));
views.get("panel3").vw.setHeight((int)((10d / 100 * height) - (0d)));
//BA.debugLineNum = 11;BA.debugLine="Label1.SetTopAndBottom(2%y,8%y)"[gallery/320x480,scale=1]
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 12;BA.debugLine="Label1.SetLeftAndRight(24%x,85%x)"[gallery/320x480,scale=1]
views.get("label1").vw.setLeft((int)((24d / 100 * width)));
views.get("label1").vw.setWidth((int)((85d / 100 * width) - ((24d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="Panel4.SetLeftAndRight(0,100%x)"[gallery/320x480,scale=1]
views.get("panel4").vw.setLeft((int)(0d));
views.get("panel4").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 16;BA.debugLine="Panel4.SetTopAndBottom(10%y,88%y)"[gallery/320x480,scale=1]
views.get("panel4").vw.setTop((int)((10d / 100 * height)));
views.get("panel4").vw.setHeight((int)((88d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 17;BA.debugLine="Label3.SetLeftAndRight(5%x,95%x)"[gallery/320x480,scale=1]
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="Label3.SetTopAndBottom(1%y,10%y)"[gallery/320x480,scale=1]
views.get("label3").vw.setTop((int)((1d / 100 * height)));
views.get("label3").vw.setHeight((int)((10d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 19;BA.debugLine="ListView1.SetLeftAndRight(5%x,95%x)"[gallery/320x480,scale=1]
views.get("listview1").vw.setLeft((int)((5d / 100 * width)));
views.get("listview1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="ListView1.SetTopAndBottom(25%y,85%y)"[gallery/320x480,scale=1]
views.get("listview1").vw.setTop((int)((25d / 100 * height)));
views.get("listview1").vw.setHeight((int)((85d / 100 * height) - ((25d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="Panel5.SetLeftAndRight(0,100%x)"[gallery/320x480,scale=1]
views.get("panel5").vw.setLeft((int)(0d));
views.get("panel5").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 25;BA.debugLine="Panel5.SetTopAndBottom(87%y,88%y)"[gallery/320x480,scale=1]
views.get("panel5").vw.setTop((int)((87d / 100 * height)));
views.get("panel5").vw.setHeight((int)((88d / 100 * height) - ((87d / 100 * height))));
//BA.debugLineNum = 28;BA.debugLine="Panel1.SetLeftAndRight(0,100%x)"[gallery/320x480,scale=1]
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 29;BA.debugLine="Panel1.SetTopAndBottom(88%y,100%y)"[gallery/320x480,scale=1]
views.get("panel1").vw.setTop((int)((88d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - ((88d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="Button1.SetLeftAndRight(5%x,20%x)"[gallery/320x480,scale=1]
views.get("button1").vw.setLeft((int)((5d / 100 * width)));
views.get("button1").vw.setWidth((int)((20d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="Button1.SetTopAndBottom(2%y,10%y)"[gallery/320x480,scale=1]
views.get("button1").vw.setTop((int)((2d / 100 * height)));
views.get("button1").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 32;BA.debugLine="Button2.SetLeftAndRight(30%x,45%x)"[gallery/320x480,scale=1]
views.get("button2").vw.setLeft((int)((30d / 100 * width)));
views.get("button2").vw.setWidth((int)((45d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="Button2.SetTopAndBottom(2%y,10%y)"[gallery/320x480,scale=1]
views.get("button2").vw.setTop((int)((2d / 100 * height)));
views.get("button2").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 34;BA.debugLine="Button3.SetLeftAndRight(55%x,70%x)"[gallery/320x480,scale=1]
views.get("button3").vw.setLeft((int)((55d / 100 * width)));
views.get("button3").vw.setWidth((int)((70d / 100 * width) - ((55d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="Button3.SetTopAndBottom(2%y,10%y)"[gallery/320x480,scale=1]
views.get("button3").vw.setTop((int)((2d / 100 * height)));
views.get("button3").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 36;BA.debugLine="Button4.SetLeftAndRight(80%x,95%x)"[gallery/320x480,scale=1]
views.get("button4").vw.setLeft((int)((80d / 100 * width)));
views.get("button4").vw.setWidth((int)((95d / 100 * width) - ((80d / 100 * width))));
//BA.debugLineNum = 37;BA.debugLine="Button4.SetTopAndBottom(2%y,10%y)"[gallery/320x480,scale=1]
views.get("button4").vw.setTop((int)((2d / 100 * height)));
views.get("button4").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);

}
}