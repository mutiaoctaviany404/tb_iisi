package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel2").vw.setLeft((int)(0d));
views.get("panel2").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel2").vw.setTop((int)(0d));
views.get("panel2").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel3").vw.setLeft((int)(0d));
views.get("panel3").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel3").vw.setTop((int)(0d));
views.get("panel3").vw.setHeight((int)((10d / 100 * height) - (0d)));
views.get("imageview1").vw.setLeft((int)((10d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((21d / 100 * width) - ((10d / 100 * width))));
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((8d / 100 * height) - ((2d / 100 * height))));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - ((2d / 100 * height))));
views.get("label1").vw.setLeft((int)((24d / 100 * width)));
views.get("label1").vw.setWidth((int)((85d / 100 * width) - ((24d / 100 * width))));
views.get("panel4").vw.setLeft((int)(0d));
views.get("panel4").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel4").vw.setTop((int)((10d / 100 * height)));
views.get("panel4").vw.setHeight((int)((88d / 100 * height) - ((10d / 100 * height))));
views.get("imageview2").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview2").vw.setWidth((int)((29d / 100 * width) - ((5d / 100 * width))));
views.get("imageview2").vw.setTop((int)((2d / 100 * height)));
views.get("imageview2").vw.setHeight((int)((19d / 100 * height) - ((2d / 100 * height))));
views.get("label2").vw.setLeft((int)((33d / 100 * width)));
views.get("label2").vw.setWidth((int)((90d / 100 * width) - ((33d / 100 * width))));
views.get("label2").vw.setTop((int)((2d / 100 * height)));
views.get("label2").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
views.get("label3").vw.setLeft((int)((33d / 100 * width)));
views.get("label3").vw.setWidth((int)((99d / 100 * width) - ((33d / 100 * width))));
views.get("label3").vw.setTop((int)((11d / 100 * height)));
views.get("label3").vw.setHeight((int)((22d / 100 * height) - ((11d / 100 * height))));
views.get("imageview3").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview3").vw.setWidth((int)((25d / 100 * width) - ((5d / 100 * width))));
views.get("imageview3").vw.setTop((int)((25d / 100 * height)));
views.get("imageview3").vw.setHeight((int)((35d / 100 * height) - ((25d / 100 * height))));
views.get("label4").vw.setLeft((int)((29d / 100 * width)));
views.get("label4").vw.setWidth((int)((90d / 100 * width) - ((29d / 100 * width))));
views.get("label4").vw.setTop((int)((25d / 100 * height)));
views.get("label4").vw.setHeight((int)((34d / 100 * height) - ((25d / 100 * height))));
views.get("imageview4").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview4").vw.setWidth((int)((25d / 100 * width) - ((5d / 100 * width))));
views.get("imageview4").vw.setTop((int)((35d / 100 * height)));
views.get("imageview4").vw.setHeight((int)((45d / 100 * height) - ((35d / 100 * height))));
views.get("label5").vw.setLeft((int)((29d / 100 * width)));
views.get("label5").vw.setWidth((int)((90d / 100 * width) - ((29d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="Label5.SetTopAndBottom(35%y,45%y)"[home/320x480,scale=1]
views.get("label5").vw.setTop((int)((35d / 100 * height)));
views.get("label5").vw.setHeight((int)((45d / 100 * height) - ((35d / 100 * height))));
//BA.debugLineNum = 31;BA.debugLine="ImageView5.SetLeftAndRight(5%x,25%x)"[home/320x480,scale=1]
views.get("imageview5").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview5").vw.setWidth((int)((25d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="ImageView5.SetTopAndBottom(45%y,55%y)"[home/320x480,scale=1]
views.get("imageview5").vw.setTop((int)((45d / 100 * height)));
views.get("imageview5").vw.setHeight((int)((55d / 100 * height) - ((45d / 100 * height))));
//BA.debugLineNum = 33;BA.debugLine="Label6.SetLeftAndRight(29%x,90%x)"[home/320x480,scale=1]
views.get("label6").vw.setLeft((int)((29d / 100 * width)));
views.get("label6").vw.setWidth((int)((90d / 100 * width) - ((29d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="Label6.SetTopAndBottom(45%y,55%y)"[home/320x480,scale=1]
views.get("label6").vw.setTop((int)((45d / 100 * height)));
views.get("label6").vw.setHeight((int)((55d / 100 * height) - ((45d / 100 * height))));
//BA.debugLineNum = 35;BA.debugLine="ImageView6.SetLeftAndRight(5%x,25%x)"[home/320x480,scale=1]
views.get("imageview6").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview6").vw.setWidth((int)((25d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="ImageView6.SetTopAndBottom(55%y,65%y)"[home/320x480,scale=1]
views.get("imageview6").vw.setTop((int)((55d / 100 * height)));
views.get("imageview6").vw.setHeight((int)((65d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 37;BA.debugLine="Label7.SetLeftAndRight(29%x,90%x)"[home/320x480,scale=1]
views.get("label7").vw.setLeft((int)((29d / 100 * width)));
views.get("label7").vw.setWidth((int)((90d / 100 * width) - ((29d / 100 * width))));
//BA.debugLineNum = 38;BA.debugLine="Label7.SetTopAndBottom(55%y,65%y)"[home/320x480,scale=1]
views.get("label7").vw.setTop((int)((55d / 100 * height)));
views.get("label7").vw.setHeight((int)((65d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 40;BA.debugLine="Panel5.SetLeftAndRight(0,100%x)"[home/320x480,scale=1]
views.get("panel5").vw.setLeft((int)(0d));
views.get("panel5").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 41;BA.debugLine="Panel5.SetTopAndBottom(87%y,88%y)"[home/320x480,scale=1]
views.get("panel5").vw.setTop((int)((87d / 100 * height)));
views.get("panel5").vw.setHeight((int)((88d / 100 * height) - ((87d / 100 * height))));
//BA.debugLineNum = 44;BA.debugLine="Panel1.SetLeftAndRight(0,100%x)"[home/320x480,scale=1]
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 45;BA.debugLine="Panel1.SetTopAndBottom(88%y,100%y)"[home/320x480,scale=1]
views.get("panel1").vw.setTop((int)((88d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - ((88d / 100 * height))));
//BA.debugLineNum = 46;BA.debugLine="Button1.SetLeftAndRight(5%x,20%x)"[home/320x480,scale=1]
views.get("button1").vw.setLeft((int)((5d / 100 * width)));
views.get("button1").vw.setWidth((int)((20d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 47;BA.debugLine="Button1.SetTopAndBottom(2%y,10%y)"[home/320x480,scale=1]
views.get("button1").vw.setTop((int)((2d / 100 * height)));
views.get("button1").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 48;BA.debugLine="Button2.SetLeftAndRight(30%x,45%x)"[home/320x480,scale=1]
views.get("button2").vw.setLeft((int)((30d / 100 * width)));
views.get("button2").vw.setWidth((int)((45d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 49;BA.debugLine="Button2.SetTopAndBottom(2%y,10%y)"[home/320x480,scale=1]
views.get("button2").vw.setTop((int)((2d / 100 * height)));
views.get("button2").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 50;BA.debugLine="Button3.SetLeftAndRight(55%x,70%x)"[home/320x480,scale=1]
views.get("button3").vw.setLeft((int)((55d / 100 * width)));
views.get("button3").vw.setWidth((int)((70d / 100 * width) - ((55d / 100 * width))));
//BA.debugLineNum = 51;BA.debugLine="Button3.SetTopAndBottom(2%y,10%y)"[home/320x480,scale=1]
views.get("button3").vw.setTop((int)((2d / 100 * height)));
views.get("button3").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
//BA.debugLineNum = 52;BA.debugLine="Button4.SetLeftAndRight(80%x,95%x)"[home/320x480,scale=1]
views.get("button4").vw.setLeft((int)((80d / 100 * width)));
views.get("button4").vw.setWidth((int)((95d / 100 * width) - ((80d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="Button4.SetTopAndBottom(2%y,10%y)"[home/320x480,scale=1]
views.get("button4").vw.setTop((int)((2d / 100 * height)));
views.get("button4").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);

}
}