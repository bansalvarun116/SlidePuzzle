package com.example.web.puzzletesr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView[][]  a = new ImageView[3][3];
    int[][] address=new int[3][3];
    ImageView blank;
    int addressBlank;

    public void jumble(View view){

        int tempTag,temp;
        int newBlank;
        blank.setImageResource(address[2][2]);
        a[2][2].setImageResource(addressBlank);
        blank.setTag(22);
        a[2][2].setTag(22);
        temp=addressBlank;
        addressBlank=address[2][2];
        address[2][2]=temp;

        int noOfTimesOfShift= new Random().nextInt((45 - 15) + 1) + 15;
        for(int i=0;i<noOfTimesOfShift;i++) {
            newBlank = Integer.parseInt(blank.getTag().toString());
            int random = new Random().nextInt((3) + 1) + 1;
            int any = Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString());

                if (random == 1) {

                    if ((any / 10) > 0) {

                        a[newBlank / 10][newBlank % 10].setImageResource(address[(any / 10) - 1][any % 10]);
                        a[(any / 10) - 1][any % 10].setImageResource(address[newBlank / 10][newBlank % 10]);
                        tempTag = Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString());
                        a[newBlank / 10][newBlank % 10].setTag((tempTag / 10 - 1) * 10 + tempTag % 10);
                        a[(any / 10) - 1][any % 10].setTag(tempTag);
                        temp = address[newBlank / 10][newBlank % 10];
                        address[newBlank / 10][newBlank % 10] = address[(any / 10) - 1][any % 10];
                        address[(any / 10) - 1][any % 10] = temp;
                        blank.setTag(Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString()));


                    }
                }
                if (random == 2) {


                    if ((any / 10) < 2) {

                        a[newBlank / 10][newBlank % 10].setImageResource(address[(any / 10) + 1][any % 10]);
                        a[(any / 10) + 1][any % 10].setImageResource(address[newBlank / 10][newBlank % 10]);
                        tempTag = Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString());
                        a[newBlank / 10][newBlank % 10].setTag((tempTag / 10 + 1) * 10 + tempTag % 10);
                        a[(any / 10) + 1][any % 10].setTag(tempTag);
                        temp = address[newBlank / 10][newBlank % 10];
                        address[newBlank / 10][newBlank % 10] = address[(any / 10) + 1][any % 10];
                        address[(any / 10) + 1][any % 10] = temp;
                        blank.setTag(Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString()));
                    }
                }
                if (random == 3) {

                    if ((any % 10) < 2) {

                        a[newBlank / 10][newBlank % 10].setImageResource(address[any / 10][(any % 10) + 1]);
                        a[any / 10][(any % 10) + 1].setImageResource(address[newBlank / 10][newBlank % 10]);
                        tempTag = Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString());
                        a[newBlank / 10][newBlank % 10].setTag(tempTag + 1);
                        a[any / 10][(any % 10) + 1].setTag(tempTag);
                        temp = address[newBlank / 10][newBlank % 10];
                        address[newBlank / 10][newBlank % 10] = address[any / 10][(any % 10) + 1];
                        address[any / 10][(any % 10) + 1] = temp;
                        blank.setTag(Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString()));


                    }
                }
                if (random == 4) {

                    if ((any % 10) > 0) {

                        a[newBlank / 10][newBlank % 10].setImageResource(address[any / 10][(any % 10) - 1]);
                        a[any / 10][(any % 10) - 1].setImageResource(address[newBlank / 10][newBlank % 10]);
                        tempTag = Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString());
                        a[newBlank / 10][newBlank % 10].setTag(tempTag - 1);
                        a[any / 10][(any % 10) - 1].setTag(tempTag);
                        temp = address[newBlank / 10][newBlank % 10];
                        address[newBlank / 10][newBlank % 10] = address[any / 10][(any % 10) - 1];
                        address[any / 10][(any % 10) - 1] = temp;
                        blank.setTag(Integer.parseInt(a[newBlank / 10][newBlank % 10].getTag().toString()));

                    }
                }






        }




    }



    public void shiftPlay(View view){
        int temp,tempAddress;
        int any=Integer.parseInt(view.getTag().toString());
        if(address[any/10][(any%10)+1]==R.color.colorAccent&&(((any%10)+1)<2))
        {
            a[any/10][any%10].setImageResource(address[any/10][(any%10)+1]);
            a[any/10][(any%10)+1].setImageResource(address[any/10][any%10]);
            temp=Integer.parseInt(a[any/10][any%10].getTag().toString());
            a[any/10][any%10].setTag(Integer.parseInt(a[any/10][(any%10)+1].getTag().toString()));
            a[any/10][(any%10)+1].setTag(temp);
            tempAddress=address[any/10][any%10];
            address[any/10][any%10]=address[any/10][(any%10)+1];
            address[any/10][(any%10)+1]=tempAddress;

        }
        if(address[any/10][(any%10)-1]==R.color.colorAccent&&(((any%10)-1)>0))
        {
            a[any/10][any%10].setImageResource(address[any/10][(any%10)-1]);
            a[any/10][(any%10)-1].setImageResource(address[any/10][any%10]);
            temp=Integer.parseInt(a[any/10][any%10].getTag().toString());
            a[any/10][any%10].setTag(Integer.parseInt(a[any/10][(any%10)-1].getTag().toString()));
            a[any/10][(any%10)-1].setTag(temp);
            tempAddress=address[any/10][any%10];
            address[any/10][any%10]=address[any/10][(any%10)-1];
            address[any/10][(any%10)-1]=tempAddress;


        }
        if(address[(any/10)+1][any%10]==R.color.colorAccent&&(((any/10)+1)<2)){
            a[any/10][any%10].setImageResource(address[(any/10)+1][any%10]);
            a[(any/10)+1][any%10].setImageResource(address[any/10][any%10]);
            temp=Integer.parseInt(a[any/10][any%10].getTag().toString());
            a[any/10][any%10].setTag(Integer.parseInt(a[(any/10)+1][any%10].getTag().toString()));
            a[(any/10)+1][any%10].setTag(temp);
            tempAddress=address[any/10][any%10];
            address[any/10][any%10]=address[(any/10)+1][any%10];
            address[(any/10)+1][any%10]=tempAddress;


        }
        if(address[(any/10)-1][any%10]==R.color.colorAccent&&(((any%10)+1)>0)){
            a[any/10][any%10].setImageResource(address[(any/10)-1][any%10]);
            a[(any/10)-1][any%10].setImageResource(address[any/10][any%10]);
            temp=Integer.parseInt(a[any/10][any%10].getTag().toString());
            a[any/10][any%10].setTag(Integer.parseInt(a[(any/10)-1][any%10].getTag().toString()));
            a[(any/10)-1][any%10].setTag(temp);
            tempAddress=address[any/10][any%10];
            address[any/10][any%10]=address[(any/10)-1][any%10];
            address[(any/10)-1][any%10]=tempAddress;


        }


        if((address[0][0]==R.drawable.game11)&&(address[0][1]==R.drawable.g12)&&( address[0][2]==R.drawable.g13)){
            if((address[1][0]==R.drawable.g21)&&(address[1][1]==R.drawable.g22)&&( address[1][2]==R.drawable.g23)){
                if((address[2][0]==R.drawable.g31)&&(address[2][1]==R.drawable.g32)&&(address[2][2]==R.drawable.g33))
                {
                    Toast.makeText(this,"You Won!!!",Toast.LENGTH_LONG).show();
                }
            }


        }





    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address[0][0]=R.drawable.game11;
        address[0][1]=R.drawable.g12;
        address[0][2]=R.drawable.g13;
        address[1][0]=R.drawable.g21;
        address[1][1]=R.drawable.g22;
        address[1][2]=R.drawable.g23;
        address[2][0]=R.drawable.g31;
        address[2][1]=R.drawable.g32;
        address[2][2]=R.drawable.g33;
        a[0][0]=(ImageView)findViewById(R.id.imageView6);
        a[0][1]=(ImageView)findViewById(R.id.imageView7);
        a[0][2]=(ImageView)findViewById(R.id.imageView8);
        a[1][0]=(ImageView)findViewById(R.id.imageView9);
        a[1][1]=(ImageView)findViewById(R.id.imageView10);
        a[1][2]=(ImageView)findViewById(R.id.imageView11);
        a[2][0]=(ImageView)findViewById(R.id.imageView12);
        a[2][1]=(ImageView)findViewById(R.id.imageView13);
        a[2][2]=(ImageView)findViewById(R.id.imageView14);
        blank=(ImageView)findViewById(R.id.imageView5);


        addressBlank=R.color.colorAccent;

    }
}

