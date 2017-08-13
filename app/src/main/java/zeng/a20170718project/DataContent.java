package zeng.a20170718project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DataContent extends AppCompatActivity {
    private TextView tvAns;
    private ImageView imgAns;

    private String[][] ans = new String[8][8];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_content);

        setData();

        tvAns = (TextView) findViewById(R.id.tv_Ans);
        imgAns = (ImageView) findViewById(R.id.img_Ans) ;
        Intent intent = getIntent();
        int mon = intent.getIntExtra("mon",1);
        int day = intent.getIntExtra("day",1);

        tvAns.setText(getData(mon,day));
        imgAns.setImageBitmap(getBitMapData(mon,day));

    }
    private void setData() {
        ans[0][0] = "純卦●六世\n乾為天";
        ans[0][1] = "坤土●五世\n澤天夬";
        ans[0][2] = "乾金●三世歸魂\n火天大有";
        ans[0][3] = "坤土●四世\n雷天大壯";
        ans[0][4] = "巽木●一世\n風天小畜";
        ans[0][5] = "坤土●四世遊魂魂\n水天需";
        ans[0][6] = "艮土●二世\n山天大畜";
        ans[0][7] = "坤土●三世\n地天泰";

        ans[1][0] = "艮土●五世\n天澤履";
        ans[1][1] = "純卦●六世\n兌為澤";
        ans[1][2] = "艮土●四世\n火澤睽";
        ans[1][3] = "兌金●三世歸魂\n雷澤歸妹";
        ans[1][4] = "艮土●四世遊魂\n風澤中孚";
        ans[1][5] = "坎水●一世\n水澤節";
        ans[1][6] = "艮土●三世\n山澤損";
        ans[1][7] = "坤土●二世\n地澤臨";

        ans[2][0] = "離火●三世歸魂\n天火同人";
        ans[2][1] = "坎水●四世\n澤火革";
        ans[2][2] = "純卦●六世\n離為火";
        ans[2][3] = "坎水●五世\n雷火豐";
        ans[2][4] = "巽木●二世\n風火家人";
        ans[2][5] = "坎水●三世\n水火既濟";
        ans[2][6] = "艮土●一世\n山火賁";
        ans[2][7] = "坎水●四世遊魂\n地火明夷";

        ans[3][0] = "巽木●四世\n天雷無妄";
        ans[3][1] = "震木●三世歸魂\n澤雷隨";
        ans[3][2] = "巽木●五世\n火雷噬嗑";
        ans[3][3] = "純卦●六世\n震為雷";
        ans[3][4] = "巽木●三世\n風雷益";
        ans[3][5] = "坎水●二世\n水雷屯";
        ans[3][6] = "巽木●四世遊魂\n山雷頤";
        ans[3][7] = "坤土●一世\n地雷復";

        ans[4][0] = "乾金●一世\n天風姤";
        ans[4][1] = "震木●四世遊魂\n澤風大過";
        ans[4][2] = "離火●二世\n火風鼎";
        ans[4][3] = "震木●三世\n雷風恆";
        ans[4][4] = "純卦●六世\n巽為風";
        ans[4][5] = "震木●五世\n水風井";
        ans[4][6] = "巽木●三世歸魂\n山風蠱";
        ans[4][7] = "震木●四世\n地風升";

        ans[5][0] = "離火●四世遊魂\n天水訟";
        ans[5][1] = "兌金●一世\n澤水困";
        ans[5][2] = "離火●三世\n火水未濟";
        ans[5][3] = "震木●二世\n雷水解";
        ans[5][4] = "離火●五世\n風水渙";
        ans[5][5] = "純卦●六世\n坎為水";
        ans[5][6] = "離火●四世\n山水蒙";
        ans[5][7] = "坎水●三世歸魂\n地水師";

        ans[6][0] = "乾金●二世\n天山遯";
        ans[6][1] = "兌金●三世\n澤山咸";
        ans[6][2] = "離火●一世\n火山旅";
        ans[6][3] = "兌金●四世遊魂\n雷山小過";
        ans[6][4] = "艮土●三世歸魂\n風山漸";
        ans[6][5] = "兌金●四世\n水山蹇";
        ans[6][6] = "純卦●六世\n艮為山";
        ans[6][7] = "兌金●五世\n地山謙";

        ans[7][0] = "乾金●三世\n天地否";
        ans[7][1] = "兌金●二世\n澤地萃";
        ans[7][2] = "乾金●四世遊魂\n火地晉";
        ans[7][3] = "震木●一世\n雷地豫";
        ans[7][4] = "乾金●四世\n風地觀";
        ans[7][5] = "坤土●三世歸魂\n水地比";
        ans[7][6] = "乾金●五世\n山地剝";
        ans[7][7] = "純卦●六世\n坤為地";
    }




    private String getData(int m, int d) {
        String tempAns = "查無資訊";
        if (m == 1 || m == 9) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[0][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[0][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[0][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[0][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[0][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[0][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[0][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[0][7];
            }
        } else if (m == 2 || m == 10) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[1][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[1][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[1][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[1][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[1][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[1][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[1][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[1][7];
            }
        } else if (m == 3 || m == 11) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[2][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[2][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[2][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[2][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[2][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[2][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[2][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[2][7];
            }
        } else if (m == 4 || m == 12) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[3][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[3][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[3][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[3][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[3][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[3][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[3][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[3][7];
            }
        } else if (m == 5) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[4][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[4][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[4][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[4][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[4][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[4][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[4][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[4][7];
            }
        } else if (m == 6) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[5][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[5][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[5][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[5][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[5][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[5][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[5][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[5][7];
            }
        } else if (m == 7) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[6][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[6][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[6][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[6][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[6][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[6][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[6][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[6][7];
            }
        } else if (m == 8) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return ans[7][0];
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return ans[7][1];
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return ans[7][2];
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return ans[7][3];
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return ans[7][4];
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return ans[7][5];
            } else if (d == 7 || d == 15 || d == 23) {
                return ans[7][6];
            } else if (d == 8 || d == 16 || d == 24) {
                return ans[7][7];
            }
        }
        return tempAns;
    }
    private Bitmap getBitMapData(int m, int d) {
        if (m == 1 || m == 9) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array00);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array01);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array02);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array03);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array04);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array05);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array06);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array07);
            }
        } else if (m == 2 || m == 10) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array10);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array11);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array12);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array13);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array14);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array15);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array16);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array17);
            }
        } else if (m == 3 || m == 11) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array20);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array21);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array22);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array23);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array24);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array25);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array26);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array27);
            }
        } else if (m == 4 || m == 12) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array30);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array31);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array32);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array33);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array34);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array35);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array36);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array37);
            }
        } else if (m == 5) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array40);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array41);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array42);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array43);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array44);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array45);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array46);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array47);
            }
        } else if (m == 6) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array50);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array51);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array52);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array53);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array54);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array55);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array56);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array57);
            }
        } else if (m == 7) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array60);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array61);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array62);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array63);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array64);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array65);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array66);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array67);
            }
        } else if (m == 8) {
            if (d == 1 || d == 9 || d == 17 || d == 25) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array70);
            } else if (d == 2 || d == 10 || d == 18 || d == 26) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array71);
            } else if (d == 3 || d == 11 || d == 19 || d == 27) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array72);
            } else if (d == 4 || d == 12 || d == 20 || d == 28) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array73);
            } else if (d == 5 || d == 13 || d == 21 || d == 29) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array74);
            } else if (d == 6 || d == 14 || d == 22 || d == 30) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array75);
            } else if (d == 7 || d == 15 || d == 23) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array76);
            } else if (d == 8 || d == 16 || d == 24) {
                return BitmapFactory.decodeResource(getResources(), R.drawable.array77);
            }
        }
        return null;
    }
}
