import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

  public class Reposicion1 extends JPanel{


      public void paintComponent(Graphics g){
        //primero intentare dividir en secciones, con dos lineas
        super.paintComponent(g);

        Random aleatorios=new Random();
        int anchura=getWidth();
        int altura=getHeight();
    //    int centro=anchura/2
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=1;
        int num7=0;
        int num8=1;
        int num9=0;
        int num10=1;
        int num11=0;
        int num12=1;
        int num13=1;
        int num14=0;
        int num15=0;
        int num16=1;

        //DELIMITAMOS LAS CUATRO SECCIONES :) DEL PLANO
        g.drawLine(0,altura/2,anchura,altura/2);
        g.drawLine(anchura/2,0,anchura/2,altura);
        //··············

        //REALIZARE 4 CICLOS while
        //AQUI SE ENCUENTRA LA 1/2 del PRIMER CUADRANTE..
        while(num1<=29 & num2<=30){
          int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);
        g.drawLine(0,(altura/2*num1/30),(anchura/2*num2/30),altura/2);
        num1+=1;
          num2+=1;
        }

        //AQUI SE ENCUENTRA LA 2/2 DEL PRIMER CUADRANTE

        while(num3<=29 & num4<=30){
          int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);

 g.drawLine((anchura/2*num3/30),0,anchura/2,(altura/2*num4/30));


          num3+=1;
          num4+=1;
        }

    while (num5<=29 & num6<=30) {
      int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);

//      g.drawLine(anchura,(altura/2*num5/30),(anchura*num6/30),altura/2);// LA MEJOR

      //  g.drawLine(anchura,altura/2,(anchura/2*num6/30),altura/2); // LA MEJOR
//      g.drawLine(anchura,(altura/2*num5/30),(anchura/2),(altura/2*num6/30));
          g.drawLine(anchura/2,(altura/2*num5/30)+altura/2,(anchura/2*num6/30)+anchura/2,altura);
      num5+=1;
      num6+=1;

    }
      while(num7<=29 & num8<=30){
        int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);

//PENDIENTE

    //    g.drawLine((anchura/2*num7/30)+anchura/2,0,anchura,(altura/2*num8/30));
    g.drawLine((anchura/2*num7/30)+anchura/2, altura/2, anchura, (altura/2*num8/30)+altura/2);





// g.drawLine((anchura/2*num3/30),0,anchura/2,(altura/2*num4/30));
        num7+=1;
        num8+=1;


      }


     while(num9<=29 & num10<=30){
       int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);
//AQUI TENDRE QUE CAMIBAR EL VALOR DE NUM10 Y NUM9 PARA EVITAR LA DIVISION

        g.drawLine(0, (altura-(altura/2*num9/30)), (anchura/2*num10/30), altura/2);

        num9+=1;
        num10+=1;


      }

      while(num11<=29 & num12<=30){
        int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);
//DE IGUAL MANERA CAMBIAR EL VALOR DE NUM12
        g.drawLine(anchura/2, altura-(altura/2*num11/30), (anchura/2*num12/30), altura);

        num11+=1;
        num12+=1;


      }

      while (num13<=29 & num14<=30) {
        int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);

        g.drawLine(anchura, (altura/2*num13/30), anchura-(anchura/2*num14/30), altura/2);

        num13+=1;
        num14+=1;

      }


      while (num15<=29 & num16<=30) {
        int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);
g.drawLine(anchura/2, (altura/2*num15/30), anchura-(anchura/2*num16/30), 0);
  num15+=1;
  num16+=1;

      }







      }


   }
