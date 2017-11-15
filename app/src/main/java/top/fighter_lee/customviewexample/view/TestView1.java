package top.fighter_lee.customviewexample.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author fighter_lee
 * @date 2017/11/15
 */
public class TestView1 extends View {
    public TestView1(Context context) {
        super(context);
    }

    public TestView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float left = getLeft();
        float right = getRight();
        float top = getTop();
        float bottom = getBottom();
        RectF rectF = new RectF(left, top, right, bottom);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF,Typeface.BOLD));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
//        paint.setColor(Color.parseColor("#FF4081"));
        paint.setColor(getResources().getColor(android.R.color.black));
        //画方
//        canvas.drawRect(left,top,right,bottom,paint);
        //画圆
//        canvas.drawCircle(getWidth()/2,getHeight()/2,Math.min(getWidth(),getHeight())/2,paint);
        //画扇形
//        canvas.drawArc(rectF,0,90,false,paint);
        //绘制bitmap
//        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher),right/2,bottom/2,paint);
        //写文字
        for (int i = 0; i < 10; i++) {
            String text = "hello";
            paint.setTextSize(100f);
            float measureText = paint.measureText(text);
            canvas.drawText(text,right/2-measureText/2,bottom/2,paint);
            canvas.translate(0,100);
        }
        invalidate();
        //划线
//        Path p = new Path();
//        p.moveTo(100, 100);
//        p.lineTo(200, 50);
//        p.lineTo(300, 100);
//        p.lineTo(200,400);
//        canvas.drawPath(p,paint);
    }
}
